<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	//글 삭제 프로세스
	
	request.setCharacterEncoding("utf-8");
	String b_no=request.getParameter("b_no");//삭제 시키기 위해 b_no의 값을 받아야함
	
	//parameter로 받은 b_no 값을 sql에 들어가야하는 부분에 넣어줌
	String sql=String.format("DELETE FROM FB_BOARD WHERE BOARD_NO=%s", b_no);
	
	//DB연동
	//클래스 동적 로드
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
	
	//바로 메인페이지로 넘어가게 처리
	response.sendRedirect("./main_page.jsp");
%>
