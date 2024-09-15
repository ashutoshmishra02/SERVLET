package com.sessionTrac;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class servlet2
 */
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet2() {
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
		ServletContext context=getServletContext();
		
		//getting all the cookies
		
		Cookie[] cookies=request.getCookies();
		boolean temp=false;
		String name="";
		if(cookies==null) {
			out.println("<h1> You are new user go to home page and submit your name ");
			return;
		}
		else {
			for(Cookie c:cookies) {
				String tname=c.getName();
				if(tname.equals("user_name")) {
					temp=true;
					name=c.getValue();
				}
			}
		}
		if(temp) {
			out.println("<h1> Hello , " + name + " welcome back to my website </h1>");
			out.println("<h1> Thankyou </h1>");
		}
		else {
			out.println("<h1> You are new user go to home page and submit your name ");
		}
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
