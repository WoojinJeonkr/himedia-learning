package com.hi.mvc05;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int create(ProductVO vo) throws Exception  {
		return my.insert("product.create", vo);
		// namespace.id
	}
	
	public ProductVO One(ProductVO vo) {
		return my.selectOne("product.one", vo);
	}
	
	public List<ProductVO> all() {
		return my.selectList("product.all");
	}
	
	public int update(ProductVO vo) {
		return my.update("product.up", vo);
	}
	
	public int delete(ProductVO vo) {
		return my.delete("product.del", vo);
	}
}
