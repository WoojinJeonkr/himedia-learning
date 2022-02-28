package com.hi.mvc07;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

	@Autowired
	StockDAO dao;
	
	public void crawl(String code) {
		// 1. 사이트에 연결(http 요청)
		// 2. html 문서를 받아온다.(http 응답) 7000줄 코드를 받음
		String url = "https://finance.naver.com/item/main.naver?code="+ code;
		
		try {
			Document doc = Jsoup.connect(url).get();
			
			Elements list7 = doc.select("#middle > div.h_company > div.wrap_company > h2 > a");
			// 크롤링한 결과값이 있을 때만 vo 만들고, db에 넣자!!
			// 추출하기 전에 size() 구해서, 0이 아니면 추출하게 처리!
			if(list7.size() != 0) {
				String company = list7.get(0).text(); // 회사 이름
				
				Elements list4 = doc.select("div.today span.blind");
				String today = list4.get(0).text();
				String[] s = today.split(",");
				String today2 = String.join("", s);
				int today3 = Integer.parseInt(today2); // 오늘 가격
				
				Elements list5 = doc.select("td.first span.blind");
				String high = list5.get(0).text();
				String[] h = high.split(",");
				String high2 = String.join("", s);
				int high3 = Integer.parseInt(high2);
	
				
				Elements list6 = doc.select("table > tbody > tr:nth-child(1) > td:nth-child(2) span.blind");
				String[] y = today.split(",");
				String yesterday2 = String.join("", s);
				int yesterday3 = Integer.parseInt(yesterday2);
				// 1. 크롤링한 5개의 값을 vo에 넣어야 함
				StockVO vo = new StockVO();
				vo.setCode(code);
				vo.setCompany(company);
				vo.setHigh(high3);
				vo.setToday(today3);
				vo.setYesterday(yesterday3);
				
				System.out.println(vo);
				// 2. DAO에 vo를 주면서 insert해달라고 요청함
				dao.insert(vo);
			}
		} catch (IOException e) {
			System.out.println("크롤링하는 중 에러 발생..."); 
			e.printStackTrace();
		}
	}
}
