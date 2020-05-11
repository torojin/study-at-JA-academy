package com.my.freeboard.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.freeboard.member.service.MemberServiceImpl;
import com.my.freeboard.vo.MemberVo;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	//service 주입
	@Autowired
	private MemberServiceImpl memberServiceImpl;
	
	//로그인 페이지
	@RequestMapping("/login_page.do")
	public String loginPage() {
		return "login/login_page";
	}
	//로그인 처리
	@RequestMapping("/login_process.do")
	public String loginProcess(MemberVo memberVo, HttpSession session) {
		MemberVo userData = memberServiceImpl.login(memberVo);
		if(userData == null) {
			return "login/login_fail";
		}else {
			//session에 로그인한 정보 저장
			session.setAttribute("sessionUser", userData);
			return "redirect:/board/main_board_page.do";
		}
	}
	
	//로그아웃 처리
	@RequestMapping("/logout_process.do")
	public String logoutProcess(HttpSession session) {
		session.invalidate();
		return"redirect:./login_page.do";
	}
	
	//회원가입 페이지
	@RequestMapping("/join_member_page.do")
	public String joinMemberPage() {
		return "member/join_member_page";
	}
	//회원가입 처리
	@RequestMapping("/join_member_process.do")
	public String joinMemberProcess(MemberVo memberVo, int[] member_hobby) {
		memberServiceImpl.joinMember(memberVo, member_hobby);
		return "redirect:./login_page.do";
	}

	
}
