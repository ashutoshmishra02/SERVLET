package com.servletsPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HttpServ extends HttpServlet{
      public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
    	  System.out.println("This is get method.......");
    	  
    	  res.setContentType("text/html");
    	  PrintWriter out=res.getWriter();
    	  out.println("<h1> This is servlet from Http Servlet</h1>");
    	  out.println(new Date().toLocaleString());
      }

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
      
      
}
