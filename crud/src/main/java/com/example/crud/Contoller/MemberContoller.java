package com.example.crud.Contoller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.crud.Model.Member;
import com.example.crud.Service.MemberService;

@Controller
public class MemberContoller {

	@Autowired
	private MemberService memberService;
	
	//회원가입
	@GetMapping("/member/join")
	public String join() {
		return "join";
	}
	
	//회원가입
	@PostMapping("/member/join")
	public String create(@RequestParam HashMap <String, Object> map) throws Exception {
		Member member = new Member();
		member.setmId((String) map.get("id"));
		member.setmName((String) map.get("name"));
		member.setmPassword((String) map.get("password"));
		member.setmAddress((String) map.get("address"));
		
		memberService.addUserId(member);
		return "complate";
	}
	
	@GetMapping("/member/login")
	public String loginPage() {
		return "login";
	}
	
	
	@PostMapping("/member/login")
	public String loginSuccess(@RequestParam HashMap<String, Object> map) throws Exception {
		memberService.login(map);
		Member member = new Member();
		return "main";
	}
	
}
