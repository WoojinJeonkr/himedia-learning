package web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import web.vo.MemberVO;

/**
 * 
 * @author hi
 * Member Database Access Object
 * 
 * 자바웹을 다루는 기술 p.239
 * <Resource name="jdbc/mariadb"
    		  auth="Container"
    		  type="javax.sql.DataSource"
    		  driverClassName="org.mariadb.jdbc.Driver"
    		  url="jdbc:mariadb://localhost:3306/mars"
    		  username="mars"
    		  password="p@ss00"
    		  maxActive="50"
    		  maxWait="-1"/>
 */
public class MemberDAO {
	
	private DataSource dataFactory;
	
	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource)envContext.lookup("jdbc/mariadb");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * generic 표기법
	 * 내가 원하는 객체를 리스트에 담으려고 확정짓기 위해 사용
	 * 회원의 목록을 가져오는 함수
	 * @return
	 */
	public List<MemberVO> member_list(){
		List<MemberVO> list = new ArrayList<MemberVO>();
		Connection con = null; // database 연결을 위한 객체
		PreparedStatement pstmt = null; // SQL 문을 서버로 보내기 위한 객체
		ResultSet rs = null; // SQL을 실행하고 결과를 얻기 위한 객체
		try {
			con = dataFactory.getConnection();
			//---------- member를 select해서 MemberVO 객체에 데이터를 담은 후 List에 하나씩 추가한다.
			String query = "select * from member";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVO memberVO = new MemberVO();
				
				memberVO.setM_idx(rs.getInt("m_idx"));
				memberVO.setM_name(rs.getString("m_name"));
				memberVO.setM_id(rs.getString("m_id"));
				memberVO.setM_pw(rs.getString("m_pw"));
				memberVO.setM_email(rs.getString("m_email"));
				memberVO.setM_phone(rs.getString("m_phone"));
				memberVO.setM_mdfydate(rs.getTimestamp("m_mdfydate"));
				memberVO.setM_rgstdate(rs.getTimestamp("m_rgstdate"));
				
				list.add(memberVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	/**
	 * 회원 시퀀스에 해당하는 회원 정보를 하나 가져오는 함수
	 * @return
	 */
	public MemberVO member_view(int m_idx){
		Connection con = null; // database 연결을 위한 객체
		PreparedStatement pstmt = null; // SQL 문을 서버로 보내기 위한 객체
		ResultSet rs = null; // SQL을 실행하고 결과를 얻기 위한 객체
		
		MemberVO memberVO = new MemberVO();
		
		try {
			//-- connection 처리
			con = dataFactory.getConnection();
			
			//-- 사용할 쿼리
			String query = "select * from member where m_idx=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, m_idx);
			rs = pstmt.executeQuery(); // 쿼리를 수행하고 결과를 ResultSet에 저장
			
			if(rs.next()) {
				memberVO.setM_idx(rs.getInt("m_idx"));
				memberVO.setM_id(rs.getString("m_id"));
				memberVO.setM_name(rs.getString("m_name"));
				memberVO.setM_email(rs.getString("m_email"));
				memberVO.setM_phone(rs.getString("m_phone"));
				memberVO.setM_mdfydate(rs.getTimestamp("m_mdfydate"));
				memberVO.setM_rgstdate(rs.getTimestamp("m_rgstdate"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return memberVO;
	}
}
