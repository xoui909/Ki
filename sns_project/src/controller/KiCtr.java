package controller;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mybatis.KiVO;
import mybatis.KieeVO;
import mybatis.KireVO;
import mybatis.PageVO;
import mybatis.UsrVO;
import mybatis.WishVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import dao.KiDAO;

@Controller
//@SessionAttributes("myList")
public class KiCtr {

	@Autowired
	private KiDAO kiDAO;

	public KiDAO getKiDAO() {
		return kiDAO;
	}

	public void setKiDAO(KiDAO kiDAO) {
		this.kiDAO = kiDAO;
	}
	
	@RequestMapping("myList.do")
	public ModelAndView myList(String u_idx, HttpSession session) {
		List<KiVO> myList = kiDAO.getMyList(u_idx, session);
		return new ModelAndView("myList", "myList", myList);
	}
	
	@RequestMapping("allList.do")
	public ModelAndView allList(){
		List<KiVO> list = kiDAO.getAllList();
		List<KireVO> list2 = kiDAO.getAllReList();
		ModelAndView mv = new ModelAndView("main");
		
		mv.addObject("list",list);
		mv.addObject("list2",list2);
		
		return mv;
	}
	
	@RequestMapping("write.do")
	public ModelAndView write(String currpage){
		return new ModelAndView("ki_write", "currpage", currpage);
	}
	
	@RequestMapping("ki_writeok.do")
	public ModelAndView ki_write(KiVO kvo, MultipartHttpServletRequest request) throws Exception{		
		MultipartFile mf = kvo.getMf_image();
		String currpage = request.getParameter("currpage");
		
		
		String path = request.getServletContext().getRealPath("/images");
		File f = new File(path, kvo.getU_idx());
		if(!f.exists()){
			f.mkdir();
		}
		path += "\\"+kvo.getU_idx();
		
		if(mf.getOriginalFilename()==""){
			kvo.setK_image("");
		}else{
			kvo.setK_image("images/"+request.getParameter("u_idx")+"/"+mf.getOriginalFilename());
			mf.transferTo(new File(path+"/"+mf.getOriginalFilename()));
		}
		
		// 글 한 줄 띄어쓰기 적용
		kvo.setK_content(kvo.getK_content().replace("\r\n", "<br>"));
		
		kiDAO.getWrite(kvo);
		
		if(currpage == null || currpage == "") currpage = "allList.do";
		
		return new ModelAndView("redirect:/"+currpage);
	}
	
	@RequestMapping("ki_up.do")
	public void ki_up(HttpServletRequest request, HttpServletResponse response,KieeVO kevo) throws Exception{
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();	
		
		String res = "";
		WishVO wvo = new WishVO();
		wvo = kiDAO.getWish(kevo.getKi_u_idx());
		System.out.println(kevo.getKi_u_idx());
		if(wvo==null){
			res += "<status>no</status>";			
		}else if(Integer.parseInt(wvo.getW_cur_ki())==Integer.parseInt(wvo.getW_max_ki())){
			res += "<status>wish</status>";
		}else if(kiDAO.getCheck(kevo)==0){			
			kiDAO.getHit(kevo.getKi_u_idx(), kevo.getK_idx(), kevo);
			if((Integer.parseInt(wvo.getW_cur_ki())+1) == Integer.parseInt(wvo.getW_max_ki())){
				res += "<status>success</status>";
			}			
		}else if(kiDAO.getCheck(kevo)!=0){
			res += "<status>ki</status>";
		}
		 String result = kiDAO.getKilist();
		 result += res;
		 result +="</kis>";
		out.print(result);
	}
	
	@RequestMapping("ki_delete.do")
	public ModelAndView ki_delete(String k_idx, String currpage, String search_key1, String search_key2, HttpSession session){
		
		kiDAO.getDelete(k_idx);
		System.out.println("key2"+search_key2);
		
		if(search_key1 == null) search_key1 = "0*0*0**0*0";
		if(search_key2 == null){
			search_key2 = "0*0*0**0*0";
		}
		
		if(!search_key1.equals("0*0*0**0*0")){
			currpage = "search.do?&search_sel=10";
			session.setAttribute("search_key", search_key1);
		}else if(!search_key2.equals("0*0*0**0*0")){
			currpage = "search.do?search_sel=30";
			session.setAttribute("ki_sel", search_key2);
		}
		
		
		return new ModelAndView("redirect:/"+currpage);
	}
	
	@RequestMapping("ki_modify.do")
	public ModelAndView ki_modify(String k_idx, String currpage, String search_key1, String search_key2){
		
		KiVO kvo = kiDAO.getOne(k_idx);
		ModelAndView mv = new ModelAndView("ki_modify");
		
		kvo.setK_content(kvo.getK_content().replace("<br>", "\r\n"));
		
		mv.addObject("kvo", kvo);
		mv.addObject("currpage", currpage);
		mv.addObject("search_key1", search_key1);
		mv.addObject("search_key2", search_key2);
		
		return mv;
	}
	
