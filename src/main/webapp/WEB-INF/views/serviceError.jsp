<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러</title>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="../../bookTop.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="../../serviceTop.jsp"></jsp:include>
		</div>
		<div id="center">
			<h3>에러</h3>
			<hr>
			<a href="serviceList"><button>목록보기</button></a>
			<a href="serviceWrite.jsp"><button>글쓰기</button></a>
		</div>
	</div>
</body>
</html>