package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import mybatis.UsrVO;
import mybatis.WishVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import dao.WishDAO;

@Controller
@SessionAttributes("wvo")
public class WishCtr {
	
	@Autowired
	private WishDAO wishDAO;
	
	public WishDAO getWishDAO() {
		return wishDAO;
	}

	public void setWishDAO(WishDAO wishDAO) {
		this.wishDAO = wishDAO;
	}
	
	@RequestMapping("wish.do")
	public ModelAndView wish(String u_idx,String collection){	
		
		List<WishVO> wvo;		
		wvo=wishDAO.getWish(u_idx);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("wish");
		mv.addObject("wvo",wvo);
		if(collection!=null){
			mv.addObject("coll", collection);
		}
		return mv;
	}
	@RequestMapping("wish_add.do")
	public ModelAndView wish_add(String u_idx,String w_content,String w_max_ki){
		WishVO wvo = new WishVO();
		wvo.setU_idx(u_idx);
		wvo.setW_content(w_content);
		wvo.setW_max_ki(w_max_ki);
		
		wishDAO.addWish(wvo);
		
		return new ModelAndView("redirect:/wish.do?u_idx="+u_idx);
	}
}
