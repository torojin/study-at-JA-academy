package com.ja.freeboard.board.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ja.freeboard.board.service.BoardServiceImpl;
import com.ja.freeboard.vo.BoardVo;
import com.ja.freeboard.vo.MemberVo;
//여기가 핵심
@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	//service 주입
	@Autowired
	private BoardServiceImpl boardService;
	
	@RequestMapping("/main_page.do")
	public String mainPage(Model model) {
		List<Map<String,Object>> list =boardService.getBoardList();
		
		model.addAttribute("dataList", list);
		return "board/main_page";
	}
	
	@RequestMapping("write_content_page.do")
	public String writeContentPage() {
		return "board/write_content_page";
	}
	
	//title과 content 받아옴
	@RequestMapping("write_content_process.do")
	public String writeContentProcess(BoardVo boardVo, HttpSession session) {
		
		MemberVo memberVo = (MemberVo)session.getAttribute("sessionUser");
		
		boardVo.setMember_no(memberVo.getMember_no());
		
		boardService.writeContent(boardVo);
		
		return"redirect:./main_page.do";
	}
	
	//글 읽기
	@RequestMapping("/read_content_page.do")
	public String readContentPage(int board_no, Model model) {
		
		Map<String,Object> map = boardService.getBoard(board_no);
		
		//model에 넣어줌?
		model.addAttribute("data",map); //page쪽에 $표시 이름
		
		return "board/read_content_page";
	}
	
	//글 삭제 처리
	@RequestMapping("/delete_content_process.do")
	public String deleteContentProcess(int board_no) {
		boardService.deleteContent(board_no);
		return "redirect:/board/main_page.do"; 
	}
	
	//글 수정 페이지
	@RequestMapping("/update_content_page.do")
	public String updateContentPage(int board_no, Model model) {
		model.addAttribute("data",boardService.getBoard(board_no));
		return "board/update_content_page";
	}
	
	//글 수정 기능
	@RequestMapping("/update_content_process.do")
	public String updateContentProcess(BoardVo boardVo) {
		boardService.updateContent(boardVo);
		return "redirect:/board/main_page.do";
	}
	
}
