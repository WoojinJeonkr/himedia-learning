package web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.dao.MemberDAO;
import web.vo.MemberVO;

@WebServlet("/memberUpdate")
public class MemberUpdateServlet extends HttpServlet {

	private static final long serialVersionUID = 8894706962199553061L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		MemberDAO memberDAO = new MemberDAO();
		
		//--- Parameter 넘어온 회원가입 정보를 MemberVO 클래스에 저장
		MemberVO memberVO = new MemberVO();
		memberVO.setM_idx(Integer.parseInt(request.getParameter("m_idx")));
		memberVO.setM_pw(request.getParameter("m_pw"));
		memberVO.setM_name(request.getParameter("m_name"));
		memberVO.setM_email(request.getParameter("m_email"));
		memberVO.setM_phone(request.getParameter("m_phone"));
		
		//--- 회원가입 정보를 DB에 저장
		memberDAO.member_update(memberVO);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<script>");
		out.println("alert('"+memberVO.getM_name()+"님의 회원정보가 수정되었습니다.')");
		out.println("location= '"+request.getContextPath()+"/memberView?m_idx="+request.getParameter("m_idx")+"';");
		out.println("</script>");
	}
}
