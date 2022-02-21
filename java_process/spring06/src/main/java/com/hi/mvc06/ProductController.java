package com.hi.mvc06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.mvc06.ProductVO;

@Controller
public class ProductController {

	@Autowired
	ProductDAO dao;
	
	@RequestMapping("create")
	public void create(ProductVO vo) throws Exception {
		dao.create(vo);
	}
	
	@RequestMapping("all")
	public void all(Model model) {
		List<ProductVO> list = dao.all();
		System.out.println(list.size());
		model.addAttribute("list", list);
	}
	
	@RequestMapping("one")
	public void one(ProductVO vo, Model model) {
		ProductVO one = dao.One(vo);
		model.addAttribute("one", one);
	}
	
	@RequestMapping("update")
	public String upadate(ProductVO vo) {
		int result = dao.update(vo);
		if(result == 0) {
			return "error";
		} else {
			return "update";
		}
	}
	
	@RequestMapping("delete")
	public void delete(ProductVO vo) {
		dao.delete(vo);
	}
}

