<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보 수정</title>
<style>
	body {
		background: lime;
	}
</style>
</head>
<body bgcolor="yellow">
<h3>제품 정보 수정</h3>
<form action="update">
<input type="hidden" name="id" value="${param.id}"><br>
제품 이름 : <input type="text" name="name" value="${param.name}"><br>
제품 설명 : <input type="text" name="content" value="${param.content}"><br>
제품 가격 : <input type="text" name="price" value="${param.price}"><br>
<button type="submit">정보 수정</button>
</form>
</body>
</html>