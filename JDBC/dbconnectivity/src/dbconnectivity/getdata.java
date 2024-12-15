package dbconnectivity;


import java.sql.*;


public class getdata {
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/dummy","root","123456");
			Statement stmt=con.createStatement();
			String q="Select * from student";
			ResultSet result=stmt.executeQuery(q);
			while(result.next()) {
				System.out.println(result.getString(1)+" "+result.getInt(2)+" "+result.getString(3));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
