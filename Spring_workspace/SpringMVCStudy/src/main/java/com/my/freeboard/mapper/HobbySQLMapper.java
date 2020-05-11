package com.my.freeboard.mapper;

import org.apache.ibatis.annotations.Param;

public interface HobbySQLMapper {
	//취미 처리
	public void insertByHobby(@Param("member_no")int member_no, @Param("hobby_category_no")int hobby_category_no);
}
