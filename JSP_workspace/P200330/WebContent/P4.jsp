<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>P4</title>
</head>
<body>
	안녕하세요, P3에서 값을 받아옴<br>
	<%
	String value1 = request.getParameter("id"); //P3의 name의 값을 넣어줌
	out.println(value1+"으로 로그인 되었습니다");
	String value2 = request.getParameter("pw");
	%>
	<%=value2+"이것은 패스워드입니다." %>
	<%

	%>
</body>
</html>