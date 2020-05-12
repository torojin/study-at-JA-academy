<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 메인페이지</title>
</head>
<body>
<c:choose>
	<c:when test="${!empty sessionUser}">
		${sessionUser.member_nick}님 환영합니다
		<a href="${pageContext.request.contextPath}/member/logout_process.do">로그아웃</a>
	</c:when>
	
	<c:otherwise>
		<a href="${pageContext.request.contextPath}/member/login_page.do">로그인</a>
	</c:otherwise>
</c:choose>

	<form action="${pageContext.request.contextPath}/member/board_process.do">
	<table style="border: 1px solid #444444; border-collapse: collapse;">
		<thead>
			<td style="border: 1px solid #444444;">글번호</td>
			<td style="border: 1px solid #444444;">제목</td>
			<td style="border: 1px solid #444444;">글쓴이</td>
			<td style="border: 1px solid #444444;">조회수</td>
			<td style="border: 1px solid #444444;">작성일</td>
		</thead>
		<c:forEach items="${dataList}" var="con">
		<tbody>
			<td style="border: 1px solid #444444;">${con.boardVo.board_no} </td>
			<td style="border: 1px solid #444444;"><a href="${pageContext.request.contextPath}/board/read_content_page.do?board_no=${con.boardVo.board_no}">${con.boardVo.board_title}</a></td>
			<td style="border: 1px solid #444444;">${con.memberVo.member_nick }</td>
			<td style="border: 1px solid #444444;">${con.boardVo.board_readcount}</td>
			<td style="border: 1px solid #444444;">${con.boardVo.board_writedate}</td>
		</tbody>
		</c:forEach>
	</table>
	<a>글쓰기</a>
	<a>글수정</a>
	</form>
</body>
</html>