<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="chap11.*" %>
<%@ page import="java.util.*" %>
<!-- forwarding이 됐다는 가정 -->
<%
	STData data1 = new STData("한조", 90);
	STData data2 = new STData("트레이서", 70);
	//request.setAttribute("key", data);
	
	HashMap<String, STData> map = new HashMap<String, STData>();
	
	map.put("key1", data1);
	map.put("key2", data2);
	
	
	request.setAttribute("student", map);
	
	//request.setAttribute("key1", data1);
	//request.setAttribute("key2", data2);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
${key }<br> <!-- toString을 출력 -->
${key.name }<br>
${key.test}<br> 
${key.score }<br>
--%>
<%--
${key1.name }<br>
${key1.score }<br>

${key2.name }<br>
${key2.score }<br>
--%>
${student.key1.name }<br>
${student.key1.score }<br>
</body>
</html>