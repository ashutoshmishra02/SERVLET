package com.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		
		//getting all the incoming details from the request..
		
				String name=request.getParameter("user_name");
				String password=request.getParameter("user_password");
				String email=request.getParameter("user_email");
				
				out.println(name);
				out.println(password);
				out.println(email);
				
				// creating connection using JDBC...
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/youtube";
		            String username="root";
		            String password1="Chiku@02";
					Connection con=DriverManager.getConnection(url,username,password1);
					
					
					String q="insert into user1(name,password,email) values(?,?,?)";
					
					PreparedStatement pstmt=con.prepareStatement(q);
					pstmt.setString(1, name);
					pstmt.setString(2, password);
					pstmt.setString(3, email);
					
					pstmt.executeUpdate();
					
					out.println("done....");
				}
				catch(Exception e) {
					e.printStackTrace();
					
					out.println("error.....");
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
