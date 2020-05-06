/**
 * 
 */
package com.ja.freeboard.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author USER
 * 의존관계를 낮춘다
 */

//1.서블릿이 받는다 뭘?
public interface CommandHandler {
	public String process(HttpServletRequest request, HttpServletResponse response);
}
