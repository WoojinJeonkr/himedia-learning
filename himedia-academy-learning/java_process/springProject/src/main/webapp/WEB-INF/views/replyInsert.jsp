<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<tr>
	<td
		style='background: green; width: 450px; text-align: left; padding-left: 10px;'>
		<img src="resources/img/re.png" width=30 height=30>${one.content}
		- ${one.writer}
	</td>
	<td style='background: green; width: 50px; text-align: right;'><c:if
			test="${userId eq one.writer}">
			<button id="deleteBtn">삭제</button>
		</c:if></td>
</tr>