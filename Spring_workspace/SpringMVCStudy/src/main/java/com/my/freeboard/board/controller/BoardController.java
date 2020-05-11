package com.my.freeboard.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@RequestMapping("/main_board_page.do")
	public String boardPage() {
		return "board/main_board_page";
	}
}
