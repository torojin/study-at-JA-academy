<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=pageContext.getAttribute("v1") %><br>
	<%=request.getAttribute("v1") %><br>
	<%=session.getAttribute("v1") %><br>
	<%=application.getAttribute("v1") %><br>
</body>
</html>