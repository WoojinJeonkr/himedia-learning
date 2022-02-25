package com.hi.mvc07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

	@Autowired
	StockDAO dao;
	
	public void crawl(String code) {
		// 크롤링해서 db에 넣음.
		// dao.insert(vo);
	}
}
