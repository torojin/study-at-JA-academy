<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<style>
	#wrapper{
		width: 600px;
		height: 400px;
		border: 1px solid black; 
		margin: 0 auto;
	}
	#wrapper form{
		width : 300px;
		margin : 0 auto;
	}
</style>
</head>
<body>
	<div id="wrapper">
		<h1>로그인</h1>
		<form action="./login_process.jsp" method="post">
			ID : <input type="text" name="login_id"><br>
			PW : <input type="password" name="login_pw"><br>
			<input type="submit" value="로그인">
		</form>		
		<a href="./join_member_page.jsp">회원가입</a>
	</div>
	

</body>
</html>