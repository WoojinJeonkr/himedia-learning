<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원정보 수정</title>
	<link rel="stylesheet" type="text/css" href="${contextPath}/css/style.css">
	<script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
	<script>
	function member_update(){
		if($('#m_name').val() == ''){
			alert('이름을 입력해주세요.');
			$('#m_name').focus();
			return;
		}
		
		if($('#m_email').val() == ''){
			alert('이메일을 입력해주세요.');
			$('#m_email').focus();
			return;
		}

		if($('#m_phone').val() == ''){
			alert('핸드폰 번호를 입력해주세요.');
			$('#m_phone').focus();
			return;
		}
		
		// 비밀번호와 비밀번호 확인 폼 중 빈 값으로 되어 있지 않다면 두 개의 값이 같은지 확인
		if($("#m_pw").val() == '' || $("m_pwconfirm").val() != '') {
			if($('#m_pw').val() != $('#m_pwconfirm').val()){
				alert('비밀번호가 같지 않습니다.');
				return;
			}
		}
		
		if(confirm('회원정보를 수정하시겠습니까?')){
			$('#frmMember').submit();
			// alert('회원정보가 수정되었습니다.');
		}
	}
	</script>
</head>
<body>
	<div class="container">
		<div class="section">
			<h2>${member_update.m_name}님의 회원정보<a href="logout" style="float:right">로그아웃</a></h2>
			<table class="bluetop">
			<form action="${contextPath}/memberUpdate" method="post" id="frmMember">
			<input type="hidden" name="m_idx" id="m_idx" value="${member_update.m_idx}"/>
				<tr>
					<th>이름</th>
					<td><input type="text" name="m_name" id="m_name" value="${member_update.m_name}"></td>
				</tr>
				<tr>
					<th>아이디</th>
					<td>${member_update.m_id}</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="m_pw" id="m_pw"></td>
				</tr>
				<tr>
					<th>비밀번호 확인</th>
					<td><input type="password" name="m_pwconfirm" id="m_pwconfirm"></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input type="text" name="m_email" id="m_email" value="${member_update.m_email}"></td>
				</tr>
				<tr>
					<th>핸드폰</th>
					<td><input type="text" name="m_phone" id="m_phone" value="${member_update.m_phone}"></td>
				</tr>
			</form>
			</table>
			<div class="btns">
				<button class="btn_style_submit" onclick="member_update()">저장</button>
			</div>
			<div class="btns" style="float:left">
				<button class="btn_style_back" onclick="location.href='${contextPath}/'">취소</button>
			</div>
		</div>
	</div>
</body>
</html>