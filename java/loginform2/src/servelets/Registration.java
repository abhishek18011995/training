package servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		String sub=request.getParameter("subjects");
		String[] mob=request.getParameterValues("mobiles");
		String gen=request.getParameter("gender");
		String country1=request.getParameter("india");
		String country2=request.getParameter("china");
		String country3=request.getParameter("bangladesh");
		
		PrintWriter out=response.getWriter();
		
		out.println(name);
		out.println(password);
		out.println(sub);
		for(String c:mob){
			out.println(mob);
		}
		
		out.println(gen);
		out.println(country1);
		out.println(country2);
		out.println(country3);
	
		
	}

}
