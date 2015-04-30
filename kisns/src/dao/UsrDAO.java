package dao;

import mybatis.UsrVO;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UsrDAO {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	public void getJoin(UsrVO uvo){
		SqlSession ss = null;
		try {
			ss = sqlSessionFactory.openSession(true);
			ss.insert("join", uvo);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
		
	}
	
	public UsrVO getLogin(UsrVO uvo){
		SqlSession ss = null;
		UsrVO vo = null;
		try {
			ss = sqlSessionFactory.openSession();
			System.out.println("11");
			vo = ss.selectOne("login", uvo);
			System.out.println(vo.getU_idx());
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
		
		return vo;
	}
}
