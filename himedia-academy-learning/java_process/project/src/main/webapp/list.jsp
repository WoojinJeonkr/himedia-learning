<%@page import="web.BoardDAO"%>
<%@page import="web.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
BoardDAO dao = new BoardDAO();
// jsp에서 import: 클릭 후, ctrl+shift+m
// java에서 import: ctrl+shift+o(영문)
ArrayList<BoardVO> list = dao.readAll();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	for(BoardVO vo2 : list){
%>
	검색한 번호는 <%=vo2.getIdx()%><br>
	검색한 제목은 <a href="one.jsp?idx=<%= vo2.getIdx() %>"><%= vo2.getTitle() %></a><br>
	<hr>
<%
	}
%>
</body>
</html>