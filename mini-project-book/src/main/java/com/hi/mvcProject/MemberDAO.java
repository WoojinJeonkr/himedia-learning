package com.hi.mvcProject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 싱글톤으로 만들어달라고 스프링에게 요청
public class MemberDAO {

	@Autowired
	SqlSessionTemplate my;

	//회원가입
	public int create(MemberVO vo) {
		int result = 0;
		try {
			result = my.insert("member.create", vo);
		}catch(Exception e) {
			System.out.println("에러발생.");
		}
		return result;
	}
	//로그인
	public MemberVO login(MemberVO vo) {
		return my.selectOne("member.login", vo);
	}
	
	public MemberVO  idCheck(MemberVO vo) {
		MemberVO  vo2  = my.selectOne("member.idCheck", vo);
		return vo2;
	}

}