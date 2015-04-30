package controller;

import mybatis.UsrVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import dao.UsrDAO;

@Controller
public class UsrCtr {
	
	@Autowired
	private UsrDAO usrDAO;

	public UsrDAO getUsrDAO() {
		return usrDAO;
	}

	public void setUsrDAO(UsrDAO usrDAO) {
		this.usrDAO = usrDAO;
	}
	
	@RequestMapping("join.do")
	public ModelAndView join(UsrVO uvo){
		
		System.out.println(uvo.getU_id());
		System.out.println(uvo.getU_pw());
		
		usrDAO.getJoin(uvo);
		
		
		return new ModelAndView("redirect:/index.jsp");
	}
	
	@RequestMapping("login.do")
	public ModelAndView login(String u_id, String u_pw){
		UsrVO uvo = new UsrVO();
		
		uvo.setU_id(u_id);
		uvo.setU_pw(u_pw);
		
		UsrVO uvo2 = usrDAO.getLogin(uvo);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("uvo", uvo2);
		
		return mv;
	}
	
}
