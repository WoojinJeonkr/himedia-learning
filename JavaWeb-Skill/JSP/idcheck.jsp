<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="java.sql.*"%>
<%@ page import="firstweb.DataBase"%>
<%
	String m_id			= request.getParameter("m_id");
	request.setCharacterEncoding("UTF-8");
	DataBase database = new DataBase();
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs   = null; 
	String query = "SELECT m_idx FROM member WHERE m_id = ?";
	con = database.getConnection();	
	pstmt = con.prepareStatement(query);
	pstmt.setString(1, m_id);
	rs = pstmt.executeQuery();
	
	if(rs.next()){
		//idCheck = 0;
		out.print("true");
	} else {
		//idCheck = 1;
		out.print("false");
	}
%>