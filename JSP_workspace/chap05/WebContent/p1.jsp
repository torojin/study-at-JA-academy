<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration"%>
<%@ page import="chap05.*" %><!-- DB 연동 정보 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>초기화 파라미터 읽어오기</title>
</head>
<body>
	<%
		//1. 최악의 방식
		//String user = "SCOTT";
		//String pw = "TIGER";
		
		//2.Java만 가지고 프로그래밍 한다면 나쁘지 않은 방식
		//String user = DBUserInfo.user;
		//String pw = DBUserInfo.pw;
		
		//3.xml로 연동 방식
		String user = application.getInitParameter("db_user");
		String pw = application.getInitParameter("db_pw");
		
		// DB 연동 코드
	%>
</body>
</html>