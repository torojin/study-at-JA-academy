<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<%
	session.setAttribute("sessionNick","cocoa");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 문자열 값이 false나 아니냐..??????? -->
	<c:if test="${!empty sessionNick }">
		${sessionNick }님 환영합니다.<br>
	</c:if>
	<c:if test="${empty sessionNick }">
		비회원으로 접근하였습니다.<br>
	</c:if>
	
	<c:choose>
		<c:when test="${!empty sessionNick }">
			${sessionNick }님 환영합니다.<br>
		</c:when>
		<c:otherwise>
			비회원으로 접근하였습니다.<br>
		</c:otherwise>
	</c:choose>
	
</body>
</html>