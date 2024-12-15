package dbconnectivity;


import java.sql.*;
import java.util.*;
public class addbatch {
	static Connection con;
	static Statement stmt;
	static PreparedStatement psmt;
	static ResultSet result;
	static ResultSetMetaData rsmd;
	
	
	static String username="root";
	static String password="123456";
	static String url="jdbc:mysql://localhost:3306/dummy";
	
	
	static String insert="insert into student values(?,?,?)";
	static String getalluser="Select * from student";
	public static void main(String[] args) {
		try {
		con=DriverManager.getConnection(url,username,password);
		Scanner scint=new Scanner(System.in);
		Scanner scstr=new Scanner(System.in);
		System.out.println("Enter how many data u want to store at a time");
		int batchcount=scint.nextInt();
		psmt=con.prepareStatement(insert);
		int rows=0;
		while(true) {
		for(int i=1;i<=batchcount;i++) {
			System.out.println("Enter a name:");
			
			String name=scstr.nextLine();
			System.out.println("Enter a mark:");
			int mark=scint.nextInt();
			System.out.println("Enter a dept:");
			//sc.nextLine();
			String dept=scstr.nextLine();
			psmt.setString(1, name);
			psmt.setInt(2, mark);
			psmt.setString(3, dept);
			psmt.addBatch();
			System.out.println(i+" data added");
			rows++;
		}
		break;
		}
		psmt.executeBatch();
		System.out.println(rows+" rows affected");
		
		
		
		
		stmt=con.createStatement();
		result=stmt.executeQuery(getalluser);
		
		rsmd=result.getMetaData();
		int colcount=rsmd.getColumnCount();
		
		for(int i=1;i<=colcount;i++) {
			System.out.printf("%-15s",rsmd.getColumnName(i));
		}
		System.out.println();
		
		while(result.next()) {
			System.out.printf("%-15s %-15d %-15s%n",result.getString(1),result.getInt(2),result.getString(3));
		}
		System.out.println();
		
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
