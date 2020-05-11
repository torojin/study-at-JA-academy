<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
	<h1>Login</h1>
	<form action="${pageContext.request.contextPath}/member/login_process.do" method="get">
		ID <input name="member_id" type="text" ><br>
		PW <input name="member_pw" type="password"><br>
	<input type="submit" value="로그인">
	</form>
	<a href="${pageContext.request.contextPath}/member/join_member_page.do">회원가입</a>
</body>
</html>