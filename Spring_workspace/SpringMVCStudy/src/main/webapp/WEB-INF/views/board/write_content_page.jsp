<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성</title>
</head>
<body>

	<h1>write page</h1>
	<form action="${pageContext.request.contextPath}/board/write_content_process.do">
	nick ${sessionUser.member_nick}<br>
	title <input name="board_title" type="text"><br>
	content <textarea name="board_content" rows="100" cols="100"></textarea>
	<input type="submit" value="글 작성">
	</form>
</body>
</html>