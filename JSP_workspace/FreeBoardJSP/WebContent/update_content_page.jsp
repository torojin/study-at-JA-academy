<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");

	//read_content_page.jsp에서 수정페이지 쪽에 b_no parameter를 받아온다
	//out.println("<a href='./update_content_page.jsp?b_no="+b_no+"'>수정</a>");
	String b_no = request.getParameter("b_no");
	
	//b_no parameter받아서 DB에 SELECT할 sql문 삽입
	String sql=String.format("SELECT * FROM FB_BOARD B, FB_MEMBER M WHERE B.MEMBER_NO=M.MEMBER_NO AND B.BOARD_NO=%s", b_no);
	
	System.out.println("실행된 쿼리 : "+sql);//로그 보기
	
	//DB연동...(SELECT)
	//클리스 동적 로드
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//DB연결
	String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	String dbUser = "SCOTT";
	String dbPW = "TIGER";
	
	Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPW);
	Statement stm = conn.createStatement();
	ResultSet rs = stm.executeQuery(sql); // SELECT는 executeQuery()로 사용 / 보통 static으로 관리하면 편할것
	
	//로직 처리 시작
	rs.next();
	String title = rs.getString("BOARD_TITLE");
	String content = rs.getString("BOARD_CONTENT");
	String nick = rs.getString("MEMBER_NICK");
	
	//로직 처리 끝
	rs.close();
	stm.close();
	conn.close();
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
</head>
<body>
	<h2>글수정</h2>
	<form action="./update_content_process.jsp" method="post">
		작성자 :<%=nick %><br>
		제목 : <input type="text" value="<%=title%>" name="update_title"><br>
		내용 <br>
		<textarea rows="7" cols="40" name="update_content"><%=content %></textarea>
		<br>
		<input type="hidden" value="<%=b_no%>" name="update_b_no">
		<input type="submit" value="수정">
	</form>
</body>
</html>