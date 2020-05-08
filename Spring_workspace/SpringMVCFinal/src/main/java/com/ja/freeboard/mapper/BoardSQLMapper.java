package com.ja.freeboard.mapper;

import java.util.ArrayList;
import java.util.List;

import com.ja.freeboard.vo.BoardVo;

public interface BoardSQLMapper {
	
	public void insert(BoardVo boardVo);
	
	//글 보기 기능
	public BoardVo selectByNo(int no);
	
	//전체 글 리스트
	public List<BoardVo> selectAll();//return 할때 다형성을 위해서 List로 해준다/ 나중에 linkedlist로 바꾸거나 ArrayList로 바꿔서 사용할때도 편함
	
	//글 삭제 기능
	public void delectByNo(int no);
	
	//글 쓰기 기능
	public void update(BoardVo vo);
	
	//글 조회수 기능
	public void updateReadCount(int no);
}
