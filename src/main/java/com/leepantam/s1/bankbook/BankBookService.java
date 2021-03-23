package com.leepantam.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bDao;
	
	
	public List<BankBookDTO> getList() throws Exception {
		return bDao.getList();
	}
	
	public BankBookDTO getSelect(BankBookDTO bDto) throws Exception {
		return bDao.getSelect(bDto);
	}
	
	public void setWrite(BankBookDTO bDto) throws Exception {
		bDao.setWrite(bDto);
	}
	
	public void setDelete(BankBookDTO bDto) throws Exception{
		bDao.setDelete(bDto);
	}
}
