package com.hi.mvcProject;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceCenterfaqDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public List<ServiceCenterfaqVO> all() {
		return my.selectList("serviceCenterfaq.list");
	}
}
