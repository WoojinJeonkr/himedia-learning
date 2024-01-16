<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/project.css">
</head>
<body>
	<hr>
	<% if(session.getAttribute("userId") != null) { %>
	<form action="memberDelete"> <!-- 컨트롤러의 memberDelete 로 간다.-->
		<input type="hidden" name="id" value="${userId}"><br>
		<button>정말로 회원탈퇴 하시겠습니까?</button>
	</form>
	<%}else{ %>
		로그인을 먼저 해주세요.
		<%}%>
	
</body>
</html>