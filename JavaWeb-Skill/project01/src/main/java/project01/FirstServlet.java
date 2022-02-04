package project01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 Servlet
 동적인 웹페이지를 만들 때 사용하는 자바 기반의 웹 프로그래밍
 유저 입장에서 웹은 아래 2가지로 나뉜다.
 1) request
 2) response
 */
public class FirstServlet extends HttpServlet {
	
	public void init() throws ServletException{
		System.out.println("init 메서드 호출");
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		System.out.println("doGet 메서드 호출");
	}
	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
}
