package project02;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/input")
public class inputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		System.out.println("아이디:"+user_id);
		System.out.println("패스워드:"+user_pw);
		String subject_str = request.getParameter("subject");
		System.out.println("선택한 과목 str:"+subject_str);
		
		String[] subject = request.getParameterValues("subject");
		// for문
		/*for(int i=0;i<subject.length;i++) {
			System.out.println("선택한 과목:"+subject[i]);
		}*/
		
		// 확장형 for문
		for(String str:subject) {
			System.out.println("선택한 과목:"+str);
		}
	}

}
