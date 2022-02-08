package project03.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import project03.db.DataBase;
import project03.vo.MemberVO;

/**
 * 
 * @author hi
 * Member Database Access Object
 */
public class MemberDAO {
	private DataBase database = null;
	
	public MemberDAO() {
		database = new DataBase();
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
			con = database.getConnection();
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
}
