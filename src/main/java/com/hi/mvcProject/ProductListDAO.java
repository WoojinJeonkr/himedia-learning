package com.hi.mvcProject;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductListDAO {

	@Autowired
	SqlSessionTemplate my;

	public ProductListVO one(ProductListVO vo) {
		System.out.println("ProductListVO vo:"+vo);
		return my.selectOne("productlist.one", vo);
	}

	//---------------페이징---------------------
	public List<ProductListVO> all(ProductPage page) {
		return my.selectList("productlist.list", page);
	}
	
	public int count() {
		return my.selectOne("productlist.count");
	}
	
	//---------------페이징------------------
	public int insert(ProductListVO vo) {
		return my.insert("productlist.insert", vo);
	}
	public int update(ProductListVO vo) {
		System.out.println("DAO vo"+vo);
		return my.update("productlist.update", vo);
	}
	public int delete(ProductListVO vo) {
		System.out.println("DAO del vo"+vo);
		return my.delete("productlist.delete", vo);
	}
	
}
