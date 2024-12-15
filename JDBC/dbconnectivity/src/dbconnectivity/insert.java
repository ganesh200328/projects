package dbconnectivity;

import java.sql.*;

import java.util.Scanner;
import java.util.*;
public class insert {
	
	static String link="jdbc:mysql://localhost:3306/dummy";
	static String username="root";
	static String password="123456";
	static String q1="Insert into student values(?,?,?)";
	static String del="Delete from student where student_name=?";
	static String q="Select * from student";
	static String update="Update student set mark=? where student_name=?";

	public static void main(String[] args) {
		try {
		Connection con=DriverManager.getConnection(link,username,password);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  name:");
		String name=sc.next();
		System.out.println("Enter mark");
		int mark=sc.nextInt();
		System.out.println("Enter dept");
		sc.nextLine();
		String Dept=sc.nextLine();
		PreparedStatement psmt=con.prepareStatement(q1);
		psmt.setString(1,name);
		psmt.setInt(2,mark);
		psmt.setString(3,Dept);
		int rows=psmt.executeUpdate();
		System.out.println(rows+" "+"Inserted");
		
		
		
		
		
		
		
		
		
		
		
		Statement stmt=con.createStatement();
		
		ResultSet result=stmt.executeQuery(q);
		while(result.next()) {
			System.out.println(result.getString(1)+" "+result.getInt(2)+" "+result.getString(3));
		}
		
		
		
		
		
		
		
		
		

		
		System.out.println("Enter name to delete:");
		name=sc.nextLine();
		psmt=con.prepareStatement(del);
		psmt.setString(1,name);
		rows=psmt.executeUpdate();
		
		System.out.println(rows+" "+"deleted");
		
		
		
		
		System.out.println("After delete");
		System.out.println("------------------");
		
		
		
		result=stmt.executeQuery(q);
		while(result.next()) {
			System.out.println(result.getString(1)+" "+result.getInt(2)+" "+result.getString(3));
		}
		System.out.println("Enter a name to update mark");
	
		name=sc.nextLine();
		System.out.println("Enter mark to update");
		mark=sc.nextInt();
		psmt=con.prepareStatement(update);
		psmt.setInt(1,mark);
		psmt.setString(2, name);
		
		rows=psmt.executeUpdate();
		System.out.println(rows+" "+"Updated");
		
		
		System.out.println("updatedddddddd");
		result=stmt.executeQuery(q);
		while(result.next()) {
			System.out.println(result.getString(1)+" "+result.getInt(2)+" "+result.getString(3));
		}
		
		
		
		
		ResultSetMetaData rsmd=result.getMetaData();
		int count=rsmd.getColumnCount();
		
		for(int i=1;i<=count;i++) {
			//System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnType(i)+" "+rsmd.getColumnTypeName(i));
			System.out.printf("%-15s",rsmd.getColumnName(i));
		}
		System.out.println();
		result=stmt.executeQuery(q);
		while(result.next()){
			System.out.printf("%-15s %-13d %-15s%n",result.getString(1),result.getInt(2),result.getString(3));
		}
		System.out.println();
		}
		
		
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
