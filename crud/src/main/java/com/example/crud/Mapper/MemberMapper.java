package com.example.crud.Mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.crud.Model.Member;

@Mapper
public interface MemberMapper {
	
	int addUserId(Member member) throws Exception; 
	List<Member> login(HashMap<String,Object> map);
}
