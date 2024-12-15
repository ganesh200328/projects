package com.example.Servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/authenticateservlet")
public class authenticateservlet extends HttpServlet{
	
	Connection con;
	PreparedStatement psmt;
	ResultSet result;
	String get="Select * from user where email=?";
	@Override
	public void init() throws ServletException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","123456");
		psmt=con.prepareStatement(get);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	int empid;
	String empname,pwd,dbemail,address,role;
	RequestDispatcher rd;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		try {
		psmt.setString(1, email);
		result=psmt.executeQuery();
		
		if(result.next())
		{
			String dbpassword=result.getString("password");
			if(dbpassword.equals(password)) 
			{
				empid=result.getInt("empid");
				empname=result.getString("empname");
				pwd=result.getString("password");
				dbemail=result.getString("email");
				address=result.getString("address");
				role=result.getString("role");
				
				
				

				
				System.out.println(empid+" "+empname+" "+pwd+" "+dbemail+" "+" "+address+" "+role);
				
				HttpSession session=req.getSession();
				session.setAttribute("empid",empid);
				session.setAttribute("empname", empname);
				session.setAttribute("pwd", pwd);
				session.setAttribute("dbemail", dbemail);
				session.setAttribute("address", address);
				session.setAttribute("role",role);
				
				rd=req.getRequestDispatcher("aftersuccess");
				rd.forward(req, resp);
			
			}
			else 
			{
				resp.sendRedirect("Failure.html");
			}
				
		}
		else 
		{
			resp.sendRedirect("Login.html");
			
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	
	
	


