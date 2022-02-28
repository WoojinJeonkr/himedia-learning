package com.hi.mvcProject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductListService {

	@Autowired
	ProductlistDAO productlistDAO;
	
	public Map<String, Object> getProductList(int currentPage, int rowPerPage){
		
		int productListTotal = productlistDAO.count();
		
		System.out.println("========productListTotal:"+productListTotal);
		//Math.ceil() 함수 --> 입력받은 숫자를 올림한 정수를 리턴하는 함수 
		//1.lastPage 변수 생성 
		int lastPage = (int)Math.ceil((double)productListTotal/rowPerPage);
		System.out.println("========lastPage:"+lastPage);
		//컨트롤러에서 보내준 매개값 가공 
		ProductPage page = new ProductPage(); 
		
		page.setBeginRow((currentPage-1)*rowPerPage); //행 개수 
		page.setRowPerPage(rowPerPage);				  //0*rowPerPage    1    2    3   4....
													  //1*rowPerPage
													  //2*rowPerPage
		
		//dao 호출 
		List<ProductlistVO> list = productlistDAO.all(page);
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("lastPage", lastPage); 
		map.put("list", list); 
		
		return map; 
		
	}	
}
