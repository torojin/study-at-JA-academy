<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style>
    *{margin: 0; padding: 0;}
    ul{list-style: none; }
</style>
</head>
<body>
	<h1>회원가입</h1>
	<!-- 회원가입 양식 -->
    <form action="./join_member_process.jsp" method="GET">
        <ul>
            <li>NAME : <input type="text" name="join_name" placeholder="이름을 입력하세요." maxlength="20"></li>
            <li>ID : <input type="text" name="join_id" placeholder="아이디를 입력하세요." maxlength="20"></li>
            <li>PW : <input type="password" name="join_pw" placeholder="비밀번호를 입력하세요." maxlength="20"></li>
            <li>NICKNAME : <input type="text" name="join_nick" placeholder="별명을 입력하세요." maxlength="20"></li>
            <li>PHONE : <input type="text" name="join_number" placeholder="핸드폰번호를 입력하세요." maxlength="20"></li>
         	<li>BIRTH : <input type="text" name="join_birth" placeholder="ex)19990101" maxlength="8"></li>
            <li><input type="submit" value="회원가입"></li>
        </ul>
	</form>
</body>
</html>