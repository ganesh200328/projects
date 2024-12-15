package jdBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class dbcon {
	public static String url="jdbc:mysql://localhost:3306/";
	public static String username="root";
	public String password="123456";
	
	
	public static void Connection() {
		dbcon c=new dbcon();
		System.out.println(url);
		try {
			Connection con=DriverManager.getConnection(url,username,c.password);
			Statement stmt=con.createStatement();
			String q="Create Database Db02";
			stmt.executeUpdate(q);
			System.out.println("Db Created");
			con.close();
			
		}
			catch(SQLException e) {
				e.printStackTrace();
			}
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Begin");
		Connection();
	}

}
