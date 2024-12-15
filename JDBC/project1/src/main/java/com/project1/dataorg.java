package com.project1;

import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class dataorg extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException{
		try {
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("username");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		pw.println("<html><body><center>");
		pw.println("<h1 style='color:Lightblue'"+ " >hi"+" "+name+"</h1>");
		pw.println("</center></body></html>");
		//res.sendRedirect("display"); //best for html files
		
		// only dispatch parameter by getting in this servlet from html to diplay servlet """forward(req,res)"""
		//RequestDispatcher rd=req.getRequestDispatcher("display");
		//rd.forward(req, res);
		
		req.getRequestDispatcher("display").include(req, res);//it runs this servlet after dispatch the parameter request got from html to display """"include(req,res) """
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
