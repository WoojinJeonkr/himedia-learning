package com.hi.mvc06;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int create(ProductVO vo) throws Exception  {
		return my.insert("product.create", vo);
	}
	
	public ProductVO One(ProductVO vo) {
		return my.selectOne("product.one", vo);
	}
	
	public List<ProductVO> all() {
		return my.selectList("product.all");
	}
	
	public int update(ProductVO vo) {
		return my.update("product.update", vo);
	}
	
	public int delete(ProductVO vo) {
		return my.delete("product.delete", vo);
	}
}
