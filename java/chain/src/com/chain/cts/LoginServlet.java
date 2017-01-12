package com.chain.cts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		if(request.getParameter("sub").equals("save")){
			String uname= request.getParameter("username");
			String pass=request.getParameter("password");
			if(uname.equals("admin")&&pass.equals("admin")){
			HttpSession session=	request.getSession();
			session.setAttribute("user", uname);
				//success
			request.getRequestDispatcher("/hhtml/success.jsp").forward(request, response);
			}else{
				request.getRequestDispatcher("/hhtml/error.html").forward(request, response);
				
			}
			
			
		}
		
	}

}
