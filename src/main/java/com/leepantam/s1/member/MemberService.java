package com.leepantam.s1.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO mDao;
	
	public MemberDTO memberLogin(MemberDTO mDto) throws Exception {
		mDto = mDao.login(mDto);
		return mDto;
	}
	
	public int memberJoin(MemberDTO mDto) throws Exception {
		return mDao.memberJoin(mDto);
	}
	
}
