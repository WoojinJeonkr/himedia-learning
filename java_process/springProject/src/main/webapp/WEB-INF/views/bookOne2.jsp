<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판[no.${one.id}]</title>
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
<script type="text/javascript">
	$(function() {
		$('#insertBtn').click(function() {
			$.ajax({
				url : "replyInsert",
				data : {
					bbsId : ${one.id},
					content : $('#reply').val(),
					writer : '${userId}'
				},
				success : function(result) {
					$('#reply').val('')
					 // 성공하면, 현재 목록 아래에 붙여넣자!
					$('#replyTable').append(result+'<br>')
				},
				errror : function() {
					alert("답글이 저장되지 않았습니다.")
				}
			})
		})
		$('#del').click(function() {
			if (confirm("정말로 삭제하시겠습니까?")) {
				// controller의 bbsDel 요청 후 삭제가 성공하면,
				// bbs.jsp로 화면을 넘기면 됨
				$.ajax({
					url : "bbsDel",
					data : {
						id : '${one.id}'
					},
					success : function(result) {
						// js: 타입이 달라도 기본형과 String까지 비교 가능
						if (result == 1) {
							location.href = "bbs.jsp"
						}
					}
				})
			}
		})
	})
</script>
<style>
.left {
	background: pink;
	width: 50px;
}

.right {
	background: white;
	width: 150px;
}
</style>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="../../top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="../../top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<span style="font-size: 25px;">물건 상세 페이지</span> <a href="bbs.jsp">
				<button style="width: 100px; height: 50px; font-size: 10px"
					class="btn btn-info">전체 목록으로!</button>
			</a>
			<!-- 로그인한 사람라과 작성자가 동일하면 수정, 삭제 버튼이 나타나도록 함, 세션 값과 one.writer가 동일하면!! -->
			<c:if test="${userId eq one.writer}">
				<a href="bbsUp?id=${one.id}">
					<button style="width: 200px; height: 50px;" class="btn btn-success">수정하기</button>
				</a>
				<button id="del" style="width: 200px; height: 50px;"
					class="btn btn-success">삭제하기</button>
			</c:if>
			<hr color=red>
			<table style="width: 500px;">
				<tr>
					<td class="left">번호</td>
					<td class="right">${one.b_id}</td>
				</tr>
				<tr>
					<td class="left">제목</td>
					<td class="right">${one.b_title}</td>
				</tr>
				<tr>
					<td class="left">내용</td>
					<td class="right" style="height: 100px;">${one.b_content}</td>
				</tr>
				<tr>
					<td class="left">작성자</td>
					<td class="right">${one.b_writer}</td>
				</tr>
			</table>
			<hr color=green>
			<table id="replyTable">
			<% if(session.getAttribute("userId") != null) { %>
			<tr>
				<td>
					Reply: <input id="reply" style="width: 200px;">
					<button id="insertBtn" style="width: 70px;">답글</button>
				</td>
			</tr>
			<% } %>
			<c:forEach var="one" items="${list}">
				<tr>
					<td style='background: green; width: 450px; text-align: left; padding-left: 10px;'>
						<img src="resources/img/re.png" width=30 height=30>${one.content} - ${one.writer}
					</td>
					<td style='background: green; width: 50px; text-align: right;'>
						<c:if test="${userId eq one.writer}">
								<button id="deleteBtn">삭제</button>
						</c:if>
					</td>
				</tr>
			</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>