package com.my.freeboard.mapper;

import com.my.freeboard.vo.MemberVo;

public interface MemberSQLMapper {
	//회원가입 처리
	public void insertByJoinMember(MemberVo memberVo);
	
	//key를 받아서 회원가입 처리(hobby부분 때문에??)
	public int createKey();
	
	//로그인 처리
	public MemberVo selectByIdAndPW(MemberVo memberVo);
	public MemberVo selectByNo(int memberNo);
	
}
