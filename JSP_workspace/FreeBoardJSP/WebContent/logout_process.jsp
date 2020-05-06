<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//A라는 사람이 접속했다고 가정하에, 
	
	//session의 정보를 다 날리는 코드
	session.invalidate();

	//다른 URL로 재요청
	//다시 다이렉트 해
	//저기로 다시 움직이라고 코드를 보냄
	//logout 프로세스가 되는데.. 메인페이지를 다시 또 호출하는것? 순식간에 적용이 되서 
			
	//다시 호출하라는 jsp코드가 웹브라우저에 넘어가서 웹브라우저가 다시 서버쪽에 메인페이지를 호출하라고.. 한번 클릭에 자동으로 두번 호출된거	
	//로그아웃 되자마자 바로 메인으로 돌아가게 하기 위해
	response.sendRedirect("./main_page.jsp");
%>
