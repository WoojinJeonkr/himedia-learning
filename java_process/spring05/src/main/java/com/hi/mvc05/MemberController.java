package com.hi.mvc05;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // spring framework에 컨트롤러 역할의 클래스 등록
public class MemberController {

	@Autowired
	MemberDAO dao; // 주소 주입!!
	// 회원과 관련된 여러가지 제어를 담당하는 클래스
	// 회원가입, 검색, 수정, 탈퇴, 로그인 기능을 제어함.
	@RequestMapping("check.hi") 
	public void login(MemberVO vo, HttpSession session) throws Exception {
		System.out.println(vo);
		boolean result = dao.login(vo);
		// boolean 이므로 비교연산자도 사용 가능하다.
		if(result) {
			// 세션을 잡아두어라, 세션마다 이름을 unique하게 string으로 잡아줘야 한다.
			session.setAttribute("user", vo.getId());
			// name을 세션으로 잡아서, 브라우저 2곳에서
			// id가 apple인 홍길동님 환영합니다.
			session.setAttribute("name", "홍길동");
		}
	}
	
	// create라고 요청이 들어오면
	// 회원가입 기능을 처리해주세요.
	@RequestMapping("create")
	public void create(MemberVO vo) throws Exception {
		System.out.println("회원가입 제어 요청됨.");
		// 1. 입력한 값 받아오기
		// 2. vo 만들어서 넣기.
		System.out.println(vo);
		// 3. dao한테 vo 주면서 create 호출(요청)
		dao.create(vo);
	}
	
	// up이라고 요청이 들어오면
	// 회원수정 기능을 처리해주세요.
	@RequestMapping("up") // 초록화면
	public void upadate(MemberVO vo) throws Exception {
		System.out.println("회원수정 제어 요청됨.");
		dao.update(vo);
	}
	
	// del이라고 요청이 들어오면
	// 회원탈퇴 기능을 처리해주세요.
	@RequestMapping("del") // 핑크화면
	public void delete(MemberVO vo) throws Exception {
		System.out.println("회원탈퇴 제어 요청됨.");
		dao.delete(vo);
	}
}

