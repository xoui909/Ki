package controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mybatis.KireVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.KireDAO;




@Controller
public class KireCtr {
	
	@Autowired
	KireDAO kireDAO;

	public KireDAO getKireDAO() {
		return kireDAO;
	}

	public void setKireDAO(KireDAO kireDAO) {
		this.kireDAO = kireDAO;
	}
	
	
	@RequestMapping("ki_cmt_add.do")
	public ModelAndView add_cmt(KireVO krvo, String currpage) {
		String path = null;

		if(currpage!=""){
			path = kireDAO.getaddCmt(krvo) + currpage;
		}else{
			path = kireDAO.getaddCmt(krvo) + "allList.do";
		}
		
		ModelAndView mv = new ModelAndView(path);
		
		return mv;
	}
	
	@RequestMapping("ki_cmt_aj_add.do")
	public void add_ajcmt(HttpServletRequest request, HttpServletResponse response, KireVO krvo) throws Exception{
		
	   request.setCharacterEncoding("utf-8");
	   response.setContentType("text/html;charset=UTF-8");
	   PrintWriter out = response.getWriter();
	   int result = kireDAO.getAjaddCmt(krvo);
	   out.print(result);
	   
	   
	}
	
	@RequestMapping("delete.do")
	public ModelAndView delete_ok(String r_idx, String currpage){
		kireDAO.getDelete(r_idx);
		if(currpage == null){
			currpage = "allList.do";
		}
		return new ModelAndView("redirect:/"+currpage);
	}
	@RequestMapping("aj_delete.do")
	public void ajdelete_ok(HttpServletRequest request, HttpServletResponse response, String r_idx) throws Exception{
		
		   request.setCharacterEncoding("utf-8");
		   response.setContentType("text/html;charset=UTF-8");
		   PrintWriter out = response.getWriter();
		   int result = kireDAO.getDelete(r_idx);
		   out.print(result);
		   
	
	}
}
	
	
	

