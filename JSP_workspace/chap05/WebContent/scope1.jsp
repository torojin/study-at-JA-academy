<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//key, value 형태
	//hashmap 같은 경우는 v1이 중복되면 덮어씌어 지는데
	//이 경우엔 각각 생성
	pageContext.setAttribute("v1", "안녕하세요");
	request.setAttribute("v1","반갑습니다");
	session.setAttribute("v1", "잘부탁드려요");
	application.setAttribute("v1", "브리기테?");
%>
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