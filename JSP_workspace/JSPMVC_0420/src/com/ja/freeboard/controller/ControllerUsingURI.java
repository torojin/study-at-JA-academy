package com.ja.freeboard.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ja.freeboard.controller.command.CommandHandler;

/**
 * Servlet implementation class ControllerUsingURI
 */
//@WebServlet("/ControllerUsingURI") 
//web.xml에서 대신 설정
//2. ControllerUsingURI클래스 생성
public class ControllerUsingURI extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//멤버 변수 생성
	private CommandFactory commandFactory;
	
    /**
     * @see HttpServlet#HttpServlet()
     */	
	//3.controllerUsingURI 생성자 실행
    public ControllerUsingURI() {
        super();
        //4. commandFactory 인스턴스 생성
        commandFactory = new CommandFactory();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doGet, doPost 둘중 뭐가 호출되도 doGet이 호출됨
		System.out.println("넘어온 명령어 : "+request.getRequestURI()); //API 명령어가 어떤 명령어인지 풀네임을 보여줌
		String command = request.getRequestURI();//URI를 받아옴 /JSPMVC_0420/WEB-INF/view/main_page.jsp 이 형태로 넘어옴
		//command.substring("/JSPMVC_0420".length()); //API 문자열 자르기 
		command = command.substring(request.getContextPath().length()); //Server.xml의 context의 path를 자름 / 자른값을 다시 command에다 넣어주겠다
		
		System.out.println("명령어 : "+command);
		
		CommandHandler handler = commandFactory.getCommandHandler(command);	//다형성에 의해서 적합한 핸들러가 들어감 / ex)aaa.do를 생성안했을 경우 
		
		//최소한의 예외처리
		String view = null;
		
		//null이 아닌 경우에만 실행
		if(handler != null) {
			view = handler.process(request, response);//다형성에 의해서 실직적인 상속받은 형태를 출력 / 오버라이딩 된 process가.. 
		}else {
			//ex)aaa.do를 생성안했을 경우 handler가 null값이 들어가서 아래 구문 출력
			System.out.println("[경고]명령어에 매핑된 객체가 없습니다");
		}
		
		//view가 null이 아니면
		if(view != null) {
			//API 이 문자로 시작하느냐 / 시작이 redirect냐
			if(view.startsWith("redirect:")) {
				//command쪽에서 redirect시킬때...
				view = view.substring("redirect:".length());
				response.sendRedirect(view);
			}else{
				//command쪽에서 fowarding되는 것
				RequestDispatcher dispatcher = request.getRequestDispatcher(view);
				dispatcher.forward(request, response);
			}
		}
		
		
		/* 이 방식으로도 간단하게 MVC모델2 형성가능
		 * 지금은 Factory 패턴을 추가해서 사용하는것이기 때문에 사용안함
		if(command.equals("/login.do")) {
			
		}else if(command.equals("/main.do")) {
			
		}*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
