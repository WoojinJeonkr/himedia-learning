package com.hi.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class ProductController {

	@Autowired
	ProductDAO dao;
	
	@RequestMapping("create")
	public void create(ProductVO vo) throws Exception {
		dao.create(vo);
	}
}

