package com.hi.mvcProject;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceCenterDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public int create (ServiceCenterVO vo) {
		return my.insert("serviceCenter.create",vo);
	}
	public ServiceCenterVO readOne (ServiceCenterVO vo) {
		return my.selectOne("serviceCenter.one",vo);
	}
	public List<ServiceCenterVO> all() {
		return my.selectList("serviceCenter.list");
	}
	public int update (ServiceCenterVO vo) {
		return my.update("serviceCenter.update",vo);
	}
	public int delete (ServiceCenterVO vo) {
		return my.delete("serviceCenter.delete",vo);
	}
}
