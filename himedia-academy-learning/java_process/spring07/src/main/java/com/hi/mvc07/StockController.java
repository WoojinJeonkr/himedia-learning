package com.hi.mvc07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StockController {
	
	@Autowired
	StockDAO dao;
	
	@Autowired
	StockService service;
	
	@RequestMapping("create.do")
	public void insert(StockVO vo) {
		dao.insert(vo);
	}
	
	// 입력한 코드(String)을 받아서 : controller
		@RequestMapping("stock.do")
		// string으로 return하는 이유: stock.do에 대한 요청이 들어왔을 때 finance.jsp로 리턴해야 하므로
		public String insert2(String code) {
			service.crawl(code);
			return "redirect:finance.jsp";
		}
		// 크롤링을 한 후
		// db에 넣자
}
