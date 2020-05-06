<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ page import="java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");
	//parameter 받아오기
	String title = request.getParameter("update_title");
	String content = request.getParameter("update_content");
	String b_no = request.getParameter("update_b_no");
	
	String sql = String.format("UPDATE FB_BOARD SET BOARD_TITLE='%s',BOARD_CONTENT='%s' WHERE BOARD_NO=%s", title, content, b_no);
	
	//DB연동...(SELECT)
	//클리스 동적 로드
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//DB연결
	String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	String dbUser = "SCOTT";
	String dbPW = "TIGER";
	
	Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPW);
	Statement stm = conn.createStatement();
	stm.executeUpdate(sql); 
	
	//로직 처리 시작
	
	//로직 처리 끝
	stm.close();
	conn.close();
	
	//메인페이지로 바로가게 처리
	response.sendRedirect("./main_page.jsp");
%>