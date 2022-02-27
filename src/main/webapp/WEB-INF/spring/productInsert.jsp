<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="../../../bookTop.jsp"></jsp:include>
		</div>
		<div id="center">
		<h3>상품정보 등록</h3>
		<br>
			<form action="productInsert2">
			
				p_category :<input type="text" class="form-control" name="p_category"/><br>
				p_isbn :<input type="text" class="form-control" name="p_isbn"/><br>
				p_author :<input type="text" class="form-control" name="p_author"/><br>
				p_company :<input type="text" class="form-control" name="p_company"/><br>
				p_page :<input type="text" class="form-control" name="p_page"/><br>
				p_weight<input type="text" class="form-control" name="p_weight"/><br>
				p_price:<input type="text" class="form-control" name="p_price"/><br>
				p_title:<input type="text" class="form-control" name="p_title"/><br>
				p_content<input type="text" class="form-control" name="p_content"/><br>
				p_img<input type="text" class="form-control" name="p_img" value="defaultbook.jpg"/><br>
				<button type="submit" class="btn btn-success">Submit</button>
			
			</form>
		</div>
	</div>
</body>
</html>