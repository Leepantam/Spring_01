package com.leepantam.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankBookcontroller {
	
	@Autowired
	private BankBookService bServ;
	
	@RequestMapping(value="/bankbook/bankbookList")
	public void bankbookList(Model model) throws Exception {
		List<BankBookDTO> array = bServ.getList();
		model.addAttribute("array",array);
		model.addAttribute("kind", "test");
	}
	
	@RequestMapping(value="/bankbook/bankbookSelect")
	public Model bankbookSelect(BankBookDTO bDto,Model model) throws Exception {
		bDto=bServ.getSelect(bDto);
		model.addAttribute("dto", bDto);
		return model;
	}
	
	@RequestMapping(value="/bankbook/bankbookAdd")
	public void bankbookAdd() {
		
	}
	
	@RequestMapping(value="/bankbook/bankbookAdd",method=RequestMethod.POST)
	public ModelAndView bankbookAdd(BankBookDTO bDto,ModelAndView mv) throws Exception {
		mv.setViewName("redirect:/bankbook/bankbookList");
		bServ.setWrite(bDto);
		
		return mv;
	}
	
	@RequestMapping(value="/bankbook/bankbookUpdate")
	public void bankbookUpdate() {
		
	}
	
	@RequestMapping(value="/bankbook/bankbookUpdate",method=RequestMethod.POST)
	public String bankbookUpdate(BankBookDTO bDto) throws Exception {

		
		// DAO Update 만들기
		return "redirect:/bankbook/bankbookList";
	}
	
	@RequestMapping(value="/bankbook/bankbookDelete",method=RequestMethod.POST)
	public String bankbookDelete(BankBookDTO bDto) throws Exception {
		bServ.setDelete(bDto);
		
		return "redirect:/bankbook/bankbookList";
	}
	
}
