package com.ja.p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test1
 */
@WebServlet("/Test1") //URL쪽에다 이걸 실행하겠다?
public class Test1 extends HttpServlet { //HttpServlet를 상속받았다
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//System.out.println("안녕하세요?!?!?!!?!?");
		//response 객체에는...
		//웹브라우저쪽으로 출력해주는.. 통신으로 웹브라우저에 날라간다
//		response.getWriter().println("Hello");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='uft-8'");
		out.println("</head>");
		out.println("<body>");
		
		int count = (int)(Math.random()*20);
		for(int i = 0; i < count ; i++) {
		out.println("<p>Hello</p><br>");
		}
		out.println("<a href='./test2'>test2</a>");
		out.println("</body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
