<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="utf-8">
<title>클래식기타 커뮤니티</title>
  <link rel="stylesheet" type="text/css" href="css/common.css">
  <link rel="stylesheet" type="text/css" href="css/header.css">
  <link rel="stylesheet" type="text/css" href="css/footer.css">
  <link rel="stylesheet" type="text/css" href="css/board_left.css">
  <link rel="stylesheet" type="text/css" href="css/board_list_main.css">
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
      <li><a href="#">+ 등업 요청</a></li>
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
    <div id="total_search">
      <div id="total">▷ 총 5개의 게시물이 있습니다.</div>
      <div id="search">
        <div id="select_img"><img src="img/select_search.gif"></div>
        <div id="search_select">
          <select>
            <option>제목</option>
            <option>내용</option>
            <option>글쓴이</option>
          </select> 
        </div>
        <div id="search_input"><input type="text"></div>
        <div id="search_btn"><img src="img/search_button.gif"></div>
      </div>
    </div>
    <table>
      <tr>
        <th>번호</th>
        <th>제목</th>
        <th>글쓴이</th>
        <th>일시</th>
        <th>조회수</th>
      </tr>
        <%
        String sql="SELECT B.B_NO, B.M_NO, B.B_TITLE, B.B_CONTENT,TO_CHAR(B.B_WRITEDATE, 'YYYY-MM-DD') B_WRITEDATE, M.M_NICK, B.B_COUNT FROM ROBATO_BOARD B, ROBATO_MEMBER M WHERE B.M_NO=M.M_NO ORDER BY B.B_NO DESC";
        System.out.println("실행될 코드 : "+sql);
      	//DB연동...(SELECT)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//DB연결
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbUser = "SCOTT";
		String dbPW = "TIGER";
		Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPW);
		Statement stm = conn.createStatement();
		ResultSet rs = stm.executeQuery(sql); // SELECT는 executeQuery()로 사용 / 보통 static으로 관리하면 편할것
		
		while(rs.next()){
			String b_no = rs.getString("B_NO");
			String b_title = rs.getString("B_TITLE");
			String m_nick = rs.getString("M_NICK");
			String b_writedate = rs.getString("B_WRITEDATE");
			String b_count = rs.getString("B_COUNT");
		%>
		
	<tr>
        <td class="col1"><%=b_no %></td>
        <td class="col2">
          <a href="board_view.jsp?b_no=<%=b_no %>"><%=b_title %></a>
        </td>
        <td class="col3"><%=m_nick %></td>
        <td class="col4"><%=b_writedate %></td>
        <td class="col5"><%=b_count %></td>
	</tr>
		<%
			}		
			rs.close();
			stm.close();
			conn.close();
		%>
    </table>
    <div id="buttons">
      <div class="col1">◀ 이전 1 다음 ▶</div>
      <div class="col2">
        <%if(sessionNick==null){ %>
        <img src="img/list.png"> 
        <%}else{ %>
        <img src="img/list.png"> 
        <a href="board_write.jsp"><img src="img/write.png"></a>
        <%} %>
      </div>
    </div>
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