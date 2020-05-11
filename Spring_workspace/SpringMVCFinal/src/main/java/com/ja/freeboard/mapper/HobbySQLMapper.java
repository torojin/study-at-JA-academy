package com.ja.freeboard.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.ja.freeboard.vo.HobbyVo;

public interface HobbySQLMapper {
	@Insert("INSERT INTO FB_Hobby VALUES(FB_Hobby_seq.nextval, #{member_id}, #{hobby_category_no})")
	//public void insert(HobbyVo vo);
	//위에 처럼 parameter는 하나만 받아와서 사용할 수 있다
	//단, 아래 방법처럼 사용도 가능하다
	//parameter 2개 이상 받아올때 이 방식을 사용해야한다
	public void insert(
			@Param("member_id")int member_id,
			@Param("hobby_category_no")int hobby_category_no);
}







