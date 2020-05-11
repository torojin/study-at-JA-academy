<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
	ArrayList<String> list = new ArrayList<String>();

	list.add("안녕1");
	list.add("안녕2");
	list.add("안녕3");
	list.add("안녕4");
	list.add("안녕5");
	list.add("안녕6");
	
	request.setAttribute("titles", list);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${titles }" var="title" varStatus="name"> <%-- varStatus : 상태를 담는 변수 --%>
		${title } : ${name.index + 1}<br>	
	</c:forEach>

</body>
</html>






