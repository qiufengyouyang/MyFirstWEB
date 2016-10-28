package com.fang.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
/**
 * @author zhangning
 * 2016年7月29日
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		
		if (username != null && !"".equals(username)) {
			request.getSession().setAttribute(
					getServletContext().getInitParameter("sessionKey"), 
					username);
						request.getRequestDispatcher("/susscess.jsp").forward(request, response);
		}else{
			response.sendRedirect(request.getServletPath() +"/login.jsp");
		}
	}

}
