package com.amazon.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChangeServlet
 */
public class ChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     String un= request.getParameter("username");
     String pa= request.getParameter("password");
      
     if(un.equals("admin")&&pa.equals("admin123")){
    	 
    	 request.getRequestDispatcher("success?username="+un).
    	 forward(request, response);
    	 
     }else{
    	 response.sendRedirect("/amazon/success?username=user");
    	 
    	 
     }
      
		
		
		
		
	}

}
