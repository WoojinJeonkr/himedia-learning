<%@page import="com.hi.mvcProject.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니 목록</title>
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
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<h3>장바구니 현재 목록</h3>
			<hr>
			<%
				ArrayList<ProductVO> list = (ArrayList<ProductVO>) session.getAttribute("basket");
				if(list !=null){
			%>
			<%=list.size()%>개의 상품을 장바구니에 담으셨습니다.
			<table>
				<tr>
					<td class="left">상품번호</td>
					<td class="left">상품이름</td>
					<td class="left">상품가격</td>
					<td class="left">주문</td>
				</tr>
				<% for(ProductVO one: list) {%>
					<tr>
						<td class="right"><%= one.getId() %></td>
						<!-- one.getId() -->
						<td class="right"><%= one.getName() %></td>
						<td class="right"><%= one.getPrice() %></td>
						<td class="right"><button class="btn btn-primary">주문하기</button></td>
					</tr>
				<% } %>
			</table>
			<% } else { %>
			<span class="label label-default">0</span>개의 물건이 장바구니에 들어있습니다.
			<% } %>
		</div>
	</div>
</body>
</html>