package com.hi.mvcProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ServicecenterController {

	@Autowired
	ServicecenterDAO dao;
	
	@RequestMapping("serviceWrite")
	public String create(ServicecenterVO vo) {
		System.out.println("게시글등록요청");
		int result =dao.create(vo);
		if(result==1) {
			System.out.println("게시글등록");
			
			return "serviceInsert";

		}else {
			System.out.println("실패");
			return "er";
		}
	}
	
	@RequestMapping("serviceUpdate1")
	public void update(ServicecenterVO vo) {
		dao.update(vo);
	}
	
	@RequestMapping("serviceUpdate2")
	public void preupdate(ServicecenterVO vo, Model model) {
		ServicecenterVO one = dao.readOne(vo);
		model.addAttribute("one",one);
		System.out.println("update요청_");
	}
	
	
	@RequestMapping("serviceDelete")
	public void delete(ServicecenterVO vo) {
		dao.delete(vo);
	}
	@RequestMapping("serviceOne")
	public void readone(ServicecenterVO vo, Model model) {
		ServicecenterVO vo2= dao.readOne(vo);
		model.addAttribute("one", vo2);
	}
	
	@RequestMapping("serviceList")
	public void readlist(Model model) {
		List<ServicecenterVO> list=dao.all();
		model.addAttribute("list", list);
	}
	
}
