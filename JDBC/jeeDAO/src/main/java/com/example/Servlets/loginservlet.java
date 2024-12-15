package com.example.Servlets;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.example.DAO.*;
import com.example.DAOimpl.*;
import com.example.model.*;


@WebServlet("/login")
public class loginservlet extends HttpServlet {
	PrintWriter pw;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		pw=response.getWriter();
		String empname=request.getParameter("empname");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String role=request.getParameter("role");
		usermodel u=new usermodel(empname,password,email,address,role);
		userDAO u1=new userDAOimpl();
		int a=u1.insertuser(u);
		
		if(a==0) {
			response.sendRedirect("Failure.html");
		}
		else {
			response.sendRedirect("Success.html");
		}		
	}
}


