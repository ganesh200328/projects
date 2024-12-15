package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




public class demo extends HttpServlet {
	PrintWriter pw;
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException
	{
		String email=req.getParameter("email");
		pw.println("HElloooo..."+ email );		
	}
}

