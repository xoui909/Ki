package dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import mybatis.KiVO;
import mybatis.KieeVO;
import mybatis.KireVO;
import mybatis.UsrVO;
import mybatis.WishVO;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class KiDAO {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	public List<KiVO> getMyList(String u_idx, HttpSession session){
		SqlSession ss = null;
		List<KiVO> myList = null;
		UsrVO uvo = null;
		List<KireVO> list = null;

		try {
			ss = sqlSessionFactory.openSession();
			uvo = ss.selectOne("oneUsr", u_idx);
			myList = ss.selectList("myList", u_idx);
			list = getAllReList();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ss.close();
		}
		
		session.setAttribute("oneUsr", uvo);
		session.setAttribute("cmt_list", list);
		return myList;
	}
	
	public List<KiVO> getAllList(){
		SqlSession ss = null;
		List<KiVO> list = null;
		try {
			ss = sqlSessionFactory.openSession();
			list = ss.selectList("allList");
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
	
	public void getWrite(KiVO kvo){
		SqlSession ss = null;
		try {
			ss = sqlSessionFactory.openSession(true);
			ss.insert("ki_write", kvo);
		} catch (Exception e) {
			System.out.println(e);
		} finally{
			ss.close();
		}
	}
	
	public void getHit(String u_idx, String k_idx, KieeVO kevo){
		SqlSession ss = null;
		try {
			ss = sqlSessionFactory.openSession(true);
			ss.update("hit", k_idx);
			ss.update("cur_ki",u_idx);
			ss.insert("kiee", kevo);
		} catch (Exception e) {
			System.out.println(e);
		} finally{
			ss.close();
		}
	}
	
	public int getCheck(KieeVO kevo){
		SqlSession ss = null;
		int r = 0;
		try {
			ss = sqlSessionFactory.openSession();
			r = ss.selectOne("check", kevo);
		} catch (Exception e) {
			System.out.println(e);
		} finally{
			ss.close();
		}
		return r;
	}
	
	public void getDelete(String k_idx){
		SqlSession ss = null;
		try {
			ss = sqlSessionFactory.openSession(true);
			ss.delete("ki_re_all_delete", k_idx);
			ss.delete("ki_delete", k_idx);
		} catch (Exception e) {
			System.out.println(e);
		} finally{
			ss.close();
		}
	}
	
	public KiVO getOne(String k_idx){
		SqlSession ss = null;
		KiVO kvo = null;
		try {
			ss = sqlSessionFactory.openSession();
			kvo = ss.selectOne("one", k_idx);
		} catch (Exception e) {
			System.out.println(e);
		} finally{
			ss.close();
		}
		
		return kvo;
	}
	
	public void getModify(KiVO kvo){
		SqlSession ss = null;
		try {
			ss = sqlSessionFactory.openSession(true);
			ss.update("ki_modify",kvo);
		} catch (Exception e) {
			System.out.println(e);
		} finally{
			ss.close();
		}
	}
	
	public void getModifyImage(KiVO kvo){
		SqlSession ss = null;
		try {
			ss = sqlSessionFactory.openSession(true);
			ss.update("ki_modify_image",kvo);
		} catch (Exception e) {
			System.out.println(e);
		} finally{
			ss.close();
		}
	}
	
	public WishVO getWish(String my_idx){
		WishVO wvo2 = new WishVO();
		
		SqlSession ss = null;
		try {
			ss = sqlSessionFactory.openSession();
			wvo2 = ss.selectOne("one_wish", my_idx);
		} catch (Exception e) {
			System.out.println(e);
		} finally{
			ss.close();
		}
		
		
		return wvo2;
	}
	
	// 글 내용 검색
		public List<KiVO> getSearchContent(String search_key, HttpSession session) {
			List<KiVO> search_list = null;
			SqlSession ss = null;
			List<KireVO> c_list = null;
			try {
				ss = sqlSessionFactory.openSession();
				search_list = ss.selectList("search_content", search_key);
				session.setAttribute("search_key", search_key);
				c_list = getAllReList();
				session.setAttribute("c_list", c_list);
			
			} catch (Exception e) {
				System.out.println(e);
			} finally{
				ss.close();
			}
			return search_list;
		}
		
		
	// 친구 찾기(닉네임)
		public List<UsrVO> getSearchFriends(String search_key, HttpSession session) {
			List <UsrVO> search_list = null;
			
			SqlSession ss = null;
			try {
				ss = sqlSessionFactory.openSession();
				search_list = ss.selectList("search_friends", search_key);
				session.setAttribute("search_key", search_key);
			} catch (Exception e) {
				System.out.println(e);
			} finally{
				ss.close();
			}
			
			return search_list;
		}
		
		// 친구 찾기(아이디)
				public List<UsrVO> getSearchFriends_ID(String search_key, HttpSession session) {
					List <UsrVO> search_list = null;
					
					SqlSession ss = null;
					try {
						ss = sqlSessionFactory.openSession();
						search_list = ss.selectList("search_friends_id", search_key);
						session.setAttribute("search_key", search_key);
					} catch (Exception e) {
						System.out.println(e);
					} finally{
						ss.close();
					}
					
					return search_list;
				}

		// 기 카테고리 검색
		public List<KiVO> getSearchKi(String search_key, HttpSession session) {
			List<KiVO> search_list = null;
			SqlSession ss = null;
			List<KireVO> c_list = null;
			try {
				ss = sqlSessionFactory.openSession();
				search_list = ss.selectList("search_ki", search_key);
				session.setAttribute("search_key", search_key);
				c_list = getAllReList();
				session.setAttribute("c_list", c_list);
			
			} catch (Exception e) {
				System.out.println(e);
			} finally{
				ss.close();
			}
			return search_list;
		}
		
		public List<UsrVO> getUserList(){
			SqlSession ss = null;
			List<UsrVO> list = null;
			try {
				ss = sqlSessionFactory.openSession();
				list = ss.selectList("allUserList");
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				ss.close();
			}
			
			return list;
		}
		
		public int getTotalCount() {
			SqlSession ss = null;
			int i = 0;
			try {
				ss = sqlSessionFactory.openSession();
				i = ss.selectOne("totalKiCount");
			} catch (Exception e) {
			} finally {
				ss.close();
			}
			return i;
		}
		
		public List<KiVO> getList(Map<String, Integer> map) {
			SqlSession ss = null;
			List<KiVO> list = null;
			try {
				ss = sqlSessionFactory.openSession();
				list = ss.selectList("kiList", map);
			} catch (Exception e) {
			} finally {
				ss.close();
			}
			return list;
		}
		public String getKilist(){
			SqlSession ss = null;
			String result="";
			/*<td colspan="2" align="right"><h4><b>받아라 ${k.k_kind } 기! (${k.k_hit }/${k.k_max })</b></h4></td>*/
				
			try {
				 ss = sqlSessionFactory.openSession();
				 List<KiVO> list = getAllList();
				 result +="<kis>";
				 Iterator<KiVO> it = list.iterator();
				 KiVO vo =null;
				 while(it.hasNext()){
					 vo = it.next();
					 result +="<ki>";
					 result +="<no>"+vo.getK_idx()+"</no>";
					 result +="<kind>"+vo.getK_kind()+"</kind>";
					 result +="<hit>"+vo.getK_hit()+"</hit>";
					 result +="<max>"+vo.getK_max()+"</max>";
					 result +="</ki>";
				 }				
				} catch (Exception e) {
					System.out.println(e);
					
				} finally {
					ss.close();
				}
			
			return result;
		}
		public String getAjAllReList(){
			SqlSession ss = null;
			String result="";
			/*<td colspan="2" align="right"><h4><b>받아라 ${k.k_kind } 기! (${k.k_hit }/${k.k_max })</b></h4></td>*/
			try {
			 ss = sqlSessionFactory.openSession();
			 List<KireVO> list = ss.selectList("reList");
			 result +="<kires>";
			 Iterator<KireVO> it = list.iterator();
			 KireVO vo =null;
			 while(it.hasNext()){
				 vo = it.next();
				 result +="<kire>";
				 result +="<no>"+vo.getK_idx()+"</no>";
				 result +="<name>"+vo.getU_name()+"</name>";
				 result +="<img>"+vo.getU_image()+"</img>";
				 result +="<content>"+vo.getR_content()+"</content>";
				 result +="<ru_idx>"+vo.getR_u_idx()+"</ru_idx>";
				 result +="<r_idx>"+vo.getR_idx()+"</r_idx>";
				 result +="<regdate>"+vo.getR_regdate().substring(0, 10)+"</regdate>";
				 result +="</kire>";
			 }
			 result +="</kires>";

			} catch (Exception e) {
				System.out.println(e);
			} finally {
				ss.close();
			}
			
			return result; 
		}

}
