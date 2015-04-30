package controller;

import java.util.ArrayList;
import java.util.List;

import mybatis.CollectionVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.CollectionDAO;

@Controller
public class CollectionCtr {

	@Autowired
	private CollectionDAO collectionDAO;

	public CollectionDAO getCollectionDAO() {
		return collectionDAO;
	}

	public void setCollectionDAO(CollectionDAO collectionDAO) {
		this.collectionDAO = collectionDAO;
	}
	 
	// 컬렉션 보기
	@RequestMapping("collection.do")
	public ModelAndView collection(String u_idx){
			CollectionVO vo = collectionDAO.getCollection(u_idx);
			List<Integer> list = new ArrayList<Integer>();		
			list.add(vo.getImg1());
			list.add(vo.getImg2());
			list.add(vo.getImg3());
			list.add(vo.getImg4());
			list.add(vo.getImg5());
			list.add(vo.getImg6());
			list.add(vo.getImg7());
			list.add(vo.getImg8());
			list.add(vo.getImg9());
			list.add(vo.getImg10());
			list.add(vo.getImg11());
			list.add(vo.getImg12());	
			
			return new ModelAndView("myCollection","collection_list",list);
		}
	// 컬렉션 추가
	@RequestMapping("collection_add.do")
	public ModelAndView collection_add(String u_idx,String bujuk){
		int res = collectionDAO.upCollection(u_idx,bujuk);	
		return new ModelAndView("redirect:/wish.do?u_idx="+u_idx);
	}
}
