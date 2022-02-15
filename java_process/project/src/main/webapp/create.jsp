<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="web.BoardDAO"%>
<%@page import="web.BoardVO"%>
    <!--
    1. 클라이언트가 입력해서 서버로 보낸 데이터를 받아주어야 함.
    2. vo 만들어서 데이터들을 넣어준다.
    3. vo 주면서 dao에게 create해달라고 요청한다.
    4. 결과 화면을 만들어서 클라이언트에게 보내준다.
     -->
	<%
	// 1. 클라이언트가 전송해준 데이터를 받아주자.
	String idx = request.getParameter("idx"); 
	String title = request.getParameter("title"); 
	String name = request.getParameter("name"); 
	String text = request.getParameter("text");
	String rgstdate = request.getParameter("rgstdate");
	
	// 2. vo 만들어서 데이터 넣기
	BoardVO vo = new BoardVO();
	vo.setId((String)session.getAttribute("user"));
	vo.setIdx(idx);
	vo.setTitle(title);
	vo.setName(name);
	vo.setText(text);
	
	// ctrl+shift+m
	BoardDAO dao = new BoardDAO();
	dao.create(vo);
	%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>생성된 게시판</title>
	</head>
	<body>
		게시판이 생성되었습니다.
	</body>
</html>