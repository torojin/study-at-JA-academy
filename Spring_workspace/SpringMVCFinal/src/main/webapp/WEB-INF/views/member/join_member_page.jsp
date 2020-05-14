<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<!-- 부트스트랩 모바일용으로 처리 -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function frm_submit(){
		//alert("안녕하세요");
		var frm = document.getElementById("frm"); //form 태그의 id를 받아와서 사용하겠다
		
		//글 작성 했는지 안했는지 확인(유효성 검사)
		var idBox = document.getElementById("id"); //태그에 있는 오브젝트를 가져온다
		
		//ID 유효성 이메일(정규식 처리) / 정말 쓸 일 있으면 예제 찾아서 써라 / 만들일은 많이 없다
		var reg = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
		
		
		//if(idBox.value == ""){
		//	alert("아이디 값을 입력해주세요");
		//	return;
		//}
		
		if(!reg.test(idBox.value)){
			alert("아이디는 이메일 형식에 맞춰야합니다.");
			idBox.value = "";
			idBox.focus();
			return;
		}
		
		//비밀번호 정규식 처리
		//변수 재활용
		reg = /^[A-Za-z0-9]{6,12}$/;
		
		var pwBox = document.getElementById("pw");
		
		if(!reg.test(pwBox.value)){
			alert("비밀번호는 숫자, 영문자로 6-12자리 여야 합니다.");
			pwBox.value = "";
			pwBox.focus();
			return;
		}
		
				
		frm.submit(); //submit API 
	}

</script>
</head>
<body>
<jsp:include page="../commons/globel_nav.jsp"></jsp:include>
<div class="container">
	<div class="row">
		<div class="col"></div>
		<div class="col">
		<form id="frm" action="./join_member_process.do" method="post">
			<div class="row mt-5"><!-- 회원가입 제목 시작 -->
				<div class="col text-center"><h1>회원가입</h1></div>
			</div><!-- 회원가입 제목 끝-->
			<div class="row"><!-- ID / PW 시작 -->
			    <div class="form-group col-md-6">
			    	<label for="inputEmail4">ID</label>
			    	<input id="id" name="member_id" type="email" class="form-control" id="inputEmail4" placeholder="email를 입력하세요">
			    </div>
			    <div class="form-group col-md-6">
			    	<label for="inputPW">PW</label>	
			    	<input id="pw" name="member_pw" type="password" class="form-control" id="inputEmail4" placeholder="비밀번호를 입력하세요">
			    </div>
			</div><!-- ID / PW 끝 -->
			<div class="row"><!-- Nick 시작 -->
				<div class="form-group col">
			    	<label for="inputNick">Nick</label>
			    	<input name="member_nick" type="text" class="form-control" id="inputEmail4" placeholder="별명을 입력하세요">
			    </div>
			</div><!-- Nick 끝 -->
			<div class="row mt-2"><!-- Gender / Hobby 시작 -->
				<div class="form-group col">
			    	<label for="inputGender">Gender</label>
			    	<div class="col form-check form-check-inline">
						<input class="form-check-input mr-2" type="radio" name="member_sex" value="M" ><label class="form-check-label" for="inlineRadio1">남</label>
						<input class="form-check-input mr-2" type="radio" name="member_sex" value="W" checked="checked"><label class="form-check-label" for="inlineRadio2">여</label>
					</div>
			    </div>
			    <div class="form-group col">
			    	<label for="inputHobby">Hobby</label>
			    	<div class="col form-check form-check-inline">
						<input class="form-check-input" type="checkbox" name="member_hobby" value="1" ><label class="form-check-label" for="inlineCheckbox1">농구</label>
						<input class="form-check-input" type="checkbox" name="member_hobby" value="2" ><label class="form-check-label" for="inlineCheckbox2">축구</label>
						<input class="form-check-input" type="checkbox" name="member_hobby" value="3" ><label class="form-check-label" for="inlineCheckbox3">야구</label>
						<input class="form-check-input" type="checkbox" name="member_hobby" value="4" ><label class="form-check-label" for="inlineCheckbox4">독서</label>
					</div>
			    </div>
			</div><!-- Gender / Hobby 끝 -->
			<div class="row mt-3"><!-- 회원가입 버튼 시작 -->
				<input onclick="frm_submit()" class="btn btn-outline-info" type="button" value="회원가입">
			</div><!-- 회원가입 버튼 끝 -->
		</form>
		</div>
		<div class="col"></div>
	</div>
</div>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>