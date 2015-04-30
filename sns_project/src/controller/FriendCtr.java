package controller;

import java.util.List;

import mybatis.FriendVO;
import mybatis.KiVO;
import mybatis.KireVO;
import mybatis.UsrVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import dao.FriendDAO;
import dao.KiDAO;

@Controller
@SessionAttributes("friends_list")
public class FriendCtr {

	@Autowired
	private FriendDAO FriendDAO;

	public FriendDAO getFriendDAO() {
		return FriendDAO;
	}

	private KiDAO kiDAO;

	public KiDAO getKiDAO() {
		return kiDAO;
	}

	public void setKiDAO(KiDAO kiDAO) {
		this.kiDAO = kiDAO;
	}

	public void setFriendDAO(FriendDAO friendDAO) {
		FriendDAO = friendDAO;
	}

	@RequestMapping("friend.do")
	public ModelAndView friendList(String u_idx) {

//	List<UsrVO> f_list = FriendDAO.getFriend(u_idx);
		
		List<UsrVO> list = FriendDAO.getFriendTo(u_idx);

		ModelAndView mv = new ModelAndView();

		mv.setViewName("friend");
		mv.addObject("f_list", list);

		return mv;
	}

	@RequestMapping("friend_add.do")
	public ModelAndView friendAdd(String u_idx, String f_u_idx) {

		FriendVO fvo = new FriendVO();
		fvo.setF_idx(f_u_idx);
		fvo.setF_u_idx(u_idx);
		FriendDAO.addFriend(fvo);

		ModelAndView mv = new ModelAndView();
		
		// 친구 추가 후 다시 친구 리스트를 불러와서 세션에 저장
		List<UsrVO> f_list = FriendDAO.getFriend(u_idx);
		mv.addObject("friends_list", f_list);



		mv.setViewName("redirect:/friend.do?u_idx="+u_idx);

		return mv;

	}

	@RequestMapping("friend_del.do")
	public ModelAndView friendDel(String u_idx, String f_u_idx) {

		FriendVO fvo = new FriendVO();
		fvo.setF_idx(f_u_idx);
		fvo.setF_u_idx(u_idx);
		FriendDAO.delFriend(fvo);

		ModelAndView mv = new ModelAndView();
		// 친구 추가 후 다시 친구 리스트를 불러와서 세션에 저장
		List<UsrVO> f_list = FriendDAO.getFriend(u_idx);
		mv.addObject("friends_list", f_list);

		
		mv.setViewName("redirect:/friend.do?u_idx="+u_idx);
		return mv;

	}

	@RequestMapping("f_writing.do")
	public ModelAndView friendWriting(String u_idx) {

			
		List<KireVO> fwrlist = FriendDAO.getAllReList();
		List<KiVO> fwlist = FriendDAO.writingFriend(u_idx);
		ModelAndView mv = new ModelAndView("f_writing");
		
		mv.addObject("fwlist", fwlist);
		mv.addObject("fwrlist",fwrlist);

		return mv;

	}
}
