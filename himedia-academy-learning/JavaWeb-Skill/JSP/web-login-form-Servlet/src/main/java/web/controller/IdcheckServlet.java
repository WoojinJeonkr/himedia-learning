package web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.dao.MemberDAO;

@WebServlet("/idcheck")
public class IdcheckServlet extends HttpServlet {

	private static final long serialVersionUID = -5333124156716184810L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String check_id = request.getParameter("check_id");
		
		MemberDAO memberDAO = new MemberDAO();
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(memberDAO.check_id(check_id));
	}

}
