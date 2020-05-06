<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 목록</title>
</head>
<body>
<%
	Cookie[] arr = request.getCookies();
	if(arr != null){
		for(Cookie c : arr){
			out.print(c.getName()+"=" + c.getValue());
			out.println("<br>");
		}
	}
%>
</body>
</html>


