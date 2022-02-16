package com.hi.mvc04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // spring framework에 컨트롤러 역할의 클래스 등록
public class BookController {

	// create라고 요청이 들어오면
	// 회원가입 기능을 처리해주세요.
	@RequestMapping("create")
	public void create(BookVO vo, BookDAO dao) throws Exception {
		System.out.println("회원가입 제어 요청됨.");
		dao.create(vo);
	}
	
	// update이라고 요청이 들어오면
	// 북마크 수정 기능을 처리해주세요.
	@RequestMapping("update")
	public void upadate(BookVO vo, BookDAO dao) throws Exception {
		System.out.println("북마크 수정 제어 요청됨.");
		dao.update(vo);
	}
	
	// delete라고 요청이 들어오면
	// 북마크 삭제 기능을 처리해주세요.
	@RequestMapping("delete")
	public void delete(BookVO vo, BookDAO dao) throws Exception {
		System.out.println("북마크 삭제 제어 요청됨.");
		dao.delete(vo);
	}
}

