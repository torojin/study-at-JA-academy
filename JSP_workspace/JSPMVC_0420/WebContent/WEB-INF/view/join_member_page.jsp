<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="./join_member_process.do" method="post">
		ID : <input type="text" name="MEMBER_ID"><br>
		PW : <input type="password" name="MEMBER_PW"><br>
		Nick : <input type="text" name="MEMBER_NICK"><br>
		Phone : <input type="text" name="MEMBER_PHONE"><br>
		<input type="submit" value="회원가입"><br>
		
	</form>
</body>
</html>