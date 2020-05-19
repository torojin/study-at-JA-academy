<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../commons/globel_nav.jsp"></jsp:include>
<div class="container">
	<div class="row">
		<div class="col">	
		<%-- 자기자신 페이지로 호출하겠다  --%>
			<form action="./main_page.do" method="get">	
			<div class="row my-3">
				<div class="col-8"></div>
				<div class="col">
					<input name="search_word" type="text" class="form-control">
				</div>
				<div class="col-1">
					<input type="submit" class="btn btn-primary btn-block" value="검색">
				</div>
			</div>
			</form>
			<div class="row"><!-- 테이블 시작-->
				<div class="col mt-5">
					<table class="table table-hover">
						<thead>
					    <tr>
					      <th scope="col">글 번호</th>
					      <th scope="col">제목</th>
					      <th scope="col">작성자</th>
					      <th scope="col">조회수</th>
					      <th scope="col">작성일</th>
					    </tr>
						</thead>
						<tbody>
						<c:forEach items="${dataList }" var="xxx">
					    <tr>
					      <th scope="row">${xxx.boardVo.board_no }</th>
					      <td><a href="${pageContext.request.contextPath}/board/read_content_page.do?board_no=${xxx.boardVo.board_no}">${xxx.boardVo.board_title }</a></td>
					      <td>${xxx.memberVo.member_nick }</td>
					      <td>${xxx.boardVo.board_readcount }</td>
					      <%-- 
					      <%
					      	//java Code로 데이트 받아오는 타입 변환시키기
					      	java.util.Map<String, Object> map = (java.util.Map<String, Object>)pageContext.getAttribute("xxx");
					      
					      	com.ja.freeboard.vo.BoardVo vo = (com.ja.freeboard.vo.BoardVo)map.get("boardVo");
					      	
					      	java.util.Date date = vo.getBoard_writedate();
					      	
					      	//out.print(date.toString());
					      	
					      	java.text.SimpleDateFormat sd = new java.text.SimpleDateFormat("yyyy.MM.dd");
					      	String printValue = sd.format(date);
					      	
					      	//printValue 출력
					      %>
					      --%>
					      <%--<td>${xxx.boardVo.board_writedate }</td> --%>
					      <td><fmt:formatDate value="${xxx.boardVo.board_writedate }" pattern="yy년mm.dd hh:mm:ss"/></td>
					    </tr>
					    </c:forEach>
					    </tbody>
					</table>
				</div>
			</div><!-- 테이블 끝 -->
			<div class="row"><!-- 버튼 시작 -->
				<div class="col"><!-- 페이징 시작-->
					<nav aria-label="Page navigation example">
					  <ul class="pagination">
					  	<li class="page-item<c:if test="${beginPage-1 <= 0}"> disabled</c:if>"><a class="page-link" href="./main_page.do?currPage=${beginPage-1}&search_word=${param.search_word}" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
					    <c:forEach begin="${beginPage }" end="${endPage }" var="i">
					    	<li class="page-item<c:if test="${currPage==i}"> active</c:if>"><a class="page-link" href="./main_page.do?currPage=${i}&search_word=${param.search_word}">${i}</a></li>
					    </c:forEach>
					    <li class="page-item<c:if test="${endPage+1 > (totalCount-1)/10+1}"> disabled</c:if>"><a class="page-link" href="./main_page.do?currPage=${endPage+1}&search_word=${param.search_word}" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
					  </ul>
					</nav>
				</div><!-- 페이징 끝 -->
				<!-- 게시글 목록 -->
				<c:if test="${!empty sessionUser }">
				<div class="col-2"><a class="btn btn-primary btn-lg btn-block" href="${pageContext.request.contextPath}/board/write_content_page.do">글쓰기</a></div>
				</c:if>
			</div><!-- 버튼 끝 -->
		</div>
	</div>

<!-- 게시글 목록 -->
<c:if test="${!empty sessionUser }">
	<a href="${pageContext.request.contextPath}/board/write_content_page.do">글쓰기</a>
</c:if>
</div>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>










