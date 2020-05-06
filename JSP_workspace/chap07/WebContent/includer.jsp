<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Include 디렉티브</title>
</head>
<body>


<%
	//이건 지역변수 인데 왜 불러오는게 가능한가?
	//결과적으로 하나의 파일로 인지를 해서 변환을 하는 것
	int number = 10;
%>

<%@ include file="/includee.jspf" %>
공통변수 DATAFOLDER = "<%= dataFolder %>"
</body>
</html>