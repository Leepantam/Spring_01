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
		mDto.setId(id);
		mDto.setPw(pw);
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
	public void memberJoin2(MemberDTO mDto) throws Exception {
		
		int result = mServ.memberJoin(mDto);
		System.out.println(result);
	}
	
}
