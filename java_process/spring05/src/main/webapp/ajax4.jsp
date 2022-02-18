<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>rss</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function() { // dom(document object model) tree
	$('#b1').click(function() {
		$.ajax({
			url: "resources/file/MOCK_DATA.json",
			success: function(result) {
				alert("곧 데이터가 출력됩니다.");
				$(result).each(function(i, one) {
					console.log(one.id)
					// div 안에  1000명의 성과 이름/이메일 출력
					first_name = one.first_name
					last_name = one.last_name
					email = one.email
					$('#d1').append("성: "+first_name +", 이름: "+ last_name +" / 이메일: "+ email +'<br>');
				})
			},
			error: function() {
				alert('연결 실패');
			}
		});
	});
});
</script>
</head>
<body>
	<button id="b1">data_file analysis</button>
	<hr color="orange">
	
	<div id="d1"></div>
</body>
</html>