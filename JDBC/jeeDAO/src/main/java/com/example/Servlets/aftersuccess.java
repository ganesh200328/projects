package com.example.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class aftersuccess
 */
@WebServlet("/aftersuccess")
public class aftersuccess extends HttpServlet {
	PrintWriter pw;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    pw = response.getWriter();
	    pw.println("Welcome " + request.getParameter("email"));
	    HttpSession session = request.getSession();

	    int empid = (int) session.getAttribute("empid");

	    String empname = (String) session.getAttribute("empname");
	    String pwd = (String) session.getAttribute("pwd");
	    String dbemail = (String) session.getAttribute("dbemail");
	    String address = (String) session.getAttribute("address");
	    String role = (String) session.getAttribute("role");

	    System.out.println(empid + " " + empname + " " + pwd + " " + dbemail + " " + address + " " + role);
	    pw.println("Welcome " + empid + " " + empname + " " + pwd + " " + dbemail + " " + address + " " + role);
	}
}
