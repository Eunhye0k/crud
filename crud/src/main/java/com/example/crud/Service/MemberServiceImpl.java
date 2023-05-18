package com.example.crud.Service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.Mapper.MemberMapper;
import com.example.crud.Model.Member;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	public int addUserId(Member member) throws Exception {
		return memberMapper.addUserId(member);
	} 
	
	public List<Member> login (HashMap<String,Object> map) {
		return memberMapper.login(map);
	};

}
