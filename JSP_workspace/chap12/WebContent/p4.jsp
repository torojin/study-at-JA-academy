<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="name" value="안녕하세요" scope="session"></c:set>
	<c:remove var="name" scope="page"/> <%-- scope를 안쓰면 싹다 지움 --%>
	
	${name }<br> <%-- 이 형식은 잘 안씀 --%>
	
</body>
</html>