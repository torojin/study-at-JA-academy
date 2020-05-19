package com.ja.freeboard.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ja.freeboard.mapper.HobbySQLMapper;
import com.ja.freeboard.mapper.MemberSQLMapper;
import com.ja.freeboard.util.FBMessageDigest;
import com.ja.freeboard.vo.MemberVo;
import java.security.*;

@Service
public class MemberServiceImpl {
	
	@Autowired
	private MemberSQLMapper memberSQLMapper;
	@Autowired
	private HobbySQLMapper hobbySQLMapper;//지금은 hobbyService는 안만들고 MemberService에서 사용
	
	public void joinMember(MemberVo vo, int[] member_hobby) {
		String hashCode = FBMessageDigest.digest(vo.getMember_pw());
		vo.setMember_pw(hashCode);
		/*
		//비밀번호 해싱
		try {
			
			String hashCode = "";
			
			StringBuilder sb = new StringBuilder();
			
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
			messageDigest.reset();
			messageDigest.update(vo.getMember_pw().getBytes());
			
			byte[] chars = messageDigest.digest();
			
			for(int i = 0; i < chars.length; i++) {
				
				String tmp = Integer.toHexString(chars[i]& 0xff);
				
				//이렇게 쓰면 안된다. / 속도가 아주 느려진다. / String으로 하면안되고 String buffer or StringBuilder 로 처리
				//hashCode += tmp;
				
				if(tmp.length() == 1) {
					sb.append("0");
				}
				//자료구조에 쌓겠다
				sb.append(tmp);
			}
			hashCode = sb.toString();
			
			vo.setMember_pw(hashCode);
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		
		//select한 키 값 가져옴
		int member_key = memberSQLMapper.createKey();
		//primary key가 필요해서 가져옴
		vo.setMember_no(member_key);
		memberSQLMapper.insert(vo);
		
		//hobbySQLMapper.insert(member_key, member_hobby[0]);
		
		if(member_hobby == null) {
			return;
		}
		
		//리스트 출력후 member_key 받아와서 hobby리스트에 ..?
		for(int hobby : member_hobby) {
			hobbySQLMapper.insert(member_key, hobby);
		}
			
	}
	
	public MemberVo login(MemberVo vo) {
		String hashCode = FBMessageDigest.digest(vo.getMember_pw());
		vo.setMember_pw(hashCode);
		/*
		//해시코드 적용시킨 로그인
		try {
		
		String hashCode = "";
		
		StringBuilder sb = new StringBuilder();
		
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
		messageDigest.reset();
		messageDigest.update(vo.getMember_pw().getBytes());
		
		byte[] chars = messageDigest.digest();
		
		for(int i = 0; i < chars.length; i++) {
			
			String tmp = Integer.toHexString(chars[i]& 0xff);
			
			//이렇게 쓰면 안된다. / 속도가 아주 느려진다. / String으로 하면안되고 String buffer or StringBuilder 로 처리
			//hashCode += tmp;
			
			if(tmp.length() == 1) {
				sb.append("0");
			}
			//자료구조에 쌓겠다
			sb.append(tmp);
		}
		hashCode = sb.toString();
		
		vo.setMember_pw(hashCode);
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		return memberSQLMapper.selectByIdAndPw(vo);
		
	}
}
