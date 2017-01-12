package com.amazon.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Controller2
 */
public class Controller2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String phone=		request.getParameter("phone");
		String contact=		request.getParameter("contact");
		String email=		request.getParameter("email");
		 HttpSession session=		request.getSession();
		 //HttpSession session;
			session.setAttribute("phone", phone);
			session.setAttribute("contact", contact);
				session.setAttribute("email", email);
		
				response.sendRedirect("/amazon/html/register3.jsp");
				//RequestDispatcher rd=request.getRequestDispatcher("/html/register3.html");
				//rd.forward(request, response);
			
		
		
		
	}

}
