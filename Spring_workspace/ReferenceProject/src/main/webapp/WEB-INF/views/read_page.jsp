<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<pre>
	<c:forEach items="${boardVoAll }" var="data" >
		<tr>
			<td>${data.board_no }</td>
			<td>${data.board_title }</td>
			<td>${data.board_content }</td>
			<td>${data.board_writedate }</td>
		</tr>
	</c:forEach>
	
</pre>	
</body>
</html>