<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>안녕하세요</h1>
	
	<% //JSP문법
	//만들어진 결과만 출력 / 서버단에서 돌아간다
	//java코드는 절대 안돌아간다
	//JSP코드는 다 서블릿으로 변환된 후 java코드로 변환된다
	//html코드 안에 자바코드를 넣기 위해 jsp를 사용하기 시작
	int count = (int)(Math.random()*20);
	for(int i = 0; i < count; i++){
		out.println("안녕하세요"+"<br>");
	}
	%>
</body>
</html>