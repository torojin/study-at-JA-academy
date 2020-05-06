<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");
	
	String b_no = request.getParameter("b_no"); //board_list의 글번호를 받아온ㄴ다
	String m_no = (String)session.getAttribute("sessionNo");

	System.out.println("파라미터 확인 : "+b_no+" "+m_no);

	String sql = String.format("SELECT B.B_NO, B.M_NO, B.B_TITLE, B.B_CONTENT,TO_CHAR(B.B_WRITEDATE, 'YYYY-MM-DD') B_WRITEDATE, M.M_NICK, B.B_COUNT FROM ROBATO_BOARD B, ROBATO_MEMBER M WHERE B.M_NO=M.M_NO AND B.B_NO='%s'", b_no);
	
	System.out.println(sql);
	//DB연동
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	String dbUser = "SCOTT";
	String dbPW = "TIGER";
	
	Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPW);
	Statement stm = conn.createStatement(); //상태와 관련된 객체를 가져온다
	ResultSet rs = stm.executeQuery(sql); // SELECT는 executeQuery()로 사용 / 보통 static으로 관리하면 편할것
	
	//로직 처리 시작
	rs.next();
	String title = rs.getString("B_TITLE");
	String content = rs.getString("B_CONTENT");
	String nick = rs.getString("M_NICK");
	String writedate = rs.getString("B_WRITEDATE");
	String b_count = rs.getString("B_COUNT");
	String writerNo = rs.getString("M_NO");
	
	/*

	
	stm = conn.createStatement();
	stm.executeUpdate(up_sql); 
	stm.close();
	*/
	
	//로직 처리 끝
	rs.close();
	stm.close();
	conn.close();
%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="utf-8">
<title>클래식기타 커뮤니티</title>
<link rel="stylesheet" type="text/css" href="css/common.css">
<link rel="stylesheet" type="text/css" href="css/header.css">
<link rel="stylesheet" type="text/css" href="css/footer.css">
<link rel="stylesheet" type="text/css" href="css/board_left.css">
<link rel="stylesheet" type="text/css" href="css/board_view_main.css">
</head>
<body>
<div id="wrap">
<header>
  <a href="index.jsp"><img id="logo" src="img/logo.png"></a>
<nav id="top_menu">
  HOME | LOGIN | JOIN | NOTICE
</nav>
<nav id="main_menu">
  <ul>
    <li><a href="board_list.jsp">자유 게시판</a></li>
    <li><a href="#">기타 연주</a></li>
    <li><a href="#">공동 구매</a></li>
    <li><a href="#">연주회 안내</a></li>
    <li><a href="#">회원 게시판</a></li>
  </ul>
</nav>
</header> <!-- header -->
<aside>
  <article id="login_box">
  <form action="login_process.jsp" method="GET">
    <img id="login_title" src="img/ttl_login.png">
    <!-- 로그인 처리-->
    <%
    	//login_process.jsp에서 session.setAttribute("sessionNick", m_nick);를 받아옴
    	String sessionNick = (String)session.getAttribute("sessionNick");
    	if(sessionNick == null){
    	%>
	<div id="input_button">  
    	<ul id="login_input">
    	<li><input type="text" name="login_id"></li>
    	<li><input type="password" name="login_pw"></li>
		</ul>
		<input id="login_btn" type="image" src="img/btn_login.gif">
    	<!-- <img id="login_btn" src="img/btn_login.gif"> -->
    </div> 
    <div class="clear"></div>
    <div id="join_search">
      	<a href="./join/join_member_page.jsp"><img src="img/btn_join.gif"></a>
      	<img src="img/btn_search.gif">
    </div>
    <% }else{ %>
    <ul id="login_input">
    	<li><%=sessionNick %>님 환영합니다</li>
    	<li><a href='logout_process.jsp'>로그아웃</a></li>
	</ul>
	<%} %>
  </form>
  </article>
  <nav id="sub_menu">
    <ul>
      <li><a href="board_list.jsp">+ 자유 게시판</a></li>
      <li><a href="#">+ 방명록</a></li>
      <li><a href="#">+ 공지사항</a></li>
      <li><a href="#">+ 등업요청</a></li>
      <li><a href="#">+ 포토갤러리</a></li>
    </ul>
  </nav>
  <article id="sub_banner">
    <ul>
      <li><img src="img/banner1.png"></li>
      <li><img src="img/banner2.png"></li>		
      <li><img src="img/banner3.png"></li>
    </ul>	
  </article>
