package com.sharekhan.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sharekahn.vo.DAO;
import com.sharekahn.vo.LoginDetails;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get writer print on the web page
		PrintWriter out= response.getWriter();
		//set thte content of server to client
		response.setContentType("text/html");
		//check whether submit button is clicked or not
		LoginDetails login=null;
		if(request.getParameter("submitbtn").equals("LOGIN")){
			//get all values from the form
		String name=	request.getParameter("username");
		String pass=	request.getParameter("password");
		//set the values to  set/get class
		login=new LoginDetails();
		login.setUsername(name);
		login.setPassword(pass);
		
		System.out.println("demo servlet");
		//create object to dao class 
		DAO dao=new DAO();
		int flag=0;;
		try {
			//validate the login object from the DB
			flag = dao.validateLogin(login);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver not found"+e.getMessage());
			out.print("Internal problem in server contact to Admin");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error wtih "+e.getMessage());
			
			out.print("Internal problem in server contact to Admin");

		}finally{
			
			try {//close the connection
				dao.conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				 System.out.println("error wtih "+e.getMessage());
					
					out.print("Internal problem in server contact to Admin");
			}
			}
		
		if(flag==1){
			
		HttpSession session=	request.getSession();
		session.setAttribute("loginObject", login);	
		System.out.println(session);
			//forward control to welcome.jsp
	RequestDispatcher rd=		request.getRequestDispatcher("/jsps/welcome.jsp");
	rd.forward(request, response);	
		//	request.getRequestDispatcher("/jsps/welcome.jsp").forward(request, response);	
	
		}else{
			//include response of current page and twitter.html
			out.print("Please provide Correct credential");
			request.getRequestDispatcher("/html/twitter.html").include(request, response);	
			
			
		}
		
		//out.println("<b>Hi i am demo servlet program</b>");
		//out.println(name);
		//out.println(pass);
		//System.out.println("Server output here");

		
		}else{
			
			//out.print("please press LOGIN button ");
			
		}
		
	}

}
