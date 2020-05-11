package com.ja.freeboard.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ja.freeboard.mapper.BoardSQLMapper;
import com.ja.freeboard.mapper.MemberSQLMapper;
import com.ja.freeboard.vo.BoardVo;
import com.ja.freeboard.vo.MemberVo;

import java.util.*;

@Service 
public class BoardServiceImpl {
	
	//글 내용 받아오기..?
	
	//주입
	@Autowired
	private BoardSQLMapper boardSQLMapper;
	@Autowired
	private MemberSQLMapper memberSQLMapper;
	
	
	public void writeContent(BoardVo boardVo) {
		boardSQLMapper.insert(boardVo);
	}
	
	public List<Map<String, Object>> getBoardList() {
		//자바 8버전부터는 new ArrayList<>이렇게 Map를 생략해서 사용 가능하다
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		List<BoardVo> boardList = boardSQLMapper.selectAll();
		//hashMap으로 넣겠다
		for(BoardVo boardVo : boardList) {
			MemberVo memberVo = memberSQLMapper.selectByNo(boardVo.getMember_no());
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("memberVo", memberVo);
		map.put("boardVo", boardVo);
		
		list.add(map);
		}
		return list;
	}
	
	//글 읽기
	public Map<String, Object> getBoard(int board_no) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		boardSQLMapper.updateReadCount(board_no); //따로 분리해서 사용도 가능
		
		//board_no를 받아서 연결..?
		BoardVo boardVo = boardSQLMapper.selectByNo(board_no);
		MemberVo memberVo = memberSQLMapper.selectByNo(boardVo.getMember_no());
		
		map.put("memberVo", memberVo);
		map.put("boardVo", boardVo);
		
		return map;
	}
	
	//삭제 기능
	public void deleteContent(int board_no) {
		boardSQLMapper.delectByNo(board_no);
	}
	
	//글 수정
	public void updateContent(BoardVo boardVo) {
		boardSQLMapper.update(boardVo);
	}
	
}





