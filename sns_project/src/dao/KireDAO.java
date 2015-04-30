package dao;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import mybatis.KireVO;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class KireDAO {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	

	
	public String getaddCmt(KireVO krvo) {
		SqlSession ss = null;
		try {
			ss = sqlSessionFactory.openSession(true);
			ss.insert("ki_cmt_add", krvo);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
		
		return "redirect:/";
	}
	public int getAjaddCmt(KireVO krvo) {

		SqlSession ss = null;
		int result=0;
		if(krvo.getR_content()==""){
			result=0;
		}else{			
			try {
				ss = sqlSessionFactory.openSession(true);
				result = ss.insert("ki_cmt_add", krvo);
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				ss.close();
			}
		}
		return result;
	}
	
	public int getDelete(String r_idx){
		SqlSession ss = null;
		int result = 0;
		try {
			ss = sqlSessionFactory.openSession(true);
			result = ss.delete("kire_del", r_idx);
		} catch (Exception e) {
			System.out.println(e);
		
		} finally{
			ss.close();
		}
		return result;
	}
	
	// 메인 기코멘트 리스트
	public String getKire(){
		
		String result=null;	
		SqlSession ss = null;
		
		List<KireVO> list = null;
		try {
			ss=sqlSessionFactory.openSession();
			list = ss.selectList("reList");
			
			 result +="<customers>";
			 Iterator<KireVO> it = list.iterator();
			 KireVO vo =null;
			 while(it.hasNext()){
				 vo = it.next();
				 result +="<customer>";
				 result +="<r_idx>"+vo.getR_idx()+"</r_idx>";
				 result +="<r_u_idx>"+vo.getR_idx()+"</r_u_idx>";
				 result +="<regdate>"+vo.getR_regdate().substring(0, 10)+"</regdate>";
				 result +="<k_idx>"+vo.getK_idx()+"</k_idx>";
				 result +="<image>"+vo.getU_image()+"</image>";
				 result +="<name>"+vo.getU_name()+"</name>";
				 result +="<content>"+vo.getR_content()+"</content>";				 
				 result +="</customer>";
				 System.out.println(vo.getR_regdate()+"날짜요");
			 }
			 result +="</customers>";
			
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
		
		
		return result;
	}
	
}
