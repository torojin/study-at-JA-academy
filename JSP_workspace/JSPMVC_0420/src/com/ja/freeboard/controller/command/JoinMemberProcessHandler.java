package com.ja.freeboard.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ja.freeboard.Model.MemberDao;

public class JoinMemberProcessHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		//메소드 안에서 파라미터 처리
		String m_id = request.getParameter("MEMBER_ID");
		String m_pw = request.getParameter("MEMBER_PW");
		String m_nick = request.getParameter("MEMBER_NICK");
		String m_phone = request.getParameter("MEMBER_PHONE");
		
		System.out.println("넘어오니?:" + m_id+" "+m_pw+" "+m_nick+" "+m_phone);
		
		new MemberDao().insert(m_id,m_pw,m_nick,m_phone);
		return "/WEB-INF/view/join_member_complete.jsp";
	}

}
