package com.daoimpl;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.userdao;
import com.model.user;

public class userdaoimpl implements userdao{
	static Connection con;
	static String insertuser="insert into user(empname,password,email,address,role) values(?,?,?,?,?)";
	static PreparedStatement psmt;
	static Statement stmt;
	static ResultSet resultset;
	static ArrayList<user> userlist=new ArrayList<user>();
	static String getalluser="Select * from user";
	static
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","123456");
		}
		catch (Exception e) {
			e.printStackTrace();
		}				
	}

	@Override
	public int insertuser(user u) {
		try {
			psmt=con.prepareStatement(insertuser);
			psmt.setString(1,u.getEmpname());
			psmt.setString(2,u.getPassword());
			psmt.setString(3,u.getEmail());
			psmt.setString(4,u.getAddress());
			psmt.setString(5,u.getRole());
			int n=psmt.executeUpdate();
			return n;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<user> getalluser() {
		try {
			stmt=con.createStatement();
			resultset=stmt.executeQuery(getalluser);
			userlist=extractuser(resultset);
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		return userlist;
	}
	public static ArrayList<user> extractuser(ResultSet resultset){
		try {
			while(resultset.next()) {
				user u1=new user(resultset.getInt(1),resultset.getString(2),resultset.getString(3),resultset.getString(4),resultset.getString(5),resultset.getString(6));
				userlist.add(u1);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return userlist;
		
	}
	static String byid="Select * from user where empid=?";
	public ArrayList<user> getbyid(int id) {
		try {
			psmt=con.prepareStatement(byid);
			psmt.setInt(1, id);
			resultset=psmt.executeQuery();
			while(resultset.next()) {
				user u1=new user(resultset.getInt(1),resultset.getString(2),resultset.getString(3),resultset.getString(4),resultset.getString(5),resultset.getString(6));
				userlist.add(u1);
			}			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return userlist;
	}

	



	

		
}
