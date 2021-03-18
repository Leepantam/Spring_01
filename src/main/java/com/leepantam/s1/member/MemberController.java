package com.leepantam.s1.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService mServ;

	@RequestMapping(value="/member/memberLogin")
	public String memberLogin() {
		
		
		System.out.println("memberLogin test");
		return "member/memberLogin";
	}
	
	@RequestMapping(value="/member/memberLogin",method=RequestMethod.POST)
	public void memeberLogin2(HttpServletRequest request) throws Exception {
		MemberDTO mDto = new MemberDTO();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		mDto.setID(id);
		mDto.setPW(pw);
		mDto = mServ.memberLogin(mDto);
		System.out.println(mDto);
	}
	
	//memberJoin     /member/memberJoin get
	//memberJoin2    /member/memberJoin post
	// 
	
	@RequestMapping(value="/member/memberJoin", method=RequestMethod.GET)
	public String memberJoin() {
		System.out.println("join-get");
		return "member/memberJoin";
	}

	@RequestMapping(value="/member/memberJoin", method=RequestMethod.POST)	
	public void memberJoin2(String id, String pw, String name, String phone, String email) throws Exception {
		MemberDTO mDto = new MemberDTO();
		mDto.setID(id);
		mDto.setPW(pw);
		mDto.setNAME(name);
		mDto.setPHONE(phone);
		mDto.setEMAIL(email);
		int result = mServ.memberJoin(mDto);
		System.out.println(result);
	}
	
}
