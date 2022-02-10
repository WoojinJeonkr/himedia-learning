<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원정보</title>
	<link rel="stylesheet" type="text/css" href="${contextPath}/css/style.css">
</head>
<body>
	<div class="container">
		<div class="section">
			<h2>${member_view.m_name}님의 회원정보<a href="logout" style="float:right">로그아웃</a></h2>
			<table class="bluetop">
				<tr>
					<th>이름</th>
					<td>${member_view.m_name}</td>
				</tr>
				<tr>
					<th>아이디</th>
					<td>${member_view.m_id}</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td>${member_view.m_pw}</td>
				</tr>
				<tr>
					<th>이메일</th>
					<td>${member_view.m_email}</td>
				</tr>
				<tr>
					<th>핸드폰</th>
					<td>${member_view.m_phone}</td>
				</tr>
				<tr>
					<th>수정일</th>
					<td>${member_view.m_mdfydate}</td>
					<td><fmt:formatDate value="${member_view.m_mdfydate}" pattern="yyyy-MM-dd"/></td>
				</tr>
				<tr>
					<th>등록일</th>
					<td>${member_view.m_rgstdate}</td>
					<td><fmt:formatDate value="${member_view.m_rgstdate}" pattern="yyyy-MM-dd"/></td>
				</tr>
			</table>
			<div class="btns">
				<button class="btn_style_view" onclick="location.href='${contextPath}/memberList'">회원목록</button>
			</div>
		</div>
	</div>
</body>
</html>