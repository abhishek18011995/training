package com.amazon.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;

/**
 * Servlet implementation class Controller1
 */
public class Controller1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=		request.getParameter("username");
		String password=		request.getParameter("password");
				
		  HttpSession session=		request.getSession(true);
			session.setAttribute("username", name);
			session.setAttribute("password", password);
			System.out.println(session);
			response.sendRedirect("/amazon/html/register2.jsp");
		//	RequestDispatcher rd=request.getRequestDispatcher("/html/register2.html");
			//rd.forward(request, response);
		
		
		

		
		
		
	}

}
