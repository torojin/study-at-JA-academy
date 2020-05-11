<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");//한글 깨지는 문제때문에 삽입
	String b_no = request.getParameter("b_no"); // request 객체에 담아서 getParameter로 값 받아옴 / Hashmap형태 : 키로 값을 뽑아오는 형태 / 
	
	String sql = String.format("SELECT * FROM FB_BOARD, FB_MEMBER WHERE FB_MEMBER.MEMBER_NO=FB_BOARD.MEMBER_NO AND FB_BOARD.BOARD_NO = %s", b_no);

	System.out.println("실행될" +sql);
	//DB연동...(SELECT)
	//클리스 동적 로드
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//DB연결
	String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	String dbUser = "SCOTT";
	String dbPW = "TIGER";
	
	Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPW);
	Statement stm = conn.createStatement(); //상태와 관련된 객체를 가져온다
	ResultSet rs = stm.executeQuery(sql); // SELECT는 executeQuery()로 사용 / 보통 static으로 관리하면 편할것
	
	//로직 처리 시작
	//변수 세팅 
	//getInt()는 int형으로
	//아래 변수들은 지역변수여서 실행이 끝나고 나서 소멸될것
	//출력을 위한 데이터 받기
	rs.next();
	String title = rs.getString("BOARD_TITLE");
	String content = rs.getString("BOARD_CONTENT");
	//content=content.replaceAll("\n","<br>"); //게시글 작성된 글 중 엔터가 들어간것 중 \n으로 처리된 것들을 br로 처리되게 바꿔준것 
	content=content.replaceAll("<","&lt");
	content=content.replaceAll(">","&gt");
	String nick = rs.getString("MEMBER_NICK");
	String writedate = rs.getString("BOARD_WRITEDATE");
	
	String writerNo = rs.getString("MEMBER_NO"); //회원번호 출력
	
	//로직 처리 끝
	rs.close();
	stm.close();
	conn.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시글 보기</h2>
	작성자 : <%=nick%><br>
	작성일 : <%=writedate %><br>
	제목 : <%=title %><br>
	내용 <br>
	<%=content %>
	<br><br>
	<a href="./main_page.jsp">목록으로</a>
	
	<%
		//글 삭제,수정 하기 위한 기능 
		String sessionNo = (String)session.getAttribute("sessionNo");
		
		//로그인 안한 사용자가 접근하면 nullPointException이 발생한다
		//이걸 방지하려면?
		//&&(and 연산자)자는 앞쪽이 fales면 수행을 안한다 / 이땐 nullPointException발생 안함
		//이런식으로 nullPointException 예외처리를 많이 한다 
		// null인지 아닌지 확인
		if(sessionNo != null && sessionNo.equals(writerNo)){
			//글 삭제
			out.println("<a href='./delete_content_process.jsp?b_no="+b_no+"'>삭제</a>");
			//글 수정
			out.println("<a href='./update_content_page.jsp?b_no="+b_no+"'>수정</a>");
		}
		
	
	
	%>
	
	
	
</body>
</html>