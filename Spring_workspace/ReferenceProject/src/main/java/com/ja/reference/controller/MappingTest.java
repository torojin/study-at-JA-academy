package com.ja.reference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*") //기능별로 나눌수 있게
public class MappingTest {
	//POJO의 따른 경량화
	
	//리턴타입 void도 사용하긴 하지만 잘 사용 안함.. 
	@RequestMapping("/test1")
	public void test1() {
		System.out.println("안녕하세요11");
	}
	
	//일관성 유지 위해서 리턴타입을 String으로 사용
	//우리는 이렇게 사용할것!
	@RequestMapping("/test2")
	public String test2() {
		System.out.println("안녕하세요22");
		return "test1"; //test1.jsp로 forwarding됨
	}
	
	//명령은 test3로 날라가고 redirect되서 test2로 이동해서 test1의 결과 출력
	@RequestMapping("/test3")
	public String test3() {
		System.out.println("안녕하세요333");
		return "redirect:./test2";//redirect 방식 사용
	}
	
	/*
	@RequestMapping("/member/test4")///WEB-INF/views/member/test4가 실행됨
	public String test4() {
		System.out.println("안녕하세요44");
		return "test1";
	}
	*/
	
	@RequestMapping("/member/test4")//WEB-INF/views/member/test4가 실행됨
	public String test4() {
		System.out.println("안녕하세요44");
		return "test1";
	}
}
