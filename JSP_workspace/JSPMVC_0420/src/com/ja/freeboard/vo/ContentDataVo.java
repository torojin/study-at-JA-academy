package com.ja.freeboard.vo;

//객체 안에 객체가 있는 형태
public class ContentDataVo {
	//field 생성
	private MemberVo memberVo;
	private BoardVo boardVo;
	
	//constructor 생성
	public ContentDataVo() {
		super();
	}
	public ContentDataVo(MemberVo memberVo, BoardVo boardVo) {
		super();
		this.memberVo = memberVo;
		this.boardVo = boardVo;
	}
	
	//getter, setter생성
	public MemberVo getMemberVo() {
		return memberVo;
	}
	public void setMemberVo(MemberVo memberVo) {
		this.memberVo = memberVo;
	}
	public BoardVo getBoardVo() {
		return boardVo;
	}
	public void setBoardVo(BoardVo boardVo) {
		this.boardVo = boardVo;
	}

}