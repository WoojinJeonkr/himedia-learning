<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>movie</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function() { // dom(document object model) tree
	// body dom tree로 ram에 읽어들인 후,
	// function을 실행해라. 익명함수 (anonymous function)
	// var a = 100
	// let a = 100
	// table-tr-td
	//		body -- 주소 : table : 주소 -- tr
	// 입력값으로 입력함수를 넣는 함수를 callback 함수라고 부른다.
	
	$('#b1').click(function() {
		// Json 표기법 : key-value
		$.ajax({
			url: "movie",
			data: {
				title : $('#title').val(),
				price : $('#price').val()
			},
			success: function(result) {
				alert(result);
				$('#d2').html(result);
			},
			error: function() {
				alert('ajax 실패.');
			}
		});
	});
	
	$('#b2').click(function() {
		$.ajax({
			url: "reply",
			data: {
				reply : $('#reply').val(),
			},
			success: function(result) {
				$('#d1').append("<img style='width:30px;' src='resources/img/face.png'>")
				$('#d1').append(result+"<br>")
			},
			error: function() {
				alert('ajax 실패.');
			}
		});
	});
	
	$('#b3').click(function() {
		// Json 표기법 : key-value
		$.ajax({
			url: "user",
			data: {
				user : $('#user').val()
			},
			success: function(result) {
				alert(result)
				$('#d2').html(result)
			},
			error: function() {
				alert('ajax 실패.');
			}
		});
	});
});
</script>
</head>
<body>
	영화제목: <input type="text" name="title" id="title"><br>
	영화관람료: <input type="text" name="price" id="price"><br>
	<button id="b1">영화 정보 제출</button>
	
<hr>
	댓글: <input type="text" name="reply" id="reply"><br>
	<button id="b2">댓글 달기</button>
<hr color="blue">
<div id="d1"></div>
<hr>
	가입할 id: <input type="text" name="user" id="user"><br>
	<button id="b3">아이디 중복 체크</button>
<hr color="blue">
<div id="d2"></div>
</body>
</html>