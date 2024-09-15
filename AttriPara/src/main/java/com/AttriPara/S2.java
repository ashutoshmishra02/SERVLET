package com.AttriPara;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class S2
 */
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S2() {
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
	    
	    int nn1=Integer.parseInt(request.getParameter("n1"));
	    int nn2=Integer.parseInt(request.getParameter("n2"));
	    
	    int p=nn1*nn2;
	    
	    // get attribute from request object....
	    
	    int sum=(int)request.getAttribute("sum");
	    
	   
	    out.println(" <h1>sum is = " +sum+"</h1>");
	    out.println(" <h1>product is = " +p+ "</h1>");
	    
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
