<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");
	String login_id = request.getParameter("login_id");
	String login_pw = request.getParameter("login_pw");
	
	System.out.println("파라미터 확인 : "+login_id+" "+login_pw); //파라미터 확인 코드
	
	String sql = String.format("SELECT * FROM ROBATO_MEMBER WHERE ROBATO_MEMBER.M_ID='%s' AND ROBATO_MEMBER.M_PW='%s'", login_id, login_pw);
	
	System.out.println("실행될 쿼리 : "+sql); //로그 남기기
	
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
		//select
		
		boolean login = true;
		
		//로직 처리 시작
		//.next() 테이블 행을 읽는거
		if(rs.next()){
			login = true;
			//index.jsp에서 로그인 됐을때 보여질 정보
			String m_no = rs.getString("M_NO"); 
			session.setAttribute("sessionNo", m_no); //session이라는 공간에 sessionNo의 값을 넣는것
			
			String m_nick = rs.getString("M_NICK"); //DB의 M_NICK를 가져옴
			session.setAttribute("sessionNick", m_nick); //session이라는 공간에 sessionNick의 값을 넣는것 / hashmap처럼 key : value 형태로 저장
			
			response.sendRedirect("./index.jsp");
		}else{
			login = false;
			%><script type = "text/javascript">
            alert('비밀번호가 틀렸습니다');
            history.go(-1); 
			</script>
		<% }
		
		//로직 처리 끝
		rs.close();
		stm.close();
		conn.close();
		
		//index.jsp로 바로 가기
		//response.sendRedirect("./index.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 프로세스</title>
</head>
<body>
 로그인 프로세스
 	<%
 		if(login){
 			out.print("로그인에 성공했습니다");
 			out.print("<a href='./index.jsp'>메인페이지로 이동</a><br>");
 		}else{
 			out.print("로그인에 실패했습니다");
 		}
 	%>
</body>
</html>