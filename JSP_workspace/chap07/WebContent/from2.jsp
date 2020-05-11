<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String v1 =request.getParameter("v1"); // getParameter는 웹 브라우저의 값을 가져옴

	request.setAttribute("test1", "한조"); // setAttribute는 값을 넣는것?

	if(v1 == null || v1.equals("r")){
		response.sendRedirect("./to.jsp");
	}else{
%>
<jsp:forward page="/to.jsp" />
<%
	}
%>
