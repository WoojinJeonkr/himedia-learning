package com.hi.mvcProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ServiceCenterfaqController {

	@Autowired
	ServiceCenterfaqDAO dao;
	
	@RequestMapping("servicefaqList")
	public void list(Model model) {
		List<ServiceCenterfaqVO> list=dao.all();
		model.addAttribute("list", list);
	}
	
}
