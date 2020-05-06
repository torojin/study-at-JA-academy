package com.ja.rubato.controller;

import java.util.HashMap;

import com.ja.rubato.controller.command.*;

public class CommandFactory {
	//HashMap, ArrayList 중요
		//hashMap에 첫번째는 String, 두번째는 interface 넣음
		//내부에서 쓸거기 때문에 private
		private HashMap<String, CommandHandler> commandMap;
		
		//constructor 생성 생성자는 꼭 public이여야한다 사용해야하기 때문?
		public CommandFactory() {
			commandMap = new HashMap<String, CommandHandler>();
			//put 객체 추가
			commandMap.put("/index.do", new IndexPageHandler());
			commandMap.put("/login_process.do", new LoginProcessHandler());
			commandMap.put("/logout_process.do", new LogoutProcessHandler());
			commandMap.put("/board_process.do", new BoardListProcessHandler());
			//commandMap.put("/board_list.do", new BoardListPageHandler()); //이 부분은 forwarding시킨다.
			commandMap.put("/board_view_process.do", new BoardViewProcessHandler());
			commandMap.put("/board_write.do", new BoardWritePageHandler());
		}
		
		//다형성에 의해서 LoginPageHandler를 리턴해준다
		public CommandHandler getCommandHandler(String command) {
			//get은 키로 값을 뽑아오겠다
			return commandMap.get(command);
		}
}
