package com.cognizant.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class DemoServletInterface
 */
public class DemoServletInterface  implements Servlet {

    /**
     * Default constructor. 
     */
	ServletRequest req;
	ServletResponse res;
	ServletConfig config=null;
	
    public DemoServletInterface() {
        // TODO Auto-generated constructor stub
    
    System.out.println("Object created for servlet");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	
	System.out.println("Initialization is done");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		
		System.out.println("Destroying the servlet");
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("from config");
		return null ;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("From servlet Info");
		return "DemoInterface"; 
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=response.getWriter();
	out.print("From Service");
	System.out.println("Service");
	
	}

}
