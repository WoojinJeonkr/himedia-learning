package web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * @author user
 *
 * �α��� �����ؼ� ó���ϴ� Class
 */
public class LoginDAO {
	
	private DataSource dataFactory;
	// DB Connection Pool���� Connection ������(JNDI)
	public LoginDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource)envContext.lookup("jdbc/mariadb");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ���̵�, �н������ �ش� ȸ���� �ִ��� ã�� �Լ�
	 * �������� ��ȯ�ؼ� ȸ�� ������ ó��
	 * @param user_id
	 * @param user_pw
	 * @return
	 */
	public int login(String user_id, String user_pw) {
		
		int m_idx = 0;
		Connection con = null;           // database ������ ���� ��ü
		PreparedStatement pstmt  = null; // SQL ���� ������ ������ ���� ��ü
		ResultSet rs   = null;           // SQL�� �����ϰ� ����� �ޱ� ���� ��ü
		
		//--- ����� ����
		String query = "SELECT m_idx FROM member WHERE m_id = ? AND m_pw = ?";
		try {
			con = dataFactory.getConnection();
			pstmt = con.prepareStatement(query);
			// ������ �Է°� �߰�
			pstmt.setString(1, user_id);
			pstmt.setString(2, user_pw);
			rs = pstmt.executeQuery(); // ������ �����ϰ� ������� ResultSet�� ����
			
			if(rs.next()) { // �˻��� ���� �ִ��� Ȯ��
				m_idx = rs.getInt("m_idx"); // �˻��� ������ ����
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
		return m_idx;
	}
}
