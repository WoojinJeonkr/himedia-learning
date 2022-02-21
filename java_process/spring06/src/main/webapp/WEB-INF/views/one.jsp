<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보 검색</title>
<style>
	td {
		width: 150px;
		height: 50px;
	}
	.left {
		background: cornsilk;
		text-align: center;
	}
	.right {
		background: bisque;
		text-align: center;
	}
	img {
		width: 150px;
		height: 150px;
	}
</style>
</head>
<body bgcolor="azure">
제품 정보 검색 결과입니다.<br>
<hr color="yellow">
<table border=1>
	<tr>
		<td class="left">제품 번호</td>
		<!-- one.getId() -->
		<td class="right">${one.id}</td>
	</tr>
	<tr>
		<td class="left">제품 이름</td>
		<td class="right">${one.name}</td>
	</tr>
	<tr>
		<td class="left">제품 설명</td>
		<td class="right">${one.content}</td>
	</tr>
	<tr>
		<td class="left">제품 가격</td>
		<td class="right">${one.price}</td>
	</tr>
	<tr>
		<td class="left">상품 이미지</td>
		<td class="right">
		<img src="resources/img/${one.img}">
		</td>
	</tr>
</table>
<a href="update?id=${one.id}&name=${one.name}&content=${one.content}&price=${one.price}"><button>수정</button></a>
<a href="delete?id=${one.id}"><button style="margin-left: 230px">삭제</button></a>
</body>
</html>