<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../commons/globel_nav.jsp"></jsp:include>
<div class="container mt-5">
<form action="./login_process.do" method="post">
	<div class="row mt-2">
		<div class="col-3"></div>
		<div class="col">
			<div class="row text-center"><!-- 로고자리 -->
					<div class="col">
						<h1>로그인</h1>
					</div>
			</div>
			<div class="row mt-2"><!-- ID -->
				<div class="col-2">ID</div>
				<div class="col px-0"><input name="member_id" type="text" class="form-control" placeholder="이메일을 입력해주세요"></div>
			</div>
			<div class="row mt-2"><!-- PW -->
				<div class="col-2">PW</div>
				<div class="col px-0"><input name="member_pw" type="password" class="form-control"></div>
			</div>
			<div class="row mt-3"><!-- 로그인 -->
				<input class="btn btn-info btn-block" type="submit" value="로그인">
			</div>
			<div class="row mt-2"><!-- 회원가입 -->
				<a class="btn btn-outline-info btn-block" href="./join_member_page.do">회원가입</a>
			</div>
		</div>
		<div class="col-3"></div>
	</div>
</form>
</div>
<!-- 
<%-- Spring에서 name은 데이터베이스 명칭과 동일하게 하는게 좋다 --%>
<form action="./login_process.do" method="post">
	ID : <input type="text" name="member_id"><br>
	PW : <input type="password" name="member_pw"><br>
	<input type="submit" value="로그인">
</form> -->


<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>