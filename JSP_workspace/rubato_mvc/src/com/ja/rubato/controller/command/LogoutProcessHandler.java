package com.ja.rubato.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutProcessHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		//request.getSession() : 현재 요청과 관련된 session 객체를 리턴
		//invalidate() : session 무효화
		request.getSession().invalidate();
		return "redirect:./index.do";
	}

}
