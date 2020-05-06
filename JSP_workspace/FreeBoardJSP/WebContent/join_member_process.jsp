<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ page import="java.sql.*" %>
<%
	
	request.setCharacterEncoding("utf-8"); //한글로 깨지지 않게 하기 위해 삽입
	//parameter 값 받기
	String id = request.getParameter("id"); //숫자로 넘겨도 string타입이다 / 연산하고 싶으면 문자로 받고 int타입으로 형변환을 시켜줘야한다
	String pw = request.getParameter("pw");
	String nick = request.getParameter("nick");
	String phone = request.getParameter("phone");
	
	//DB에 데이터 삽입
	//문법적으로 작업
	//String sql = "INSERT INTO FB_MEMBER VALUES(FB_MEMBER_SEQ.NEXTVAL,'"+id+"','"+pw+"','"+nick+"','"+phone+"',SYSDATE)";
	//위의 방식은 코드보기가 어려우니까 좀더 쉬운방식이 있는가?
	//API를 적용해서 작업한것 / printf랑 비슷한듯
	String sql = String.format("INSERT INTO FB_MEMBER VALUES(FB_MEMBER_SEQ.NEXTVAL, '%s','%s','%s','%s',SYSDATE)", id, pw, nick, phone);
	
	//TEST code
	System.out.println("실행될 쿼리 : " + sql);//데이터 삽입 확인 로그 
	
	//DB연동
	//클리스 동적 로드
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//DB연결
	String dbURL = "jdbc:oracle:thin:@211.183.2.12:1521:xe";
	String dbUser = "SCOTT";
	String dbPW = "TIGER";
	Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPW);
	Statement stm = conn.createStatement();
	stm.executeUpdate(sql);
	
	//자원이 생성된 것의 역순으로 close를 시켜줘야함
	stm.close();
	conn.close();
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join member process</title>
</head>
<body>
회원가입을 축하드립니다<br>
<a href="./login_page.jsp">로그인 페이지로</a>
</body>
</html>