package com.ja.freeboard.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//로그인 페이지 핸들러 생성
public class LoginPageHandler implements CommandHandler{
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		//포워딩이 된다고 했을때
		return "/WEB-INF/view/login_page.jsp";
		//리다이렉트 방식?
		//return "redirect:/main_page.do";
		
	}
}
