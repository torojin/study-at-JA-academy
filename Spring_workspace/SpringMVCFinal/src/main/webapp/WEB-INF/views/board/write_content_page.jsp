<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/board/write_content_process.do" method="post">
	nick : ${sessionUser.member_nick }<br>
	title : <input type="text" name="board_title"><br>
	content : <br>
	<textarea rows="10" cols="40" name="board_content"></textarea>
	<input type="submit" value="글쓰기">
</form>

</body>
</html>