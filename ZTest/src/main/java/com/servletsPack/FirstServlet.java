package com.servletsPack;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.*;

public class FirstServlet implements Servlet {
  //Life cycle method
	
	ServletConfig conf;
	public void init(ServletConfig conf) {
		this.conf=conf;
		System.out.println("creating object......");
	}
	
	public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException {
		System.out.println("Servicing.......");
		
		// printing in browser
		
		//set the content type of the response
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1> This is my output from servlet method</h1>");
		out.println("<h6> Todays date and time is "+new Date().toString()+" </h6>");
	}
	
	public void destroy() {
		System.out.println("going to destroy servlet method");
	}
	
	// non life cycle method
	
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	
	public String getServletInfo() {
		return "This servlet is created by Ashutosh Mishra";
	}
}
