package com.example.firstapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class firstservlet extends HttpServlet{
	private PrintWriter pw;
	protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException{
		try {
			pw=resp.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("This is servletpage");
		try {
		resp.sendRedirect("index.html");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
