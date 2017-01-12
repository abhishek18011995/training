package com.amazon.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterSevlet
 */
public class RegisterSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
String name=		request.getParameter("username");
String password=		request.getParameter("password");
		
	//	Cookie c1=new Cookie("username", name);
	//	Cookie c2=new Cookie("password", password);
		//response.addCookie(c1);
		//response.addCookie(c2);
		
    HttpSession session=		request.getSession(true);
		session.setAttribute("username", name);
		session.setAttribute("password", password);
		System.out.println(session);
		
		//session.invalidate();
		
		
	PrintWriter out=	response.getWriter();
		response.setContentType("text/html");
		out.print("<form  method='post' action='/amazon/reg2'>");
		//out.print("<input type='hidden' name='username' value="+name +" />");
		//out.print("<input type='hidden' name='password' value="+password +" />" );
		out.print("Enter contact<input type='text' name='contact' />");
		out.print("Enter phone<input type='text' name='phone' />");
		out.print("Enter email<input type='text' name='email' />");
		out.print("<input type='submit' value='save'>");
		out.print("</form>");

		
		
		
		
		
		
	}

}
