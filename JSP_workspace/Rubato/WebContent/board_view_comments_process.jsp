<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");
	
	String comment_text = request.getParameter("comment_text");
	String b_no = request.getParameter("b_no");
	String m_no = (String)session.getAttribute("sessionNo");
	
	//System.out.println("파라미터 값 확인 : "+comment_text+" 보드넘버 :"+b_no+" 멤버 넘버:"+m_no);
	
	String sql = String.format("INSERT INTO ROBATO_BOARD_COMMENTS VALUES (ROBATO_BOARD_COMMENTS_SEQ.NEXTVAL,%s,%s,'%s', SYSDATE)", b_no,m_no,comment_text);
	System.out.println(sql);
	
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
	
	response.sendRedirect("board_view.jsp?b_no="+b_no);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
</html>