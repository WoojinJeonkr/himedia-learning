package web.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.dao.MemberDAO;
import web.vo.MemberVO;

/**
 * @author hi
 * 
 * 등록된 회원정보를 가져오는 Action
 */
@WebServlet("/memberView")
public class MemberViewServlet extends HttpServlet {

	private static final long serialVersionUID = -1563364481316004508L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		
		if(session.getAttribute("user_id") == null) {
			response.sendRedirect("login.html");
		} else {
			int m_idx = Integer.parseInt(request.getParameter("m_idx"));
			//--- Member라고 하는 정보를 이용하는 오브젝트(객체)
			//--- Member Data Access Object
			MemberDAO memberDAO = new MemberDAO();
			MemberVO memberVO = memberDAO.member_view(m_idx);
			
			request.setAttribute("member_view", memberVO);
			RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/jsp/memberView.jsp");
			dispatch.forward(request, response);
		}
	}

}
