<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>book</title>
</head>
<body>
	<form action="create">
		번호 : <input type="text" name="id"><br>
		이름 : <input type="text" name="name"><br>
		주소 : <input type="text" name="url"><br>
		이미지: <input type="text" name="img"><br>
		<button>북마크 추가</button>
	</form>
	<form action="update">
	 	이름 : <input type="text" name="name" ><br>
	   	주소 : <input type="text" name="url"><br>
   <button>북마크 수정</button>
	</form>
	<form action="delete">
		이름 : <input type="text" name="name"><br>
		<button>북마크 삭제</button>
	</form>
</body>
</html>

