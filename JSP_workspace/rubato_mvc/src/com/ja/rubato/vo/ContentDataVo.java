package com.ja.rubato.vo;

//ContentDateVo는 Member, Board테이블을 쿼리문으로 조인하지 않고 
//데이터를 불러와서 조인하는 것?
public class ContentDataVo {
	//field 생성
	private MemberVo memberVo;
	private BoardVo boardVo;
	
	//constructor 생성
	public ContentDataVo(){
		super();
	}
	public ContentDataVo(MemberVo memberVo, BoardVo boardVo) {
		super();
		this.memberVo = memberVo;
		this.boardVo = boardVo;
	}
	
	//getter, setter 생성
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
