package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import mybatis.FriendVO;
import mybatis.KiVO;
import mybatis.KireVO;
import mybatis.UsrVO;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class FriendDAO {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	public List<UsrVO> getFriend(String u_idx){
		SqlSession ss = null;
//		List<FriendVO> list=null;
//		UsrVO uvo = null;
		List<UsrVO> f_uvo = new ArrayList<UsrVO>();		
		try {
			ss = sqlSessionFactory.openSession();
			f_uvo = ss.selectList("friend_list",u_idx);
//			Iterator<FriendVO> it = list.iterator();
//
//			while(it.hasNext())
//			{
//				FriendVO vo = it.next();
//				ss = sqlSessionFactory.openSession();
//				uvo = ss.selectOne("oneUsr", vo.getF_idx());
//				f_uvo.add(uvo);
//			}
			
						
		} catch (Exception e) {
			
			System.out.println(e);
		} finally {
			ss.close();
		}
			
		return f_uvo;
	}
	
	public void addFriend(FriendVO fvo){
		SqlSession ss = null;	
		
		try {
			ss = sqlSessionFactory.openSession();
			ss.insert("friend_add", fvo);
		
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
	}
	
	public void delFriend(FriendVO fvo){
		SqlSession ss = null;	
		
		try {
			ss = sqlSessionFactory.openSession();
			ss.delete("friend_del", fvo);
		
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
		
	}
	
	public List<KiVO> writingFriend(String u_idx){
		SqlSession ss = null;	
		List<KiVO> list = null;
		try {
			ss = sqlSessionFactory.openSession(true);
			list =  ss.selectList("friend_writing", u_idx);
		
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
		return list;
	}
	
	public List<KireVO> getAllReList(){
		SqlSession ss = null;
		List<KireVO> list = null;
		try {
			ss = sqlSessionFactory.openSession();
			list = ss.selectList("reList");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
		
		return list;
	}
	
	public List<UsrVO> getFriendTo(String u_idx){
		SqlSession ss = null;
		List<UsrVO> list = null;
		try {
			ss = sqlSessionFactory.openSession();
			list = ss.selectList("friendto",u_idx);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
		
		return list;
	}
	
}
