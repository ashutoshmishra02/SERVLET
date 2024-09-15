package com.servletsPack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class GenServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("This is servlet using generic servlet");
	    res.setContentType("text/html");
	    PrintWriter writer=res.getWriter();
	    writer.println("<h1> This is second servlet using generic Servlet</h1>");	
	}
      
}
