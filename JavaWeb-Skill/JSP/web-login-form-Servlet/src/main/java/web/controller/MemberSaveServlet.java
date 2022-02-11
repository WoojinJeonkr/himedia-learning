package web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.dao.MemberDAO;
import web.vo.MemberVO;

/**
 * @author hi
 * 
 * 회원가입 정보를 저장하는 Action
 */
@WebServlet("/memberSave")
public class MemberSaveServlet extends HttpServlet {

	private static final long serialVersionUID = -1760578662237200178L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		MemberDAO memberDAO = new MemberDAO();
		
		//--- Parameter 넘어온 회원가입 정보를 MemberVO 클래스에 저장
		MemberVO memberVO = new MemberVO();
		memberVO.setM_id((String)request.getParameter("m_id"));
		memberVO.setM_pw((String)request.getParameter("m_pw"));
		memberVO.setM_name((String)request.getParameter("m_name"));
		memberVO.setM_email((String)request.getParameter("m_email"));
		memberVO.setM_phone((String)request.getParameter("m_phone"));
		memberVO.setM_file((String)request.getParameter("m_file"));
		
		//--- 회원가입 정보를 DB에 저장
		memberDAO.member_save(memberVO);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<script>");
		out.println("alert('"+memberVO.getM_name()+"님이 회원가입되었습니다.')");
		out.println("location= '"+request.getContextPath()+"'");
		out.println("</script>");
	}

}
