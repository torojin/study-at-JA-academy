<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main page</title>
<style>
	#wrapper{
		width : 600px;
		height : 800px;
		border : 1px solid black;
		margin : 0 auto;
	}
</style>
</head>
<body>
	<div id="wrapper">
		<h1>게시판</h1><br>
		<%
			//넣을땐 다형성에 의해서 사용은 가능하지만, 오브젝트 타입이기 때문에 뽑아 나올때는 타입 캐스팅을 해줘야한다
			//내부 자료구조는 Hashmap형태이다
			String sessionNick = (String)session.getAttribute("sessionNick"); //키로된 값을 뽑아와라
			if(sessionNick == null){
				out.println("비회원으로 접근하셨습니다");
				out.println("<a href='./login_page.jsp'>로그인 페이지로</a>");
			}else{
				out.println(sessionNick+"님 환영합니다");
				out.println("<a href='./logout_process.jsp'>로그아웃</a>");
			}
		%>
		<br>
		<!-- 내용 테이블 -->
		<table border="1">
			<tr>
				<td>글번호</td><td>제목</td><td>작성자</td>
				<%
				String sql = "SELECT * FROM FB_BOARD, FB_MEMBER WHERE FB_BOARD.MEMBER_NO = FB_MEMBER.MEMBER_NO ORDER BY FB_BOARD.BOARD_NO DESC";
				
				System.out.println("실행될 코드 : "+sql);
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
				//반복문으로 처리
				while(rs.next()){
					String b_no = rs.getString("BOARD_NO");
					String b_title = rs.getString("BOARD_TITLE");
					String m_nick = rs.getString("MEMBER_NICK");
					
					out.print("<tr>");
					out.print("<td>"+b_no+"</td>");
					out.print("<td><a href='./read_content_page.jsp?b_no="+b_no+"'>"+b_title+"</a></td>"); //?b_no=3 링크로 값을 보내는 get방식 / request.get....
					out.print("<td>"+m_nick+"</td>");
					out.print("</tr>");
					out.println();
				}
				
				//로직 처리 끝
				rs.close();
				stm.close();
				conn.close();
				%>
			</tr>
			
		</table>
		
		<%
			//문법적으로 이런식으로 사용할 수 있다
			if(sessionNick != null){
				out.println("<a href='./write_content_page.jsp'>글쓰기</a>");
		%>
		<%
			}		
		%>
		
	</div>
</body>
</html>