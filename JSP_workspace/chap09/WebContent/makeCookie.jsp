<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.net.URLEncoder" %>
<%
	Cookie cookie = new Cookie("name",URLEncoder.encode("최번균", "utf-8"));
	response.addCookie(cookie);
	
	Cookie cookie1 = new Cookie("name", "qqqq");
	
	response.addCookie(cookie1);
	
	Cookie cookie2 = new Cookie("v1","hello");
	response.addCookie(cookie2);
	
	Cookie cookie4 = new Cookie("name", "dddd");
	cookie4.setMaxAge(60);// 60초 뒤에 웹 브라우저에서 삭제 시킴
	response.addCookie(cookie4);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키생성</title>
</head>
<body>
<%=cookie.getName() %> 쿠키의 값 = "<%=cookie.getValue() %>"
</body>
</html>