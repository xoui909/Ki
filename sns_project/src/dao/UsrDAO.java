package dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import mybatis.CollectionVO;
import mybatis.KiVO;
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
	
	public String getJoin(UsrVO uvo){
		SqlSession ss = null;
		SqlSession ss2 = null;
		String path = null;
		int r = 0;
		try {
			ss = sqlSessionFactory.openSession(true);
			ss2 = sqlSessionFactory.openSession();
			
			r = ss2.selectOne("id_chk", uvo.getU_id());
			
			if(r==0){
				ss.insert("join", uvo);
				ss.insert("collection");
				path = "success";
			}else{
				path = "fail";
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
			ss2.close();
		}
		return path;
	}
	
	public UsrVO getLogin(String u_id){
		SqlSession ss = null;
		UsrVO vo = null;
		try {
			ss = sqlSessionFactory.openSession();
			vo = ss.selectOne("login", u_id);
		} catch (Exception e) {
			vo = null;
			return vo;
		} finally {
			ss.close();
		}
		return vo;
	}
	
	public String getPw(String u_id){
		SqlSession ss = null;
		String pw = null;
		try {
			ss = sqlSessionFactory.openSession();
			pw = ss.selectOne("find_pw", u_id);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
		
		return pw;
	}
	
	public int getIdCheck(String u_id){
		SqlSession ss = null;
		int r = 0;
		try {
			ss = sqlSessionFactory.openSession();
			r = ss.selectOne("id_chk", u_id);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
		return r;
	}
	
	public String getLeaveCheck(String u_id){
		SqlSession ss = null;
		String r = null;
		try {
			ss = sqlSessionFactory.openSession();
			r = ss.selectOne("leave_chk", u_id);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
		
		if(r==null){
			r = "blank_ID";
		}
		return r;
	}
	
	public void getEdit(UsrVO uvo){
		SqlSession ss = null;
		try {
			ss = sqlSessionFactory.openSession(true);
			ss.update("edit", uvo);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
	}
	
	public void getEditImage(UsrVO uvo){
		SqlSession ss = null;
		try {
			ss = sqlSessionFactory.openSession(true);
			ss.update("editImage", uvo);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
	}

	public UsrVO getOneUsr(String u_idx) {
		UsrVO uvo = null;
		SqlSession ss = null;
		try {
			ss = sqlSessionFactory.openSession();
			uvo = ss.selectOne("oneUsr", u_idx);
			ss.close();
		} catch (Exception e) {
			System.out.println(e);
		} 
		return uvo;
	}
	
	public void getEditPassword(UsrVO uvo){
		SqlSession ss = null;
		try {
			ss = sqlSessionFactory.openSession(true);
			ss.update("edit_password", uvo);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
	}
	
	public void getLeave(String u_idx){
		SqlSession ss = null;
		SqlSession ss2 = null;
		try {
			ss = sqlSessionFactory.openSession(true);
			ss2 = sqlSessionFactory.openSession();
			ss.delete("leave_ki_re_delete", u_idx);
			List<KiVO> list = ss2.selectList("leave_find_ki", u_idx);
			
			Iterator<KiVO> it = list.iterator();
			while(it.hasNext()){
				KiVO kvo = it.next();
				ss.delete("leave_ki_re_all_delete", kvo.getK_idx());
			}
			ss.delete("leave_ki_delete", u_idx);
			ss.delete("leave_wish_delete", u_idx);
			ss.update("leave_update", u_idx);
			ss.delete("leave_fr_delete", u_idx);
			ss.delete("leave_collection",u_idx);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
			ss2.close();
		}
	}
	
	public int getTotalCount() {
		SqlSession ss = null;
		int i = 0;
		try {
			ss = sqlSessionFactory.openSession();
			i = ss.selectOne("totalUserCount");
		} catch (Exception e) {
		} finally {
			ss.close();
		}
		return i;
	}
	
	public List<UsrVO> getList(Map<String, Integer> map) {
		SqlSession ss = null;
		List<UsrVO> list = null;
		try {
			ss = sqlSessionFactory.openSession();
			list = ss.selectList("userList", map);
		} catch (Exception e) {
		} finally {
			ss.close();
		}
		return list;
	}
	
	
	
}
