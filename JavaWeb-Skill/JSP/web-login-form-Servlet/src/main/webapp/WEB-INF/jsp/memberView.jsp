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
	<script>
	function member_del(value, idx) {
		if(confirm(value+"님을 삭제하시겠습니까?")) {
			location.href= "${contextPath}/memberDelete?m_idx="+idx;
		}
	}
	</script>
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
					<th>이메일</th>
					<td>${member_view.m_email}</td>
				</tr>
				<tr>
					<th>핸드폰</th>
					<td>${member_view.m_phone}</td>
				</tr>
				<tr>
					<th>사진</th>
					<td>${member_view.m_file}</td>
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
			<div class="btns" style="float:left">
				<button class="btn_style_edit" onclick="location.href='${contextPath}/memberMdfy?m_idx=${member_view.m_idx}'">회원정보 수정</button>
			</div>
			<div class="btns" style="position: absolute; left: 50%; transform: translateX(-50%);">
				<button class="btn_style_view" onclick="location.href='${contextPath}/memberList'">회원목록</button>
			</div>
			<div class="btns" style="float:right">
				<button class="btn_style_delete" onclick="member_del('${member_view.m_name}', '${member_view.m_idx}')">삭제</button>
			</div>
		</div>
	</div>
</body>
</html>