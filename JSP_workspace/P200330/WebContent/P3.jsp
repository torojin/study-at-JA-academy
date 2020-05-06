<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./P4.jsp" method="post"> <%--method : get은 디폴트값, post은 넘겨주는 값을 숨겨줌 --%>
		ID : <input type="text" name="id"><br> <%-- 해시맵과 비슷한 키:값 형태 --%>
		PW : <input type="password" name="pw"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>