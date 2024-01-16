package com.hi.mvcProject;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // spring framework에 컨트롤러 역할의 클래스 등록
public class MemberController {

	@Autowired
	MemberDAO dao; 
	
	@RequestMapping("check") 
	public String login(MemberVO vo, HttpSession session) throws Exception {
		System.out.println(vo);
		MemberVO vo2 = dao.login(vo);
		System.out.println(vo2);
		// vo2가 로그인에 실패한 경우 null
		// vo2가 로그인에 성공한 경우 주소가 들어있음
		if(vo2 != null) { // 로그인에 성공했을 때
			// 세션을 잡자
			session.setAttribute("userId", vo2.getId());
			session.setAttribute("userName", vo2.getName());
			return "redirect:member.jsp";
		} else { // 로그인에 실패했을 때
			return "check";
		}
	}
	
	@RequestMapping("create")
	public String create(MemberVO vo) throws Exception {
		System.out.println(vo);
		int result = dao.create(vo);
		if(result == 1) {
			return "ok";
		} else {
			return "create";
		}
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:member.jsp";
	}
}

