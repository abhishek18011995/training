package com.amazon.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterServlet3
 */
public class RegisterServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out= response.getWriter();
			
		//String name=		request.getParameter("username");
		//String password=		request.getParameter("password");
		//String phone=		request.getParameter("phone");
		//String contact=		request.getParameter("contact");
	//String email=		request.getParameter("email");
	response.setContentType("text/html");
		 String address=		request.getParameter("address");
			String country=		request.getParameter("country");
			
		HttpSession session=request.getSession(true);
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
		RequestDispatcher rd=request.getRequestDispatcher("/html/welcome.html");
		rd.include(request, response);
		
		
		
		
			
			
try{			 
Cookie[] arr=	request.getCookies();
for (Cookie cookie : arr) {
	out.println(cookie.getName()+": "+cookie.getValue());
	
}
}catch(NullPointerException npe){
	System.out.println("respective cookies are not saved in browser");
	
}
out.print(address);
out.println(country);
	 
		
		
		 
		 
		
		 
		
		
		
	}

}
