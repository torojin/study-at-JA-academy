package com.my.freeboard.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.freeboard.board.service.BoardServiceImpl;
import com.my.freeboard.vo.BoardVo;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardServiceImpl boardServiceImpl;
	
	//게시판 메인 페이지
	@RequestMapping("/main_board_page.do")
	public String boardPage(Model model) {
		List<Map<String,Object>> list = boardServiceImpl.getBoardList();
		model.addAttribute("dataList", list);
		return "board/main_board_page";
	}
	
	//글 작성 페이지
	@RequestMapping("/write_content_page.do")
	public String writeBoardPage() {
		return "board/write_content_page";
	}
	
	//글 작성 처리
	@RequestMapping("/write_content_process.do")
	public String boardProcess(BoardVo boardVo) {
		boardServiceImpl.writeContent(boardVo);
		return "redirect:./main_board_page.do";
	}
	
	//글 읽기 처리
	@RequestMapping("/read_content_page.do")
	public String readContentPage(int board_no, Model model) {
		Map<String, Object> map = boardServiceImpl.getBoard(board_no);
		
		model.addAttribute("data",map);
		return "board/read_content_page";
	}
}
