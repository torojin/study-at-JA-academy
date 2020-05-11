<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.setAttribute("nick", "cocoa");
	request.setAttribute("test", 1);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${nick } 님 환영합니다. <br>
	
	${!empty id }<br>
	
	${sessionNick == writer && aaa === bb}<br>
	
	${test + 4 }<br> <%-- MVC모델에선 연산은 웬만하면 작업하지 않는게 좋다. / view부분은 순수하게 view기능만 되게 처리할것 --%>
</body>
</html>