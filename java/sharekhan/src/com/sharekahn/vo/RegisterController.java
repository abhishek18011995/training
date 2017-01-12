package com.sharekahn.vo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterController
 */
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	out.print("this servlet wont support get request please execute post");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
	String uname=	request.getParameter("username");
	String fname=	request.getParameter("firstname");
	String lname=	request.getParameter("lastname");
	String fullname=fname+" "+lname;
		
	String email=	request.getParameter("email");
	String address=	request.getParameter("address");
	
		Registration register=new Registration();
		register.setUsername(uname);
		register.setFullname(fname);
		register.setEmail(email);
		register.setAddress(address);
		DAO dao=new DAO();
		int flag=0;
		try {
			flag=dao.saveUserDetails(register);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found"+e.getMessage());
			out.print("Internal problem in server contact to Admin");
		} catch (SQLException e) {
          System.out.println("error wtih "+e.getMessage());
			
			out.print("Internal problem in server contact to Admin");

		}finally{
			
			try {
				dao.conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				 System.out.println("error wtih "+e.getMessage());
					
			out.print("Internal problem in server contact to Admin");

			}
			
			if(flag==0){
				out.print("Error while storing the data");
			}else{
				response.setContentType("text/html");
				out.println("Data stored successfully<br/>");
				out.println("Username"+uname+"<br/>");
				out.println("Password: *************<br/>");
			ServletConfig config=	this.getServletConfig();
			String driver=	config.getInitParameter("driver");
			String phone=	config.getInitParameter("phone");
	 ServletContext application=		this.getServletContext();
		String url=	application.getInitParameter("url");
		String pass=	application.getInitParameter("password");
		out.println("URL"+url+"<br/>");
		out.println("pass"+pass+"<br/>");
		
		
		
		application.setAttribute("cognizantsupport", "GSD@cofnizant.com");
		
		
	String emailsup=(String)	application.getAttribute("cognizantsupport");
	out.println("For any support Support "+emailsup+"<br/>");
	application.removeAttribute("cognizantsupport");
	
	
			out.println("SDriver"+driver+"<br/>");
			out.println("Customer care 24/7"+phone+"<br/>");
			
				
				request.getRequestDispatcher("/jsps/welcome.jsp").include(request, response);
				
				
				
			}
			
			
		}
		
		
		
		
		
	}

}
