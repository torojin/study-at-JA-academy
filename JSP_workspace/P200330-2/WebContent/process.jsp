<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %> <%-- 자바 sql 있는 인터페이스를 다 사용하겠따 //표준화된 인터페이스 사용 --%>
<%
	//한글 사용하려면 꼭 인코딩 해줘야함
	request.setCharacterEncoding("utf-8");
	//content의 값을 받아옴
	String content = request.getParameter("content");
	
	//쿼리 생성
	String query = "INSERT INTO TEST_200330 VALUES('"+content+"', SYSDATE)";
	
	System.out.println("실행될 쿼리 : "+ query);
	
	//DB연동 API
	Class.forName("oracle.jdbc.driver.OracleDriver"); //동적으로 로드?
	
	String url="jdbc:oracle:thin:@localhost:1521:xe";//내컴퓨터 오라클 서버에 들어간다 / 다른 서버에 접속할거면 다른걸로
	
	Connection conn = DriverManager.getConnection(url, "SCOTT", "TIGER"); //오라클에 접속하기 / connection이라는 클래스가... 
	Statement stm = conn.createStatement(); //접속을 하고 하나의 실행과 관련된 처리를 하는 statement를.. / 리턴타입 statement / 실행과 관련된 핵심!
	stm.executeUpdate(query); //이 시점에서 데이터 삽입 
	// insert, delete, update는 excuteUpdate() 쓰면 됨 / select는 query는 executeQuery() 사용 resultSet
	
	conn.close(); 
	stm.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>process</title>
</head>
<body>
	입력 완료!
	<a href="./content_list.jsp">내용보기</a>
</body>
</html>