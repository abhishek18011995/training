package com.amazon.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Controller3
 */
public class Controller3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		 String address=		request.getParameter("address");
			String country=		request.getParameter("country");
			 PrintWriter out= response.getWriter();
				
		HttpSession session=request.getSession();
		String username=(String)	session.getAttribute("username");
		String password=(String)	session.getAttribute("password");
		String email=(String)	session.getAttribute("email");
		String phone=(String)	session.getAttribute("phone");
		String contact=(String)	session.getAttribute("contact");
		System.out.println(session);
		out.println(username);
		out.println(password);
		out.println(email);
		out.println(phone);
		out.println(contact);
		
		out.println(address);
		out.println(country);
		
	}

}
