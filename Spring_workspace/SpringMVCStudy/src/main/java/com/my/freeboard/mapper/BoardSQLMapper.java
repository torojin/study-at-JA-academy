package com.my.freeboard.mapper;

import java.util.List;

import com.my.freeboard.vo.BoardVo;

public interface BoardSQLMapper {
	public void insertByWrite(BoardVo boardVo);
	
	//글 읽기 기능
	public BoardVo selectByNo(int no);
	
	//전체 글 리스트
	public List<BoardVo> selectAll();
	
	
}
