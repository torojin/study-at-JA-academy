package com.ja.freeboard.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ja.freeboard.Model.*;
import com.ja.freeboard.vo.*;
import java.util.*;


public class MainPageHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<ContentDataVo> contentList = new ArrayList<ContentDataVo>(); //MemberVo와 BoardVo를 묶..?기 위한 Vo가 필요함
		ArrayList<BoardVo> boardList = new BoardDao().selectAll();
		
		MemberDao memberDao = new MemberDao();
		//select 할거 출력
		for(BoardVo boardVo : boardList) {
			//boardVo와 MemberVo는 1:1관계이다
			//SQL쿼리에서 join처리를 안하고 이런 방식으로 조인 처리하는 경우도 있다.
			MemberVo memberVo = memberDao.selectByNo(boardVo.getM_no()); // 글쓴 사람의 외래키 호출
			
			//ContentDataVo을 넣을... ArrayList를 만들자
			ContentDataVo contentDataVo = new ContentDataVo(memberVo, boardVo);
			//ArrayList에 담음
			contentList.add(contentDataVo);
		}
		
		//여기가 제일 복잡하고 중요함!!!!!
		//포워딩을 했을때만 
		//request.getSession().setAttribute / getSession()를 사용해도 작동은 된다 / 단, 섹션 메모리 상에 계속 존재하고 있어서 메모리 효율성이 떨어진다.
		request.setAttribute("contentList", contentList); //MVC모델의 핵심 / 이 안쪽에 데이터가 다들어가있다.
		
		return "/WEB-INF/view/main_page.jsp"; //forwarding 처리
		
	}

}
