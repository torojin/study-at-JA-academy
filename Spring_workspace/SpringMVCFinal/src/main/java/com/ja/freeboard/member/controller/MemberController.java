package com.ja.freeboard.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ja.freeboard.member.service.MemberServiceImpl;
import com.ja.freeboard.vo.MemberVo;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	//참조주소를 넣어주겠다.
	@Autowired
	private MemberServiceImpl memberService;
	
	//로그인 페이지
	@RequestMapping("/login_page.do")
	public String loginPage() {
	System.out.println("왜!?");
		return "member/login_page";
	
	}
	
	//회원가입 페이지
	@RequestMapping("/join_member_page.do")
	public String joinMemberPage() {
		return "member/join_member_page";
	}
	
	//hobby는 배열 형태로 받아서 처리
	@RequestMapping("/join_member_process.do")
	public String joinMemberProcess(MemberVo memberVo, int[] member_hobby) {
		memberService.joinMember(memberVo, member_hobby);
		return "redirect:./login_page.do"; //redirect로 처리
	}
	/*
	@RequestMapping("/join_member_process2.do")
	public String joinMemberProcess(HttpServletRequest re) {
		
		String id = re.getParameter("member_id");
		String pw = re.getParameter("member_pw");
		
		MemberVo vo = new MemberVo();
		vo.setMember_id(id);
		vo.setMember_id(pw);
		
		
		String [] arr = re.getParameterValues("member_hobby");
		
		int [] attt = new int[arr.length];
		
		int count = 0;
		for(String h : arr) {
			
			attt[count] = Integer.parseInt(h);
			count++;
		}
		
		
		
		memberService.joinMember(memberVo, member_hobby);
		return "redirect:./login_page.do"; //redirect로 처리
	}*/
	
	//이후에 객체 오브젝트를 컨트롤 할것인지에 따라
	//매개변수 하나만 받을지 두개만 받을지 설정
	@RequestMapping("/login_process.do")
	public String loginProcess(MemberVo memberVo, HttpSession session) {

		MemberVo userData = memberService.login(memberVo);
		
		if(userData == null) {
			return "/member/login_fail";//만들어야함
		}else {
			//로그인 성공
			session.setAttribute("sessionUser", userData);
			return "redirect:/board/main_page.do";
		}
	}
	
	//로그아웃 기능
	@RequestMapping("/logout_process.do")
	public String logoutProcess(HttpSession session) {
		session.invalidate();
		return "redirect:/board/main_page.do";
	}
		
	
}
