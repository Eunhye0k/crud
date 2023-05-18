package com.example.crud.Service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.crud.Model.Member;

@Service
public interface MemberService {
	int addUserId(Member member) throws Exception; 
	List<Member> login(HashMap<String,Object> map);
}
