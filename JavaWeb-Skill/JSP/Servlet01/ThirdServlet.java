package project01;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet{
	// 자바 객체 직렬화 함수
	private static final long serialVersionUID = 5366607762573709312L;
	
//	public void init() throws ServletException{
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println("("+now+") init 메서드 호출");
//	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		doHandler(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		doHandler(req, resp);
	}
	
	private void doHandler(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		LocalDateTime now = LocalDateTime.now();
		System.out.println("("+now+") doHandle 메서드 호출");
	}
	
//	public void destroy() {
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println("("+now+") destroy 메서드 호출");
//	}
}
