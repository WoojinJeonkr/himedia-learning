package com.hi.mvcProject;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicecenterDAO {
	@Autowired
	SqlSessionTemplate my;
	
	public int create (ServicecenterVO vo) {
		return my.insert("servicecenter.create",vo);
	}
	
	public ServicecenterVO readOne (ServicecenterVO vo) {
		return my.selectOne("servicecenter.one",vo);
	}
	
	public List<ServicecenterVO> all() {
		return my.selectList("servicecenter.list");
	}
	
	public int update (ServicecenterVO vo) {
		return my.insert("servicecenter.up",vo);
	}
	
	public int delete (ServicecenterVO vo) {
		return my.insert("servicecenter.del",vo);
	}
}
