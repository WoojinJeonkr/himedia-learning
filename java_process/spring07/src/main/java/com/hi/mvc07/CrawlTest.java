package com.hi.mvc07;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class CrawlTest {

	public static void main(String[] args) {
		// 1. 사이트에 연결(http 요청)
		// 2. html 문서를 받아온다.(http 응답) 7000줄 코드를 받음
		String url = "https://finance.naver.com/item/main.naver?code=035720";
		
		try {
			Document doc = Jsoup.connect(url).get();
			// System.out.println(doc);
			// Elements list = doc.select("#middle > div.h_company > div.wrap_company > div > span.code");
			Elements list = doc.select("span.code");
			System.out.println(list.size());
			System.out.println(list.get(0).text()); // a.b.c : 체인 구조
			
//			Elements list2 = doc.select("span.tx");
//			System.out.println(list2.size());
//			System.out.println(list2);
//			System.out.println("span.tx의 7번째 요소는 "+list2.get(6).text()+"입니다.");
//			
//			Elements list3 = doc.select("em.date");
//			System.out.println(list3);
//			System.out.println("크롤링한 주식의 시간은 "+list3.get(0).text()+"입니다.");
			
			// Elements list4 = doc.select("div.today > p > em > span.blind");
			Elements list4 = doc.select("div.today span.blind");
			System.out.println(list4.size());
			System.out.println(list4.get(0).text());
			String today = list4.get(0).text();
			String[] s = today.split(",");
			String today2 = String.join("", s);
			System.out.println(today2);
			int today3 = Integer.parseInt(today2);
			System.out.println(today3 + 100);
			
			Elements list5 = doc.select("td.first span.blind");
			/* System.out.println(list5.size()); */
			System.out.println(list5.get(0).text());
			
			Elements list6 = doc.select("table > tbody > tr:nth-child(1) > td:nth-child(2) span.blind");
			/* System.out.println(list6.size()); */
			System.out.println(list6.get(0).text());
			
		} catch (IOException e) {
			System.out.println("크롤링하는 중 에러 발생..."); 
			e.printStackTrace();
		}
		// 3. 조건을 주어 추출하고자 하는 위치를 찾아서 해당 노드를 가지고 온다.
		//    결과는 list 자료 구조를 사용
		//    기존에 있는 ArrayList를 재사용해서 기능을 더 붙여놓은
		//    Elements(상속해서 만들어 놓음)

	}

}
