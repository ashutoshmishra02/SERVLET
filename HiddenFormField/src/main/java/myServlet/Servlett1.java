package myServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlett1
 */
public class Servlett1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlett1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("user_name");
		 
		out.println("<h1> Your name is : " +name+ "</h1>");
		 
		//delete url rewriting from here
	   // out.println("<a href='servlett2?user="+name+"'>Go to second servlet</a>");
		
		//hidden form filled coding
		
		out.println(""
				+ "<form action='servlett2' >"
				+ "<input type='hidden' name='user_name' value='"+name+"' />"
				+ "<button>Go to second servlet</button>"
				+ ""
				+ ""
				+ "</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
