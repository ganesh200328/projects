package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class loginservlet
 */

@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	Connection con;
	PrintWriter pw;
	String getdata="select * from user where email=?";
	PreparedStatement psmt;
	ResultSet result;
	public void init()throws ServletException
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","123456");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String name = null;
		try {
			psmt=con.prepareStatement(getdata);
			psmt.setString(1,email);
			while(result.next()) {
				String dbpass=result.getString("password");
				String dbemail=result.getString("email");
				if(password.equals(dbpass) && email.equals(dbemail)) 
				{
					name=result.getString("empname");
					HttpSession session=req.getSession();
					session.setAttribute("name",name);
					res.sendRedirect("display.jsp");
				}
			}			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}			
	}
}
