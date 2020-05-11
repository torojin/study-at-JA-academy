<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<% 
	request.setCharacterEncoding("utf-8");
	
	String join_name = request.getParameter("join_name");
	String join_id = request.getParameter("join_id");
	String join_pw = request.getParameter("join_pw");
	String join_nick = request.getParameter("join_nick");
	String join_number = request.getParameter("join_number");
	String join_birth = request.getParameter("join_birth");
	
	String sql = String.format("INSERT INTO ROBATO_MEMBER VALUES(ROBATO_MEMBER_SEQ.NEXTVAL, '%s', '%s', '%s', '%s', '%s', '%s', sysdate)", join_name, join_id, join_pw, join_nick, join_number, join_birth);
	
	System.out.println("실행될 쿼리 : " + sql);//데이터 삽입 확인 로그 
	
	//DB연동
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	//DB정보 변수 선언
	String dbURL = "jdbc:oracle:thin:@211.183.2.12:1521:xe";
	String dbUser = "SCOTT";
	String dbPW = "TIGER";
	
	Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPW);
	Statement stm = conn.createStatement();
	stm.executeUpdate(sql);
	
	stm.close();
	conn.close();
		
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	회원가입을 축하드립니다<br>
	<a href="../index.jsp">메인페이지로</a>
</body>
</html>