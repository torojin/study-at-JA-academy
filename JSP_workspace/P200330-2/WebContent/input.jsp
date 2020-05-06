<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input</title>
</head>
<body>
	<form action="process.jsp" method="post">
		<input type="text" name="content"><br> <%-- content는 키 : 값으로 날려줌 --%>
		<input type="submit" value="입력">		
	</form>
</body>
</html>