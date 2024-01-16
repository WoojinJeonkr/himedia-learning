<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/project.css">
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
/* $(function () {
$('#updateBtn').click(function() {
	$.ajax({
		url: "productUp",
		data: {
			p_idx: ${one.p_idx},	
			p_category: '${one.p_category}',
			p_price: ${one.p_price}
		},
		success : function(result) {
			if(result == '1'){
				location.href = "productList.jsp"
				}
			},
		error:function(){
			alert('수정 실패')
			}
		})//ajax
	})//updateBtn
}) */
</script>

<style>
td {
	background: white;
	height: 30px;
}
</style>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="../../../bookTop.jsp"></jsp:include>
		</div>
		<div id="center">
			<form action="productUpdate2">
				<div class="form-group">
					<label for="title"></label> <input type="hidden" name="p_idx"
						class="form-control" name="p_idx" value="${one.p_idx}">
				</div>
				<div class="form-group">
					<label for="content">p_category:</label> 					
					<textarea rows="5" cols="5" class="form-control" name="p_category"
						style="background: white-space;color: green; font-weight: bold;"
					>${one.p_category}</textarea>
				</div>
				<div class="form-group">
					<label for="title">p_price:</label> <input type="text"
						class="form-control" name="p_price" value="${one.p_price}">
				</div>
					<button type="submit" class="btn btn-success">Submit</button>
			</form>
		</div>
	</div>
</body>
</html> 