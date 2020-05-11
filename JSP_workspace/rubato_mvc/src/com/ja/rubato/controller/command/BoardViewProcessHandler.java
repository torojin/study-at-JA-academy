package com.ja.rubato.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ja.rubato.model.*;
import com.ja.rubato.vo.*;

public class BoardViewProcessHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		int b_no = Integer.parseInt(request.getParameter("b_no"));
		
		BoardVo boardVo = new BoardDao().ViewByNo(b_no);
		MemberVo memberVo = new MemberDao().ViewByNo(b_no);
		
		ContentDataVo contentDataVo = new ContentDataVo(memberVo, boardVo);
		
		request.setAttribute("contentDataVo", contentDataVo);
		
		return "/WEB-INF/view/board_view.jsp";
	}

}
