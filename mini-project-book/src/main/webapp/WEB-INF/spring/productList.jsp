<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보</title>
<link rel = "stylesheet" type = "text/css" href = "resources/css/project2.css">
</head>
<body>
	<% if(session.getAttribute("userId") == null) { %>
		<span style="color: blue; float: right;">비회원 로그인 상태입니다.</span><br>
	<% } else if(session.getAttribute("userId").equals("admin")){ %>
		<span style="color: blue; float: right;">${userId}님 로그인되었습니다. 좋은 하루 되세요.</span><br>
	<% } else if(session.getAttribute("userId") != null) { %>
		<span style="color: blue; float: right;">${userId}님 로그인되었습니다. 좋은 하루 되세요.</span><br>
	<% } %>
	<hr color="lightgray">
	<table border="1"> 
		<tr>
			<% int i=0; %>   
			<c:forEach items="${list}" var="one">
			<% i += 1; %>
			<td>
			    <div><img src="resources/img/${one.p_img}" width="400px" height="350px"></div>
				<div style="display: none;">${one.p_idx}</div><!-- one.getId() -->
				<div>책 카테고리 :${one.p_category}</div> <!-- one.getId() -->
				<div>책 제목:<a href="productOne?p_idx=${one.p_idx}">${one.p_title}</a></div>
				<div>책 가격: ${one.p_price}원</div>     
			</td> 
			<% if(i%6==0){ %>
			<tr>
			</tr>
			<% } %>
			</c:forEach>
		</tr>
	</table>
</body>
</html>