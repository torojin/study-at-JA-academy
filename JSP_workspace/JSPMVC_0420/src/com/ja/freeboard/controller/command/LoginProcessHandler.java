package com.ja.freeboard.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ja.freeboard.Model.MemberDao;
import com.ja.freeboard.vo.MemberVo;

public class LoginProcessHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		//parameter 받아오기
		String m_id = request.getParameter("m_id");
		String m_pw = request.getParameter("m_pw");
		
		//객체 생성
		MemberVo memberVo = new MemberDao().selectByIdAndPw(m_id,m_pw);
		
		if(memberVo != null) {
			//로그인 성공..
			//session저장공간에 로그인값..?
			//sessionUserInfo의 값이 있으면 로그인?
			request.getSession().setAttribute("sessionUserInfo", memberVo);
			//return "/WEB-INF/view/main_page.jsp";//포워딩 방식은 게시판 데이터가 안나온다 / 데이터가 먼저 구성이되고 포워딩이되야 의미가 있따!
			return "redirect:./main_page.do"; //리다이렉트로 사용해야한다. 
		}else {
			//로그인실패..
			return "/WEB-INF/view/login_fail.jsp";
		}
		
	}

}
