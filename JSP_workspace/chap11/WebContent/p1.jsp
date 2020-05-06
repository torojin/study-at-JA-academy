<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- forwarding이 된다는 가정하에 작성-->
<%
	String title = "안녕하세요";

	//forwarding이 됐을 땐 살아남는다
	request.setAttribute("key1", title);

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${key1 }<br>
</body>
</html>