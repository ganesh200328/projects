package com.servlet;

import java.io.IOException;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.ResultSet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/changepwd")
public class changepwd extends HttpServlet {
	
	String change="update user set password=? where email=?";
	Connection con;
	PreparedStatement psmt;
	ResultSet result;
	String getalluser="select * from user where email=?";
//	String empname,empid,role;
	
	public void init() throws ServletException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","123456");
			psmt=con.prepareStatement(change);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		try {
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			String cpassword=req.getParameter("cp");
		
			if(password.equals(cpassword)) {
			
				psmt.setString(1, password);
				psmt.setString(2, email);
				int n=psmt.executeUpdate();
				
				
				
				if(n==0) {
					resp.sendRedirect("Failure.html");
				}
				else 
				{
					psmt=con.prepareStatement(getalluser);
					psmt.setString(1,email);
					result=psmt.executeQuery();
					while(result.next()) {
						String empname=result.getString("empname");
						String empid=result.getString("empid");
						String role=result.getString("role");
						
						
						
						Cookie nname=new Cookie("name",empname);
						Cookie iid=new Cookie("id",empid);
						Cookie ddesig=new Cookie("desig",role);
						
						
						
						nname.setMaxAge(60);
						iid.setMaxAge(80);
						ddesig.setMaxAge(100);
						
						
						resp.addCookie(nname);
						resp.addCookie(iid);
						resp.addCookie(ddesig);
						
						
						
						
					}
					
					resp.sendRedirect("success.html");
					
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
		
}
	
	


