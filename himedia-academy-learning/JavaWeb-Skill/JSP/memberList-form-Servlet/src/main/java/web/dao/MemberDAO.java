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
	 * generic ǥ���
	 * ���� ���ϴ� ��ü�� ����Ʈ�� �������� Ȯ������ ���� ���
	 * ȸ���� ����� �������� �Լ�
	 * @return
	 */
	public List<MemberVO> member_list(){
		List<MemberVO> list = new ArrayList<MemberVO>();
		Connection con = null; // database ������ ���� ��ü
		PreparedStatement pstmt = null; // SQL ���� ������ ������ ���� ��ü
		ResultSet rs = null; // SQL�� �����ϰ� ����� ��� ���� ��ü
		try {
			con = dataFactory.getConnection();
			//---------- member�� select�ؼ� MemberVO ��ü�� �����͸� ���� �� List�� �ϳ��� �߰��Ѵ�.
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
