<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red">
<h3>Stock information crawling</h3>
<hr>
<h3>주식 정보 가져오기</h3>
<p style="color: white; font-size:12px;">입력한 코드 값의 주식 정보가 db에 저장됩니다</p>
<form action="stock.do">
code : <input name="code" placeholder="insert code..."><br>
<button>code로 네이버에서 크롤링하여 db에 저장</button>
</form>
<hr color=yellow>
<p style="color: white; font-size:12px;">버튼을 클릭하시면 주식 정보가 db에 저장됩니다</p>
<a href="stock.do?code=005380">
	<button>현대자동차</button>
</a>
<a href="stock.do?code=000660">
	<button>Sk 하이닉스</button>
</a>
<a href="stock.do?code=086790">
	<button>하나금융지주</button>
</a>

<hr color=green>
<p style="color: white; font-size:12px;">여러분이 입력한 값을 db에 저장하실 수도 있습니다</p>
<form action="create.do">
code : <input name="code" placeholder="insert code..."><br>
company : <input name="company" placeholder="input company name..."><br>
today : <input name="today" placeholder="input today's date..."><br>
yesterday : <input name="yesterday" placeholder="input yesterday's date..."><br>
high : <input name="high" placeholder="input high price..."><br>
<button>db에 저장</button>
</form>
</body>
</html>