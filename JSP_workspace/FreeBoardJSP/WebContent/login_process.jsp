<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	//setCharacterEncoding를 해줘야함
	request.setCharacterEncoding("utf-8");
	//값을 받기 위한 
	String login_id = request.getParameter("login_id");
	String login_pw = request.getParameter("login_pw");
	
	String sql = String.format("SELECT * FROM FB_MEMBER WHERE MEMBER_ID='%s' AND MEMBER_PW='%s'", login_id, login_pw);
	
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
	
	//로직 처리 시작
	//로그인 화면에는 한 사람만 맞는지 확인하면 되기 때문에 반복문 대신 if문으로 처리
	//true이면 나오고 false이면 안나오고
	//여기서 sesstion처리
	boolean isSuccess = true;
	
	if(rs.next()){
		//로그인 성공인 경우
		isSuccess = true;
		
		//메인페이지에서 두가지 사용
		String no = rs.getString("MEMBER_NO"); //DB의 MEMBER_NO를 가져옴
		session.setAttribute("sessionNo", no); //session이라는 공간에 sessionNo의 값을 넣는것
		
		String nick = rs.getString("MEMBER_NICK"); //DB의 MEMBER_NICK를 가져옴
		session.setAttribute("sessionNick", nick);
		
		
		//System.out.println("성공");
	}else{
		//로그인 실패
		isSuccess = false;
		//System.out.println("실패");
	}	
	
	//로직 처리 끝

	rs.close();
	stm.close();
	conn.close();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login process</title>
</head>
<body>
<%
	if(isSuccess){
		out.print("로그인에 성공했습니다");
		out.print("<a href='./main_page.jsp'>메인페이지로 이동</a><br>");
	}else{
		out.print("아이디 혹은 비밀번호를 확인해 주세요<br>");
		out.print("<a href='./login_page.jsp'>로그인 페이지로</a><br>");
		out.print("<a href='./join_member_page.jsp'>회원가입 페이지로</a><br>");
	}
%>

</body>
</html>