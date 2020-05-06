<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>content_list</title>
</head>
<body>
	내용리스트 : <br>
	<%-- DB연동 출력--%>
	<%
		String query = "SELECT * FROM TEST_200330";
	
		//DB연동 API
		Class.forName("oracle.jdbc.driver.OracleDriver"); //동적으로 로드?
		String url="jdbc:oracle:thin:@localhost:1521:xe";//내컴퓨터 오라클 서버에 들어간다 / 다른 서버에 접속할거면 다른걸로
		Connection conn = DriverManager.getConnection(url, "SCOTT", "TIGER"); //오라클에 접속하기 
		Statement stm = conn.createStatement();
		//이제 select이기 때문에 executeQuery으로 부름
		ResultSet rs = stm.executeQuery(query);  //리턴타입 ResultSet
		
		while(rs.next()){
			//값은 다가져오는데 next를 호출할때 마다...
			String content = rs.getString("T_CONTENT");
			String date = rs.getString("T_WRITE_DATE");
			
			out.print("내용 : "+content+", 작성일 : "+date+"<br>");
		}
							
	%>
	<a href="./input.jsp">글 입력</a>
</body>
</html>