<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link
	href="https://fonts.googleapis.com/css?family=Raleway:300,300,400,500,700,900"
	rel="stylesheet">
<style>
</style>
<!-- Additional CSS Files -->
<header id="header">
	<div class="container-fluid">
		<div class="navbar">
			<div class="navigation-row">
			<% if(session.getAttribute("userId") == null) { %>
				<nav id="navigation">
					<button type="button" class="navbar-toggle">
						<i class="fa fa-bars"></i>
					</button>
					<div class="nav-box navbar-collapse">
						<ul class="navigation-menu nav navbar-nav navbars" id="nav">
							<li style = "font-size:large;"><a href="member.jsp">로그인</a></li>
							<li style = "font-size:large;"><a href="memberCreate.jsp">회원가입</a></li>
							<li style = "font-size:large;"><a href="productList.jsp">상품정보</a></li>
							<li style = "font-size:large;"><a href="board.jsp">게시판</a></li>
							<li style = "font-size:large;"><a href="basket.jsp">장바구니</a></li>
							<li style = "font-size:large;"><a href="serviceMain.jsp">고객센터</a></li>
						</ul>
					</div>
				</nav>
				<% } else { %>
				<nav id="navigation">
					<button type="button" class="navbar-toggle">
						<i class="fa fa-bars"></i>
					</button>
					<div class="nav-box navbar-collapse">
						<ul class="navigation-menu nav navbar-nav navbars" id="nav">
							<li style = "font-size:large;"><a href="member.jsp">로그인</a></li>
							<li style = "font-size:large;"><a href="memberCreate.jsp">회원가입</a></li>
							<li style = "font-size:large;"><a href="productList.jsp">상품정보</a></li>
							<li style = "font-size:large;"><a href="board.jsp">게시판</a></li>
							<li style = "font-size:large;"><a href="basket.jsp">장바구니</a></li>
							<li style = "font-size:large;"><a href="serviceMain.jsp">고객센터</a></li>
						</ul>
						<a href="logout">
							<button style="width:200px; height:50px; float: right;" class="btn btn-success" >로그아웃</button>
						</a>
					</div>
				</nav>
				<% } %>
			</div>
		</div>
	</div>
</header>