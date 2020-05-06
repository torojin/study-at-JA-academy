<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%-- 변환하는것에 대한 여러가지 설정들 --%>   
    
    
<%-- 이게 JSP 작성... --%>    
<%! //클래스 내부에 있는 멤버로 만들어진다 / 멤버코드로 선언이 된다, 멤버선언으로 들어간다 / 잘 안쓴다
//public, private이 붙을 수 있다
	int a = 10;
//System.out.println(); 이건 못들어간다.
%>
<%//메소드 내부 / 메소드 내에 실행시켜야할 서비스 / 코드 / 이건 쓰긴 씀 / 무엇인진 알고 있자
//실행코드 사용가능
////public, private이 붙을 수 없다
	
	int b = 20;
	System.out.println("eewrqer");
	ArrayList list;
	
%>

<%=b%> <%-- out.print(b)이거랑 같은 문법이다 --%>

<%-- JSP 주석이다 --%> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 주석의 차이점 -->
<!-- 안녕하세여 / html 주석 / 컨트롤러에 등장-->
<%-- 안녕하세요 / JSP 주석 / 화면에 나타나지 않음 / Java코드로 아예 변환를 안하겠다라는 의미--%>
</body>
</html>