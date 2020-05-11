package com.my.freeboard.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.freeboard.mapper.HobbySQLMapper;
import com.my.freeboard.mapper.MemberSQLMapper;
import com.my.freeboard.vo.MemberVo;

@Service
public class MemberServiceImpl {
	//Mapper주입
	@Autowired
	private MemberSQLMapper memberSQLMapper;
	
	@Autowired
	private HobbySQLMapper hobbySQLMapper;
	
	//로그인 처리
	public MemberVo login(MemberVo memberVo) {
		return memberSQLMapper.selectByIdAndPW(memberVo);
	}
	
	//회원가입 처리
	public void joinMember(MemberVo memberVo, int[] member_hobby) {
		//mapper에서 select한 key 값 가져옴
		int member_key = memberSQLMapper.createKey();
		//가져온 key값을 Member_no에 넣어줌
		memberVo.setMember_no(member_key);
		memberSQLMapper.insertByJoinMember(memberVo);
		
		if(member_hobby == null) {
			return;
		}
		for(int hobby : member_hobby) {
			hobbySQLMapper.insertByHobby(member_key, hobby);
		}
		
		
	}
	
}
