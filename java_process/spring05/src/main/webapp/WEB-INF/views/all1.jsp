<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- JSTL(JavaStandard Tag Library -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>북마크 전체 검색</title>
<style type="text/css">
	td {
		width: 150px;
		text-align: center;
	}
	.left {
		background: orange;
	}
	
	.right {
		background: lightblue;
	}
	hr {
		height: 30px;
		width: 300px;
		background: red;
		margin: 10px;
	}
	.text {
		font-family: "궁서"
	}
	img {
		width: 100px;
		height: 100px;
	}
</style>
</head>
<body>
<table border=1>
	<tr>
		<td class="left">번호</td>
		<td class="left">이름</td>
		<td class="left">이미지</td>
	</tr>
<c:forEach items="${list}" var="one">
	<tr>
		<td class="right">${one.id}</td>
		<td class="right">${one.name}</td>
		<td class="right">
			<a href="one1?id=${one.id}">
				<img src="resources/img/${one.img}">
			</a>
		</td>
	</tr>
</c:forEach>
</table>
</body>
</html>