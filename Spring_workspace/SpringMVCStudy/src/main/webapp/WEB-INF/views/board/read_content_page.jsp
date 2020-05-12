<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글 읽기</title>
</head>
<body>
	제목 : ${data.boardVo.board_title }<br>
	글쓴이  : ${data.memberVo.member_nick }<br>
	조회수 : ${data.boardVo.board_readcount }<br>
	내용 <br>
	${data.boardVo.board_content}<br>
	
</body>
</html>