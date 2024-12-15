package com.jdbcjee;

import jakarta.servlet.ServletException;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;




@WebServlet("/insertemployee")
public class insertemployee extends HttpServlet {
	/**
	 * 
	 */
	String insert="insert into employeedetails(empid,empname,desg,salary) values(?,?,?,?)";
	PrintWriter pw;
	Connection conn;
	PreparedStatement psmt;
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy","root","123456");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException{
		
		int empid=Integer.parseInt(request.getParameter("empid"));
		String empname=request.getParameter("empname");
		String desg=request.getParameter("desg");
		int salary=Integer.parseInt(request.getParameter("salary"));
		try 
		{
			pw=response.getWriter();
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy","root","123456");
			psmt=conn.prepareStatement(insert);
			psmt.setInt(1,empid);
			psmt.setString(2,empname);
			psmt.setString(3, desg);
			psmt.setInt(4, salary);
			int r=psmt.executeUpdate();
			if (r==0)
			{
				response.sendRedirect("failure.html");
				
			}
			else {
				response.sendRedirect("sucess.html");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
