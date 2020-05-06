<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.Map" %>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요청 파라미터 출력</title>
</head>
<body>
	<%= request.getParameter("name") %> <br>
	<%= request.getParameter("address") %> <br>
	<%= request.getParameter("pet") %> <br> <!-- 한 개 값만 받음 -->
	<br>
	두 개 값 이상 받기 <br>
	<%
		String[] pets = request.getParameterValues("pet"); //두 개 값을 받음
	
		for(String pet : pets){
			out.println(pet+"<br>");
		}
	%>
	<br>
	Enum 객체 사용하기 <br> <!-- 이건 절대 쓸일 없다 -->
	
	<%
		//Arraylist랑 비스무리한것
		//파라미터 이름만 쫙 뽑는거?
		Enumeration<String> names = request.getParameterNames();
		
		while(names.hasMoreElements()){
			String name = names.nextElement();
			String value = request.getParameter(name);
			out.println(name+":"+value+"<br>");
		}
	%>
	<!-- 이것 또한 쓸모없다 -->
	<br>
	MAP 객체 사용하기...
	<%
		Map<String, String[]> map = request.getParameterMap();
		
		String [] values = map.get("address");
	%>
</body>
</html>