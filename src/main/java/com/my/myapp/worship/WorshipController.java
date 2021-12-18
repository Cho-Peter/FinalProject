package com.my.myapp.worship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/worship")
public class WorshipController {
	
	@Autowired
	WorshipServiceImpl worshipService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String worshiplist(Model model) {
		model.addAttribute("list", worshipService.getWorshipList());
		return "list";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addPost() {
		return "addpostform";
	}
	
	@RequestMapping(value = "/addok", method = RequestMethod.POST)
	public String addPostok(WorshipVO vo) {
		int i = worshipService.insertWorship(vo);
		if (i==0)
			System.out.println("데이터 추가 실패");
		else
			System.out.println("데이터 추가 성공!!!");
		return "redirect:list";
	}
	
	@RequestMapping(value = "/editpost/{id}", method = RequestMethod.GET)
	public String editpost(@PathVariable("id") int id, Model model) {
		WorshipVO worshipVO = worshipService.getWorship(id);
		model.addAttribute("u",worshipVO);
		return "editform";
	}
	
	@RequestMapping(value = "/editok", method = RequestMethod.POST)
	public String editPostok(WorshipVO vo) {
		int i = worshipService.updateWorship(vo);
		if (i==0)
			System.out.println("데이터 변경 실패");
		else
			System.out.println("데이터 변경 성공!!!");
		return "redirect:list";
	}
	
	@RequestMapping(value = "/deleteok/{id}", method = RequestMethod.GET)
	public String deletePostok(@PathVariable("id") int id) {
		int i = worshipService.deleteWorship(id);
		if (i==0)
			System.out.println("데이터 제거 실패");
		else
			System.out.println("데이터 제거 성공!!!");
		return "redirect:../list";
	}
	
	
}
