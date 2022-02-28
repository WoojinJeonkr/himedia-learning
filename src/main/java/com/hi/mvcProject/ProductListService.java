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
		//Math.ceil() �븿�닔 --> 
		//1.lastPage 蹂��닔 �깮�꽦 
		int lastPage = (int)Math.ceil((double)productListTotal/rowPerPage);
		System.out.println("========lastPage:"+lastPage);
		ProductPage page = new ProductPage(); 
		
		page.setBeginRow((currentPage-1)*rowPerPage);  
		page.setRowPerPage(rowPerPage);				  //0*rowPerPage    1    2    3   4....
													  //1*rowPerPage
													  //2*rowPerPage
		
<<<<<<< HEAD
		//dao �샇異� 
=======
		//dao 호출 
>>>>>>> f055b2daf80a07ab207cc79c1309d0bc4041b43d
		List<ProductlistVO> list = productlistDAO.all(page);
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("lastPage", lastPage); 
		map.put("list", list); 
		
		return map; 
		
	}	
}
