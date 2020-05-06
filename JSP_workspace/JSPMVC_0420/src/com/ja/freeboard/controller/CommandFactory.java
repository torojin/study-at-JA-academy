package com.ja.freeboard.controller;
import java.util.HashMap;

//Factory?? : 인스턴스를 그때 그때 생성 시키는 것
//팩토리 형태는 2가지 방식이 있다.
//1.원래 팩토리패턴의  목표는 할때 마다 찍어내는 것
//생성하고 소멸시키고 해야할 필요가 있나?라고 생각해서 싱글톤 방식으로도 만듬 
//2.즉 싱글톤형태 이 되어야하고 미리 생성을 시킨 다음에 리턴을 시키자
//한개만생성해서 리턴을 해주자
import com.ja.freeboard.controller.command.*;

//6.commandFactory 클래스에서 해쉬맵 생성
public class CommandFactory {
	
	//HashMap, ArrayList 중요
	//hashMap에 첫번째는 String, 두번째는 interface 넣음
	//내부에서 쓸거기 때문에 private
	private HashMap<String, CommandHandler> commandMap;
	
	//constructor 생성 생성자는 꼭 public이여야한다 사용해야하기 때문?
	public CommandFactory() {
		commandMap = new HashMap<String, CommandHandler>();
		//put 객체 추가
		//7. loginPageHandler를 생성해서 키와 값을 넣음
		commandMap.put("/login_page.do", new LoginPageHandler());
		commandMap.put("/join_member_page.do", new JoinMemberPageHandler());
		commandMap.put("/join_member_process.do", new JoinMemberProcessHandler());
		commandMap.put("/login_process.do", new LoginProcessHandler()); //"/login_process.do"는 URL주소를 이걸로 설정해주는 것
		commandMap.put("/main_page.do", new MainPageHandler()); //이쪽이 제일 중요
		commandMap.put("/logout_process.do", new LogoutProcessHandler());
		commandMap.put("/write_content_page.do", new WriteContentPageHandler());
		commandMap.put("/write_content_process.do", new WriteContentProcessHandler());
		commandMap.put("/read_content_page.do", new ReadContentPageHandler());
		commandMap.put("/delete_content_process.do", new DeleteContentProcessHandler());
		commandMap.put("/update_content_page.do", new UpdateContentPageHandler());
		commandMap.put("/update_content_process.do", new UpdateContentProcessHandler());
		
		commandMap.put("/", new MainPageHandler());
		
	}
	
	//다형성에 의해서 LoginPageHandler를 리턴해준다
	public CommandHandler getCommandHandler(String command) {
		//get은 키로 값을 뽑아오겠다
		return commandMap.get(command);
	}
	
	/*
	//aaa커맨드를 받아서 return시킴
	public CommandHandler getCommandHandler(String command) {
		if(command.equals("/login_page.do")) {
			return new LoginPageHandler();
		}
	}
	*/
}
