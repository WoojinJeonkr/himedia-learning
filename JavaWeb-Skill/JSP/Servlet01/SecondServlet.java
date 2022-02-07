package project01;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	
	// 자바 객체 직렬화 식별자
	private static final long serialVersionUID = 844969363907474930L;

	public void init() throws ServletException{
		LocalDateTime now = LocalDateTime.now();
		System.out.println("("+now+") init 메서드 호출");
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		LocalDateTime now = LocalDateTime.now();
		System.out.println("("+now+") doGet 메서드 호출");
	}
	
	public void destroy() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("("+now+") destroy 메서드 호출");
	}
}
