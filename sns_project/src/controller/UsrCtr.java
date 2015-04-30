package controller;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mybatis.CollectionVO;
import mybatis.FriendVO;
import mybatis.KiVO;
import mybatis.PageVO;
import mybatis.UsrVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import dao.FriendDAO;
import dao.UsrDAO;
import encrypt.SeedCipher;

@Controller
@SessionAttributes(value = {"uvo", "friends_list"})
public class UsrCtr {

	@Autowired
	private UsrDAO usrDAO;

	@Autowired
	private FriendDAO friendDao;

	public UsrDAO getUsrDAO() {
		return usrDAO;
	}

	public void setUsrDAO(UsrDAO usrDAO) {
		this.usrDAO = usrDAO;
	}
	
	String key = "password_todaypw";
	SeedCipher seed = new SeedCipher();

	@RequestMapping("join.do")
	public ModelAndView join(UsrVO uvo, String birth_year, String birth_month, String birth_day) throws Exception {

		String encryptPw = Base64.encode(seed.encrypt(uvo.getU_pw(), key.getBytes(), "UTF-8"));

		uvo.setU_pw(encryptPw);
		uvo.setU_birth(birth_year+"-"+birth_month+"-"+birth_day);
		String chk = usrDAO.getJoin(uvo);
		
		ModelAndView mv = new ModelAndView("index");
//		ModelAndView mv = new ModelAndView("join_chk");
		
		mv.addObject("chk", chk);
		mv.addObject("uvo", uvo);
		
		return mv;
	}
	
	@RequestMapping("login.do")
	public ModelAndView login(String u_id, String u_pw) throws Exception {
		ModelAndView mv = new ModelAndView();

		String k = usrDAO.getLeaveCheck(u_id);
		if(k.equals("1")||k.equals("0")){
			int r = usrDAO.getIdCheck(u_id);
			if(r==1){
				String pw = usrDAO.getPw(u_id);
				byte[] encryptbytes = Base64.decode(pw);
				String decryptText = seed.decryptAsString(encryptbytes, key.getBytes(), "UTF-8");
				
				if(u_pw.equals(decryptText.trim())){
					UsrVO uvo2 = usrDAO.getLogin(u_id);
					
					mv.setViewName("redirect:/allList.do");
					mv.addObject("uvo", uvo2);
						
					// 친구 리스트 가져와서 세션에 저장
					List<UsrVO> friends_list = friendDao.getFriend(uvo2.getU_idx());
					mv.addObject("friends_list", friends_list);
				} else{
					mv.setViewName("login_fail");
					mv.addObject("str", "비밀번호가 맞지 않습니다.");
				}
			} else{
				mv.setViewName("login_fail");
				mv.addObject("str", "존재하지 않는 아이디입니다.");
			}
		} else {
			mv.setViewName("login_fail");
			mv.addObject("str", "존재하지 않는 아이디입니다.");
		}

		return mv;
	}

	@RequestMapping("edit.do")
	public ModelAndView goEdit() {
		return new ModelAndView("edit_profile");
	}

	@RequestMapping("edit_profile.do")
	public ModelAndView edit(UsrVO uvo) {
		usrDAO.getEdit(uvo);

		return new ModelAndView("redirect:/allList.do");
	}

	@RequestMapping("profile_image.do")
	public ModelAndView goImage() {
		return new ModelAndView("profile_image");
	}

	@RequestMapping("edit_image.do")
	public ModelAndView editImage(UsrVO uvo, MultipartHttpServletRequest request)
			throws Exception {

		MultipartFile mf = uvo.getReal_image();

		String path = request.getServletContext().getRealPath("/images");
		File f = new File(path, uvo.getU_id());
		if (!f.exists()) {
			f.mkdir();
		}
		path += "\\" + uvo.getU_id();

		uvo.setU_image("images/" + uvo.getU_id() + "/"
				+ mf.getOriginalFilename());

		mf.transferTo(new File(path + "/" + mf.getOriginalFilename()));

		usrDAO.getEditImage(uvo);

		String u_idx = uvo.getU_idx();

		UsrVO uvo2 = usrDAO.getOneUsr(u_idx);

		ModelAndView mv = new ModelAndView("redirect:/allList.do");
		mv.addObject("uvo", uvo2);

		return mv;
	}

	@RequestMapping("logout.do")
	public ModelAndView logout(HttpSession session) {

		session.removeAttribute("uvo");
		session.removeAttribute("friends_list");

		return new ModelAndView("redirect:/index.jsp");
	}
	
	@RequestMapping("oneusr.do")
	public ModelAndView oneUsr(String u_idx,String idx, HttpSession session ) {
				
		
		/*List<FriendVO> f_list = (List<FriendVO>) session.getAttribute("f_list");
		Iterator<FriendVO> it = f_list.iterator();
		while(it.hasNext()){
			FriendVO vo = it.next();
		}*/
		UsrVO f_uvo =  usrDAO.getOneUsr(u_idx);
		
		ModelAndView mv = new ModelAndView("redirect:/friend.do?u_idx"+idx);
		mv.addObject("f_uvo", f_uvo);
		return mv;
	}
	
