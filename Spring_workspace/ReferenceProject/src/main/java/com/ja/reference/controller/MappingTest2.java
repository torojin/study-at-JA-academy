package com.ja.reference.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ja.reference.vo.MemberVo;

@Controller
@RequestMapping("/board/*")
public class MappingTest2 {

	//MappingTest.java의 test1이 실행된다
	//jsp에서 사용했던 방식
	@RequestMapping("/test1")
	public String test1(HttpServletRequest re) {
		//HttpServletRequest는 HTTP에서 작성된 parameter을 받아옴
		String aa = re.getParameter("aa");
		String bb = re.getParameter("bb");
		
		System.out.println("aa: "+aa+" bb: "+bb);
		System.out.println("안녕하세요1");
		
		return "test1";
	}
	
	//Spring 방식
	//Spring framework는  request.getParameter를 사용할 필요가 없다
	//아래처럼 사용하면 됨
	@RequestMapping("/test2")
	public String test2(String aa, String bb) {
		System.out.println("aa: "+aa+" bb: "+bb);
		return "test1";
	}
	
	//보통 이 방식을 사용할 것
	@RequestMapping("/test3")
	public String test3(int v1, int v2) {
		System.out.println("v1: "+v1+" v2: "+v2);
		
		return "test1";
	}
	
	//이런식으로 사용도 가능하다
	@RequestMapping("/test3_1")
	public String test3_1 (@RequestParam("aa") int v1, @RequestParam("bb") int v2) {
		System.out.println("v1: "+v1+" v2: "+v2);
		
		return "test1";
	}
	
	//Spring에서 value object 사용하는 방법
	//memverVo 만든거 관련
	@RequestMapping("/test4")
	public String test4(MemberVo vo) {
		
		System.out.println("getM_id:"+vo.getM_id());
		System.out.println("getM_pw: "+vo.getM_pw());
		System.out.println("getM_nick: "+vo.getM_nick());
		
		return "test1";
	}
	
	//숫자만 나오게 처리
	@RequestMapping("/test5/{pid}/{xxx}") // 숫자나 간단한 문자까지만 사용
	public String test5(@PathVariable("pid") int pid, @PathVariable("xxx") int xxx) {
		
		System.out.println(pid+" "+xxx);
		return "test1";
	}
	
}
