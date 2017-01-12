package com.cognizant.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		
     String name=   request.getParameter("username");
     String pwd=request.getParameter("password");

	String sub=request.getParameter("subjects");
		
	String[] mobiles=	request.getParameterValues("mobiles");
		
	String gender=request.getParameter("gender");	
	String country1=	request.getParameter("india");
	String country2=	request.getParameter("china");
	String country3=	request.getParameter("bangladesh");
	PrintWriter out=response.getWriter();
	if(request.getParameter("sub").equals("SaveData")){
	if(pwd==null ||pwd.isEmpty()){

		response.sendRedirect("/ymail/errorser?err=password");
		
	}else{
		
	}
	
	if(name==null ||name.isEmpty()){

		response.sendRedirect("/ymail/errorser?err=name");
		
	}
	}
	else{
	out.println(name+"<br>");
	
	out.println(name);
	out.println(pwd+"<br>");
	out.println(sub+"<br>");
	out.println("<br> The Mobiles you have select ed");
	for(String c:mobiles){
		out.println(c+"<br>");
		
		
	}
	
	
	out.println(gender+"<br>");
	out.println(country1+"<br>");
	out.println(country2+"<br>");
	out.println(country3+"<br>");
	
	
	
	//dao
	//dao.getClass()
	//process
	
	}
	}

}
