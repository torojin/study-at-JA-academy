<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- enctype 속성 : encodingtype를 변경해줌 / 파일 업로드 할 때 만큼은 이 설정을 넣어줘야한다. 버퍼를 날릴수있는 프로토콜로 변경 시켜줌 / 이 설정을 안하면 파일을 날려주는게 아니라 파일 명만 날려줌-->
<form action="${pageContext.request.contextPath}/board/write_content_process.do" method="post" enctype="multipart/form-data">
	nick : ${sessionUser.member_nick }<br>
	title : <input type="text" name="board_title"><br>
	content : <br>
	<textarea rows="10" cols="40" name="board_content"></textarea>
	<br>
	<input accept="image/*" multiple="multiple" type="file" name="upload_files"><!-- accept는 업로드 파일 종류 설정/ multiple 속성을 주면 파일 여러개 선택 가능 -->
	<br>	
	<input type="submit" value="글쓰기">
</form>

</body>
</html>