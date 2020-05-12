package com.my.freeboard.board.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.freeboard.mapper.BoardSQLMapper;
import com.my.freeboard.mapper.MemberSQLMapper;
import com.my.freeboard.vo.BoardVo;
import com.my.freeboard.vo.MemberVo;

@Service
public class BoardServiceImpl {
	
	//boardmapper 주입
	@Autowired
	private BoardSQLMapper boardSQLMapper;
	@Autowired
	private MemberSQLMapper memberSQLMapper;
	
	//글 작성 처리
	public void writeContent(BoardVo boardVo) {
		boardSQLMapper.insertByWrite(boardVo);
	}
	
	//전체 글 가져오기
	public List<Map<String,Object>> getBoardList(){
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		List<BoardVo> boardList = boardSQLMapper.selectAll();
		
		for(BoardVo boardVo : boardList) {
			MemberVo memberVo = memberSQLMapper.selectByNo(boardVo.getMember_no());
		
			Map<String, Object> map = new HashMap<String, Object>();
			
			map.put("memberVo", memberVo);
			map.put("boardVo", boardVo);
			
			list.add(map);
		}
		return list;
	}
	
	//글 읽기 처리
	public Map<String, Object> getBoard(int board_no){
		Map<String, Object> map = new HashMap<String, Object>();
		
		BoardVo boardVo = boardSQLMapper.selectByNo(board_no);
		MemberVo memberVo = memberSQLMapper.selectByNo(boardVo.getMember_no());
		
		map.put("memberVo", memberVo);
		map.put("boardVo", boardVo);
		return map;
	}
	
	
}
