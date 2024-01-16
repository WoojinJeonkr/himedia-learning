<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>북마크 추가</h3>
<form action="create">
번호 : <input type="text" name="id"><br>
이름 : <input type="text" name="name"><br>
링크 : <input type="text" name="url"><br>
이미지 : <input type="text" name="img"><br>
<button type="submit">서버로 전송</button>
</form>

<h3>북마크 검색</h3>
<form action="one1">
번호 : <input type="text" name="id"><br>
<button type="submit">서버로 전송</button>
</form>

<h3>북마크 전체 검색</h3>
<a href="all1"><button>전체 검색 요청</button></a>

</body>
</html>