package dao;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mybatis.UsrVO;
import mybatis.WishVO;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class WishDAO {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	public List<WishVO> getWish(String u_idx){
		SqlSession ss = null;
		List<WishVO> vo = null;
		try {
			ss = sqlSessionFactory.openSession();
			vo = ss.selectList("my_wish",u_idx);
		} catch (Exception e) {
			vo = null;
			return vo;
		} finally {
			ss.close();
		}
		
		return vo;
	}
	
	public void addWish(WishVO wvo){
		SqlSession ss = null;
		try {
			ss = sqlSessionFactory.openSession(true);
					
			// 기존소원 status 변경
			WishVO wvo2 = ss.selectOne("one_wish", wvo.getU_idx());
			
			// 첫소원이면 실행 X
			if(wvo2!=null){
				Map<String, String> wv = new HashMap<String, String>();
				//기존소원을 달성못했으면 status 0, 달성했으면 status 2
				if(Integer.parseInt(wvo2.getW_cur_ki())<Integer.parseInt(wvo2.getW_max_ki())){
					wv.put("u_idx",wvo.getU_idx());
					wv.put("w_status", "0");
					ss.update("wish_status",wv);
				}else{
					wv.put("u_idx",wvo.getU_idx());
					wv.put("w_status", "2");
					ss.update("wish_status",wv);
				}
			}
			// 새로운 소원 삽입
			ss.insert("wish_write", wvo);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
	}
	
}
