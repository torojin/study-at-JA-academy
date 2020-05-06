package com.ja.rubato.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ja.rubato.controller.command.CommandHandler;
import com.ja.rubato.controller.CommandFactory;


/**
 * Servlet implementation class ControllerUsingURI
 */
//@WebServlet("/ControllerUsingURI")
public class ControllerUsingURI extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//멤버 변수 생성
	private CommandFactory commandFactory;	

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerUsingURI() {
        super();
        commandFactory = new CommandFactory();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("넘어온 명령어 : "+request.getRequestURI()); 
		String command = request.getRequestURI();
	
		command = command.substring(request.getContextPath().length()); 
		
		System.out.println("명령어 : "+command);
		
		CommandHandler handler = commandFactory.getCommandHandler(command);	
		
		String view = null;
		
		//null이 아닌 경우에만 실행
		if(handler != null) {
			view = handler.process(request, response);
		}else {
			System.out.println("[경고]명령어에 매핑된 객체가 없습니다");
		}
		
		//view가 null이 아니면
		if(view != null) {
			if(view.startsWith("redirect:")) {
				view = view.substring("redirect:".length());
				response.sendRedirect(view);
			}else{
				RequestDispatcher dispatcher = request.getRequestDispatcher(view);
				dispatcher.forward(request, response);
			}
		}	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
