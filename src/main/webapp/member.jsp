<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="bookTop.jsp"></jsp:include>
		</div>
		<div id="center">
		<% if(session.getAttribute("userId") == null) { %>
		<h3 class="active">회원 로그인</h3>
			<form action="memberCheck">
					<table>
					<tr>
						<td class="left">아이디</td>
						<td class="right"><input class="form-control input-lg"  type="text" name="id"></td>
					</tr>
					<tr>
						<td class="left">패스워드</td>
						<td class="right"><input  class="form-control input-lg"  type="text" name="pw"></td>
					</tr>
					<tr>
						<td colspan="2">
						<button  style="width:200px; height:50px;" class="btn btn-danger" type="submit">로그인하기</button>
						</td>
					</tr>
				</table>
			</form>
			<% } else { %>
			<span style="color:red; font-size: 20px; font-weight: bold; margin-left: 50px;">${userName}님!! 환영합니다. 아이디가 ${userId}로 로그인되었습니다.</span>
			<% } %>
		</div>
	</div>
</body>
</html>