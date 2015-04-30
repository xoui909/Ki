package dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import mybatis.CollectionVO;
import mybatis.WishVO;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CollectionDAO {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public CollectionVO getCollection(String u_idx) {
		CollectionVO vo = new CollectionVO();
		SqlSession ss = null;
		try {
			ss = sqlSessionFactory.openSession();
			vo = ss.selectOne("collectionList", u_idx);
		} catch (Exception e) {
		} finally {
			ss.close();
		}

		return vo;
	}

	public int upCollection(String u_idx,String bujuk) {
		int res = 0;
		SqlSession ss = null;
		try {
			ss = sqlSessionFactory.openSession(true);
			
			// 기존소원 달성
			WishVO wvo = ss.selectOne("one_wish", u_idx);	
			Map<String, String> wv = new HashMap<String, String>();
			wv.put("u_idx", wvo.getU_idx());
			wv.put("w_status", "2");
			ss.update("wish_status", wv);
			
			// 컬렉션 랜덤추첨	
			CollectionVO vo = getCollection(u_idx);			
			switch (Integer.parseInt(bujuk)) {
			case 1:	vo.setImg1(vo.getImg1()+1); 	break;
			case 2:	vo.setImg2(vo.getImg2()+1);		break;
			case 3:	vo.setImg3(vo.getImg3()+1);		break;
			case 4:	vo.setImg4(vo.getImg4()+1);		break;
			case 5:	vo.setImg5(vo.getImg5()+1);		break;
			case 6:	vo.setImg6(vo.getImg6()+1);		break;
			case 7:	vo.setImg7(vo.getImg7()+1);		break;
			case 8:	vo.setImg8(vo.getImg8()+1);		break;
			case 9:	vo.setImg9(vo.getImg9()+1);		break;
			case 10: vo.setImg10(vo.getImg10()+1);	break;
			case 11: vo.setImg11(vo.getImg11()+1);	break;
			case 12: vo.setImg12(vo.getImg12()+1);	break;
			case 13: vo.setImg13(vo.getImg13()+1);	break;
			}
			
			res = ss.update("collectionUp", vo);
			
		} catch (Exception e) {
			res = 0;
			System.out.println(e);
		} finally {
			ss.close();
		}
		return res;
	}
}
