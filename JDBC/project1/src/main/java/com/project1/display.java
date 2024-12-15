package com.project1;

import java.io.PrintWriter;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class display extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException{
		try {
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("username");
		pw.println("<html><body><center>");
		pw.println("<h1 style='color:brown'>From display"+" "+name+"</h1>");
		pw.println("</center></body></center>");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
