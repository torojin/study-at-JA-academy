package com.ja.freeboard.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ja.freeboard.Model.BoardDao;
import com.ja.freeboard.vo.MemberVo;

public class WriteContentProcessHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String b_title = request.getParameter("b_title");
		String b_content = request.getParameter("b_content");
		MemberVo memberVo = (MemberVo)request.getSession().getAttribute("sessionUserInfo");
		//get, setAttribute는 들어가는 타입이 object이기 때문에 형변환을 해줘야함
		
		int m_no = memberVo.getM_no();
		
		new BoardDao().insert(m_no, b_title, b_content);
		
		return "redirect:./main_page.do"; //redirect 처리
	}
	
}
