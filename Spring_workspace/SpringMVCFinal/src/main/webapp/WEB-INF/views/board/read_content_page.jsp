<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- boardVo가 hashMap이면 get..?  -->
제목 : ${data.boardVo.board_title } <br>
글쓴이 : ${data.memberVo.member_nick } <br>
조회수 : ${data.boardVo.board_readcount } <br>
내용 : <br>
${data.boardVo.board_content }<br>
<br>
<c:forEach items="${data.fileVoList}" var="fileVo">
	<img src="/upload/${fileVo.file_link_path}">
	<br>
</c:forEach>


<a href="${pageContext.request.contextPath}/board/main_page.do">목록으로</a>

<!-- 글쓴 사람일때  -->
<c:if test="${!empty sessionUser && sessionUser.member_no == data.memberVo.member_no }">

<a href="${pageContext.request.contextPath}/board/delete_content_process.do?board_no=${data.boardVo.board_no}">삭제</a>
<a href="${pageContext.request.contextPath}/board/update_content_page.do?board_no=${data.boardVo.board_no}">수정</a>
</c:if>

</body>
</html>