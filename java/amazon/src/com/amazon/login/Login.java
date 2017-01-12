package com.amazon.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=		request.getParameter("username");
		String password=	request.getParameter("password");
				if(name.equals("admin")&&password.equals("admin"))
				{	
		    HttpSession session=		request.getSession(true);
				session.setAttribute("username", name);
				session.setAttribute("password", password);
				System.out.println(session);
				RequestDispatcher rd=request.getRequestDispatcher("/html/welcome.html");
				rd.forward(request, response);
			
				}else{
						
					PrintWriter out=response.getWriter();
					response.setContentType("text/html");
					out.print("<div class='well well-lg'> Look, I'm in a large well!</div>");
					out.print("Error while validatiing your credentials");
					
					
					RequestDispatcher rd=request.getRequestDispatcher("/html/login123.html");
				rd.include(request, response);
				}
				
			
		
	}

}
