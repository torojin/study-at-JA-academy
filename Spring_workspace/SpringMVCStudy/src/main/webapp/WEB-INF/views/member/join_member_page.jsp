<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
	<h1>Sign up</h1>
	<form action="join_member_process.do" method="post">
	Email <input name="member_id" type="email" placeholder="이메일을 입력해주세요"><br>
	PW <input name="member_pw" type="password" placeholder="8자리 이상 입력해주세요"><br>
	nick <input name="member_nick" type="text" placeholder="닉네임을 입력해주세요"><br>
	Gender <input name="member_sex" type="radio" value="M" checked="checked">Men
			<input name="member_sex" type="radio" value="W">Women <br>
	Hobby<input name="member_hobby" type="checkbox" value="1">농구
	<input name="member_hobby" type="checkbox" value="2">축구
	<input name="member_hobby" type="checkbox" value="3">야구
	<input name="member_hobby" type="checkbox" value="4">독서<br>
	<input type="submit" value="Sign up">
	
	</form>
</body>
</html>