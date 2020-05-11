<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr><td>글 번호</td><td>제목</td><td>작성자</td><td>작성일</td></tr>
		<c:forEach items="${BoardList}" var="data">
			<tr>
				<td>${data.BOARD_NO }</td>
				<td>${data.BOARD_TITLE }</td>
				<td>${data.MEMBER_NO }</td>
				<td>${data.BOARD_WRITEDATE }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>










