<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- forwarding이 된다는 가정하에 작성 / 지금은 포워딩이 안되어 있음
	4가지 저장공간의 이해 request, page,...
-->

<%
	//각각 다른 저장공간임
	//null값은 출력 안한다.
	pageContext.setAttribute("key", "A");
	request.setAttribute("key", "B");
	session.setAttribute("key", "C");
	application.setAttribute("key", "D");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${aaa }<br>
${key }<br>
<%-- 각각 출력하게 처리 / 근데 거의 안씀 굳이 뽑고 싶으면 아래처럼사용 --%>
${pageScope.key }<br>
${requestScope.key }<br>
${sessionScope.key }<br>
${applicationScope.key }<br>
</body>
</html>