<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");

	String member_no = (String)session.getAttribute("sessionNo");
	String write_title = request.getParameter("write_title");
	String write_content = request.getParameter("write_content");
	
	
	System.out.println("파라미터 확인 : "+write_title+" "+write_content+" "+member_no);
	
	String sql = String.format("INSERT INTO ROBATO_BOARD VALUES(ROBATO_BOARD_SEQ.NEXTVAL, %s, '%s', '%s', 0, SYSDATE)", member_no,write_title,write_content);
	
	System.out.println("실행될 쿼리 : "+sql);

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
	response.sendRedirect("./board_list.jsp");
%>