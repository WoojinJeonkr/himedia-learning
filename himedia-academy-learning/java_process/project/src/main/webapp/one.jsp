<%@page import="web.BoardDAO"%>
<%@page import="web.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String idx = request.getParameter("idx");
BoardVO vo = new BoardVO();
vo.setIdx(idx);

BoardDAO dao = new BoardDAO();
BoardVO vo2 = dao.readOne(vo); // MemberVO
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	if (vo2.getIdx() != null) {
	%>
	검색한 번호는 <%=vo2.getIdx()%><br>
	검색한 제목은 <%=vo2.getTitle()%><br>
	검색한 작성자는 <%=vo2.getName()%><br>
	검색한 내용은 <%=vo2.getText()%><br>
	검색한 등록일은 <%=vo2.getRgstdate()%><br>
	<%
	} else {
	%>
	<h1 style="color: red">검색 결과가 없습니다</h1>
	<%
	}
	%>
</body>
</html>