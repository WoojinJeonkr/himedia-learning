<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>제품 정보 검색</h3>
<form action="one">
아이디 : <input type="text" name="id"><br>
<button type="submit">제품 검색</button>
</form>

<h3>제품 전체 검색</h3>
<a href="all"><button>전체 검색 요청</button></a>

<h3>제품 추가</h3>
<form action="create">
아이디 : <input type="text" name="id"><br>
이름 : <input type="text" name="name"><br>
제품 설명 : <input type="text" name="content"><br>
가격 : <input type="text" name="price"><br>
이미지 : <input type="text" name="img"><br>
<button type="submit">정보 추가</button>
</form>
</body>
</html>