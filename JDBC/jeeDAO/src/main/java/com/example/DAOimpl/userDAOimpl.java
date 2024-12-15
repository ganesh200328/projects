package com.example.DAOimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.example.DAO.userDAO;
import com.example.model.usermodel;

public class userDAOimpl implements userDAO {
	static PreparedStatement psmt;
	static Connection con;
	static String insert="insert into user(empname,password,email,address,role) values(?,?,?,?,?)";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","123456");
		    
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public int insertuser(usermodel u) {
		try {
		psmt=con.prepareStatement(insert);
		psmt.setString(1,u.getEmpname());
		psmt.setString(2,u.getPassword());
		psmt.setString(3,u.getEmail());
		psmt.setString(4,u.getAddress());
		psmt.setString(5,u.getRole());
		int i=psmt.executeUpdate();
		return i;
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return 0;
	}


	



	
	

}