	@RequestMapping("ki_modify_ok.do")
	public ModelAndView ki_modify_ok(KiVO kvo, String image_chk, MultipartHttpServletRequest request, HttpSession session, String currpage, String search_key1, String search_key2) throws Exception{		
		ModelAndView mv = new ModelAndView();
		kvo.setK_idx(request.getParameter("k_idx"));
		if(image_chk != null){
			MultipartFile mf = kvo.getMf_image();
			String path = request.getServletContext().getRealPath("/images");
			File f = new File(path, kvo.getU_idx());
			if(!f.exists()){
				f.mkdir();
			}
			path += "\\"+kvo.getU_idx();
			kvo.setK_image("images/"+request.getParameter("u_idx")+"/"+mf.getOriginalFilename());
			mf.transferTo(new File(path+"/"+mf.getOriginalFilename()));
			kiDAO.getModifyImage(kvo);
			
			currpage = request.getParameter("currpage");
			search_key1 = request.getParameter("search_key1");
			search_key2 = request.getParameter("search_key2");
			
			if(search_key1.trim().length() > 0){
				currpage = "search.do?&search_sel=10";
				session.setAttribute("search_key", search_key1);
			}else if(search_key2.trim().length() > 0){
				currpage = "search.do?search_sel=30";
				session.setAttribute("ki_sel", search_key2);
			}
			
		} else {
			kiDAO.getModify(kvo);
		}
		
		if(search_key1.trim().length() > 0){
			currpage = "search.do?&search_sel=10";
			session.setAttribute("search_key", search_key1);
		}else if(search_key2.trim().length() > 0){
			currpage = "search.do?search_sel=30";
			session.setAttribute("ki_sel", search_key2);
		}
		
		mv.setViewName("redirect:/"+currpage);
		return mv;
	}
	
	@RequestMapping("search.do")
	public ModelAndView search(String search_sel, String search_key, String ki_sel, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		
		if(search_sel.equals("10")){ 
			mv.setViewName("search");
			if(search_key == null){
				search_key = (String) session.getAttribute("search_key");
				session.removeAttribute("search_key");
				session.removeAttribute("ki_sel");
			}
			List<KiVO> search_list = kiDAO.getSearchContent(search_key, session);
			mv.addObject("search_list", search_list);
		}else if(search_sel.equals("20")){
			mv.setViewName("search_friend");
			List<UsrVO> search_list = kiDAO.getSearchFriends(search_key, session);
			mv.addObject("search_list", search_list);
		}else if(search_sel.equals("25")){
			mv.setViewName("search_friend_id");
			List<UsrVO> search_list = kiDAO.getSearchFriends_ID(search_key, session);
			mv.addObject("search_list", search_list);
		}else if(search_sel.equals("30")){ 
			
			mv.setViewName("search_ki");
			if(ki_sel == null){
				ki_sel = (String) session.getAttribute("ki_sel");
				session.removeAttribute("ki_sel");
				session.removeAttribute("search_key");
			}
			
			search_key = ki_sel;
			
			List<KiVO> search_list = kiDAO.getSearchKi(search_key, session);
			mv.addObject("search_list", search_list);
		}
		
		return mv;
	}
	@RequestMapping("allAjList.do")
	public void allAjList(HttpServletRequest request, HttpServletResponse response) throws Exception{
	
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html;charset=UTF-8");
	   PrintWriter out = response.getWriter();
	   String result = kiDAO.getAjAllReList();
	   out.print(result);
	}
	
	@RequestMapping("admin.do")
	public ModelAndView admin(){
//		List<KiVO> list = kiDAO.getAllList();
//		List<UsrVO> list2 = kiDAO.getUserList();
		ModelAndView mv = new ModelAndView("admin");
		
//		mv.addObject("list",list);
//		mv.addObject("list2",list2);
		
		return mv;
	}
	
	@RequestMapping("admin_ki_delete.do")
	public ModelAndView admin_ki_delete(String k_idx){
		
		kiDAO.getDelete(k_idx);
		
		return new ModelAndView("redirect:/admin_ki.do");
	}
	
	static PageVO pvo = null;

	@RequestMapping("admin_ki.do")
	public ModelAndView admin_ki(HttpServletRequest request){
		String cPage = request.getParameter("cPage");
		
		pvo = new PageVO();
		pvo.setTotalRecord(kiDAO.getTotalCount()); // 총 게시물의 수 해결
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
		
		List<KiVO> list =  kiDAO.getList(map);
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("admin_ki");
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
