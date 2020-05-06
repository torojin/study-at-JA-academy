<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join member page</title>
</head>
<body>
	<h1>회원가입</h1>
	<%--
		get : URL에 정보 노출 / 넘길 데이터의 값의 크기 한계 존재 / 인코딩 타입을 지멋대로 처리해서 한글 처리하기가 까다로움(URLEncoder 사용해야함) / select 용도로 쓸때
		post : URL에 정보 노출x(parameter값이 노출되지 않는다) / 넘길 데이터의 값의 크기 한계 존재x / 한글 처리 쉬움 / input으로 사용할 때
		
	 --%>
	<form action="./join_member_process.jsp" method="post"> 
		ID : <input type="text" name="id"><br>
		PW : <input type="password" name="pw"><br>
		NICK : <input type="text" name="nick"><br>
		PHONE : <input type="text" name="phone"><br> <%-- name은 parameter값의 키? --%>
		<input type="submit" value="회원가입">
	</form>
</body>
</html>