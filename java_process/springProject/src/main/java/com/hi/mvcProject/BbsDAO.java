package com.hi.mvcProject;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public BbsVO createdId() {
		return my.selectOne("bbs.createdId");
	}
	
	public int insert(BbsVO vo) {
		return my.insert("bbs.in", vo);
	}
	
	public BbsVO one(BbsVO vo) {
		return my.selectOne("bbs.one", vo);
	}
	
	public List<BbsVO> all() {
		return my.selectList("bbs.list");
	}
	
	public int up(BbsVO vo) {
		return my.update("bbs.up", vo);
	}
	
	public int del(BbsVO vo) {
		return my.delete("bbs.del", vo);
	}
}