	@RequestMapping("member_info.do")
	public ModelAndView memberInfo(){
		return new ModelAndView("member_info");
	}
	
	
	@RequestMapping("pw_again.do")
	public ModelAndView pw(String type){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("password_again");
		mv.addObject("type", type);
		
		return mv;
	}
	
	@RequestMapping("go_modify.do")
	public ModelAndView infoModify(String type, String u_id, String u_pw) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		String path = null;
		
		String pw = usrDAO.getPw(u_id);
		byte[] encryptbytes = Base64.decode(pw);
		String decryptText = seed.decryptAsString(encryptbytes, key.getBytes(), "UTF-8");
		
		String msg = null;
		
		if(u_pw.equals(decryptText.trim())){
				switch (type) {
				case "profile":
							path = "edit_profile"; break;
				case "image":
							path = "profile_image"; break;
				case "password":
							path = "edit_password"; break;
				case "leave":
							path = "leave"; break;
				}
		}else{
			path = "password_again";
			msg = "비밀번호가 맞지 않습니다.";
		}
		
		mv.addObject("type", type);
		mv.addObject("msg", msg);
		mv.setViewName(path);
		
		return mv;
	}
	
	@RequestMapping("edit_password.do")
	public ModelAndView editPassword(String u_idx, String new_pw) throws Exception{
		String encryptPw = Base64.encode(seed.encrypt(new_pw, key.getBytes(), "UTF-8"));

		UsrVO uvo = new UsrVO();
		
		uvo.setU_idx(u_idx);
		uvo.setU_pw(encryptPw);
		
		usrDAO.getEditPassword(uvo);
		return new ModelAndView("redirect:/allList.do");
	}
	
	@RequestMapping("leave.do")
	public ModelAndView leave(String u_idx, String u_id, String u_pw,HttpSession session) throws Exception{
		ModelAndView mv = new ModelAndView();
		String msg = null;
		
		String pw = usrDAO.getPw(u_id);
		byte[] encryptbytes = Base64.decode(pw);
		String decryptText = seed.decryptAsString(encryptbytes, key.getBytes(), "UTF-8");
		
		if(u_pw.equals(decryptText.trim())){
			session.removeAttribute("uvo");
			usrDAO.getLeave(u_idx);
			
			return new ModelAndView("leave_complete");
		}else{
			mv.setViewName("leave");
			msg = "비밀번호가 맞지 않습니다.";
		}
		
		mv.addObject("msg",msg);
		
		return mv;
	}
	
	@RequestMapping("admin_user_delete")
	public ModelAndView admin_user_delete(String u_idx){
		usrDAO.getLeave(u_idx);
		return new ModelAndView("redirect:/admin_user.do");
	}
	
	static PageVO pvo = null;
	
	@RequestMapping("admin_user.do")
	public ModelAndView admin_ki(HttpServletRequest request){
		String cPage = request.getParameter("cPage");
		
		pvo = new PageVO();
		pvo.setTotalRecord(usrDAO.getTotalCount()); // 총 게시물의 수 해결
	    pvo.setTotalPage(); // 총 페이지 수 해결
	    
		if(cPage != null){
			pvo.setNowPage(Integer.parseInt(cPage));
		}
		
		 // 현재 페이지의 시작인덱스와 마지막 인덱스 구하기
		pvo.setBeginPerPage((pvo.getNowPage() - 1) * pvo.getNumPerPage() + 1);
		pvo.setEndPerPage((pvo.getBeginPerPage() - 1) + pvo.getNumPerPage());
		
		// 블록의 시작 번호와 블록의 끝번호 구하기
		int startPage = (int)((pvo.getNowPage() - 1) / pvo.getPagePerBlock())
				       * pvo.getPagePerBlock()+1;
		int endPage = startPage + pvo.getPagePerBlock() - 1;
		pvo.setStartPage(startPage);
		pvo.setEndPage(endPage);
	  
		// 주의 사항  endPage가 toatalpage보다 클수 있다.
		if( endPage > pvo.getTotalPage())  {
		 pvo.setEndPage(pvo.getTotalPage());
		}
		// MyBatis를 이용해서 게시물 목록 가져옴
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("begin", pvo.getBeginPerPage());
		map.put("end", pvo.getEndPerPage());
		
		List<UsrVO> list =  usrDAO.getList(map);
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("admin_user");
		mv.addObject("pvo", pvo);
		mv.addObject("cPage", cPage);
		mv.addObject("list", list);
		
		// 어느 페이지에서 '다음으로'를 누르면 다음 블록의 첫 페이지로 간다.
		int next_page = 0, pre_page = 0 ;
		
		switch (pvo.getNowPage()%5) {
			case 1: next_page = pvo.getNowPage()+ 5;
					pre_page = pvo.getNowPage() - 1; break;
			case 2: next_page = pvo.getNowPage()+ 4;
					pre_page = pvo.getNowPage() - 2; break;
			case 3: next_page = pvo.getNowPage()+ 3;	
					pre_page = pvo.getNowPage() - 3; break;
			case 4: next_page = pvo.getNowPage()+ 2;	
					pre_page = pvo.getNowPage() - 4; break;
			case 0: next_page = pvo.getNowPage()+ 1;	
					pre_page = pvo.getNowPage() - 5; break;
		}
		
		mv.addObject("next_page",next_page);
		mv.addObject("pre_page",pre_page);
		
		return mv;
	}
}