</aside> 

<section id="main">
  <img src="img/comm.gif">
  <h2 id="board_title">자유 게시판 </h2>
  <div id="view_title_box"> 
    <span><%=title%></span>
    <span id="info"><%=nick %> | 조회 : <%=b_count %> | <%=writedate %></span>
  </div>	
  <%
	//DB연동...(SELECT)
	//클리스 동적 로드
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//DB연결
	conn = DriverManager.getConnection(dbURL, dbUser, dbPW);
	stm = conn.createStatement();
	
	String up_sql = String.format("UPDATE ROBATO_BOARD SET B_COUNT=B_COUNT+1 WHERE B_NO='%s'", b_no);
	
	System.out.println("update에서 받는 게시판 넘버 : "+b_no);
	System.out.println(up_sql);
	stm.executeUpdate(up_sql); 
	
	//로직 처리 시작
	
	//로직 처리 끝
	stm.close();
	conn.close();
  %>
  <p id="view_content">
	<%=content %>
  </p>		
<table>
	<tr>
        <th>글쓴이</th>
        <th>commends</th>
        <th>일시</th>
    </tr>
  <%
	String s_sql = String.format("SELECT * FROM ROBATO_BOARD_COMMENTS C INNER JOIN ROBATO_BOARD B ON C.B_NO=B.B_NO INNER JOIN ROBATO_MEMBER M ON C.M_NO=M.M_NO WHERE C.B_NO='%s' ORDER BY C.C_NO ",b_no); 
	System.out.println(s_sql);
	
	conn = DriverManager.getConnection(dbURL, dbUser, dbPW);
	stm = conn.createStatement();
	rs = stm.executeQuery(s_sql); // SELECT는 executeQuery()로 사용 / 보통 static으로 관리하면 편할것
	
	while(rs.next()){
		String C_comments = rs.getString("COMMENTS");
		String C_nick = rs.getString("M_NICK");
		
		String C_writedate = rs.getString("C_WRITEDATE");
%>
    <tr>
        <th><%=C_nick %></th>
        <th><%=C_comments %></th>
        <th><%=C_writedate %></th>
    </tr>

    
    <%
	}
	
	rs.close();
	stm.close();
	conn.close();
  %>
  
  </table>
  	<%if(sessionNick==null){ %>
  	<div id="buttons">
    <a href="board_list.jsp"><img src="img/list.png"></a>
    </div>
    <% }else{ %>
	<div id="comment_box">
		<form action="board_view_comments_process.jsp" method="post">
		<img id="title_comment" src="img/title_comment.gif"> 
		<textarea name="comment_text"></textarea>
		<input id="ok_ripple" type="image" src="img/ok_ripple.gif">
		<input type="hidden" name="b_no" value="<%=b_no%>"> <!-- 값을 보내기 위해서 사용 -->
		<!-- <img id="ok_ripple" src="img/ok_ripple.gif">-->
		</form>
	</div>
	<div id="buttons">
    <a href="#"><img src="img/delete.png"></a>	
    <a href="board_list.jsp"><img src="img/list.png"></a>
    <a href="board_write.jsp"><img src="img/write.png"></a>		
    </div>	
    <%} %>
</section> <!-- section main -->
<div class="clear"></div>
<footer>
  <img id="footer_logo" src="img/footer_logo.gif">
  <ul id="address">
    <li>서울시 강남구 삼성동 1234 우 : 123-1234</li>  
    <li>TEL : 031-123-1234  Email : email@domain.com</li>
    <li>COPYRIGHT (C) 루바토 ALL RIGHTS RESERVED</li>
  </ul>
  <ul id="footer_sns">
    <li><img src="img/facebook.gif"></li>  
    <li><img src="img/blog.gif"></li>
    <li><img src="img/twitter.gif"></li>
  </ul>
</footer> <!-- footer -->
</div> <!-- wrap -->
</body>
</html>