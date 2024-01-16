<%@page import="web.MemberDAO"%>
<%@page import="web.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 
    1. 클라이언트가 입력해서 서버로 보낸 데이터를 받아주어야 함.
    2. vo 만들어서 데이터들을 넣어준다.
    3. vo 주면서 dao에게 update해달라고 요청한다.
    4. 결과 화면을 만들어서 클라이언트에게 보내준다.
     -->
	<%
	// 1. 클라이언트가 전송해준 데이터를 받아주자.
	String id = request.getParameter("id"); 
	String pw = request.getParameter("pw"); 
	String name = request.getParameter("name");
	String tel = request.getParameter("tel"); 
	
	// 2. vo 만들어서 데이터 넣기
	MemberVO vo = new MemberVO();
	vo.setId(id);
	vo.setPw(pw);
	vo.setName(name);
	vo.setTel(tel);
	
	// ctrl+shift+m
	MemberDAO dao = new MemberDAO();
	dao.create(vo);
	%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보 수정</title>
	</head>
	<body>
	회원수정 요청이 완료되었습니다.
	</body>
</html>