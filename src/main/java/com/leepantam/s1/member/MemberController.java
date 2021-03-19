package com.leepantam.s1.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView memeberLogin(MemberDTO mDto,ModelAndView modelAndView) throws Exception {
		mDto = mServ.memberLogin(mDto);
	
		modelAndView.addObject("dto", mDto);
		modelAndView.setViewName("/member/memberPage");
		
		return modelAndView;
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
	public void memberJoin(MemberDTO mDto) throws Exception {
		
		int result = mServ.memberJoin(mDto);
		System.out.println(result);
	}
	
}
