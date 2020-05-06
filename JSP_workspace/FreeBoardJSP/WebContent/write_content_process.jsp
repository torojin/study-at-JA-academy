<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");

	String write_title = request.getParameter("write_title");
	String write_content = request.getParameter("write_content");
	String member_no = (String)session.getAttribute("sessionNo"); //object이기 때문에 String으로 타입 캐스팅해주고
	
	
	//DB 기준에서는 숫자형이지만 여기 기준에서는 String이다.
	//DB에 삽입되는 거기 때문에 그 형태로 들어가게 해줘야한다. DB쪽 number는 ''넣지 않는다
	String sql = String.format("INSERT INTO FB_BOARD VALUES(FB_BOARD_SEQ.NEXTVAL, %s, '%s', '%s', SYSDATE)", member_no, write_title, write_content);

	//TEST code
	System.out.println("실행될 쿼리 : " + sql);//데이터 삽입 확인 로그 
	
	//DB연동
	//클리스 동적 로드
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//DB연결
	String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	String dbUser = "SCOTT";
	String dbPW = "TIGER";
	Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPW);
	Statement stm = conn.createStatement();
	stm.executeUpdate(sql);
	
	//자원이 생성된 것의 역순으로 close를 시켜줘야함
	stm.close();
	conn.close();
	
	//바로 메인페이지로 넘어가게 처리
	response.sendRedirect("./main_page.jsp");
%>
