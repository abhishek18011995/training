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
 * Servlet implementation class registerServlet2
 */
public class registerServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//String name=		request.getParameter("username");
		//String password=		request.getParameter("password");
		String phone=		request.getParameter("phone");
		String contact=		request.getParameter("contact");
		String email=		request.getParameter("email");
		
	//	Cookie c3=new Cookie("phone", phone);
	//	Cookie c4=new Cookie("contact", contact);
		//Cookie c5=new Cookie("email", email);
		//response.addCookie(c3);
		//response.addCookie(c4);
		//response.addCookie(c5);
		 HttpSession session=		request.getSession(true);
		 //HttpSession session;
			session.setAttribute("phone", phone);
			session.setAttribute("contact", contact);
				session.setAttribute("email", email);
			
		System.out.println(session);
		
		
		
		
		 PrintWriter out= response.getWriter();
		 
		// out.print(name);
		// out.print(password);
		 out.print(phone);
		 out.print(contact);
		 out.print(email);
		 
		 response.setContentType("text/html");
			out.print("<form  method='post' action='/amazon/reg3'>");
			//out.print("<input type='hidden' name='username' value="+name +" />");
			//out.print("<input type='hidden' name='password' value="+password +" />" );
			//out.print("Enter contact<input type='hidden' name='contact' value="+contact +" />" );
			//out.print("Enter phone<input type='hidden' name='email' value="+email +" />" );
			//out.print("Enter phone<input type='hidden' name='phone' value="+phone +" />" );
			
			out.print("Enter country<input type='text' name='country' />");
			out.print("Enter address<input type='text' name='address' />");			
			out.print("<input type='submit' value='save'>");
			out.print("</form>");

		 
		 
		
		
		
	}

}
