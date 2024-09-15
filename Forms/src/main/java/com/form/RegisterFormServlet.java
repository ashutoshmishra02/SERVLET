package com.form;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class RegisterFormServlet extends HttpServlet {
	
	
	// As form is submitting from - post method (in html) so we write doPost method
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h2>Welcome to Register Servlet </h2>");
		
		//To list out all the data in browser (fetching data with the help of request object) or to list out all the data after clicking Register
		String name=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		String email=req.getParameter("user_mail");
		String gender=req.getParameter("user_gender");
		String course=req.getParameter("user_course");
		
		String cond=req.getParameter("condition");
		
		//out.println(cond);
		if(cond!=null) {
			if(cond.equals("checked")) {
				out.println("<h2> Name: " +name+" </h2>");	
				out.println("<h2> Password: " +password+" </h2>");
				out.println("<h2> Email: " +email+" </h2>");
				out.println("<h2> Gender: " +gender+" </h2>");
				out.println("<h2> Course: " +course+ " </h2>");
				
				//we can also put data with the help of JDBC
				
				
				RequestDispatcher rd= req.getRequestDispatcher("success");
				rd.forward(req, resp);
			}
		}	
		else {
			out.println("<h2> You have not accepted terms and conditions </h2>");
			
			// I want to include output of File.html
			
			// Get the object of request dispatcher
			
			RequestDispatcher rd=req.getRequestDispatcher("File.html");
			 
		     // Include method
			rd.include(req, resp);
			
		}
	}
   
	
}
