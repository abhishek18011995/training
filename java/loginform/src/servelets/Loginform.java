package servelets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Loginform
 */
public class Loginform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginform() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("sub").equals("save")){
			
		
		String username=request.getParameter("name");
		String password=request.getParameter("password");
		if(username.equals("admin") && password.equals("admin123"))
		{
			HttpSession session=request.getSession();
			session.setAttribute("name", username);
			//session.setAttribute("password", password);
			
			System.out.println(session);
			//RequestDispatcher rd=request.getRequestDispatcher("/Welcome");
			request.getRequestDispatcher("/success.jsp").forward(request, response);
		
			
			
			
		}else{
request.getRequestDispatcher("/Error").forward(request, response);
		}
		}
			
			
		}
	}


