package dbconnectivity;


import java.sql.*;
import java.util.Scanner;
public class create_table {
	static Connection con;
	static Statement stmt;
	static PreparedStatement psmt;
	static ResultSet result;
	static ResultSetMetaData rsmd;
	
	
	
	static String url="jdbc:mysql://localhost:3306/dummy";
	static String username="root";
	static String password="123456";
	
	
	static String create_table="Create table bank(id int,acc_no int,name varchar(100),balance double)";
	static String insert="insert into bank values(?,?,?,?)";
	static String getalluser="Select * from bank";
	static int ogpin=123456;

	
	public static void table() {
		try {
			   con=DriverManager.getConnection(url,username,password);
			   stmt=con.createStatement();
			   stmt.executeUpdate(create_table);
			   System.out.println("Created");
			   
			   
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	public static void insertinfo(int id,int acc_no,String name,double balance) {
		try {
			   con=DriverManager.getConnection(url,username,password);
			   psmt=con.prepareStatement(insert);
			   psmt.setInt(1, id);
			   psmt.setInt(2, acc_no);
			   psmt.setString(3, name);
			   psmt.setDouble(4, balance);
			   psmt.executeUpdate();
			   
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	public static void display() {
		try {
			con=DriverManager.getConnection(url,username,password);
			stmt=con.createStatement();
			result=stmt.executeQuery(getalluser);
			rsmd=result.getMetaData();
			int count=rsmd.getColumnCount();
			for(int i=1;i<=count;i++) {
				System.out.printf("%-15s",rsmd.getColumnName(i));
			}
			System.out.println();
			while(result.next()) {
				System.out.printf("%-15d %-15d %-15s %-15f%n",result.getInt(1),result.getInt(2),result.getString(3),result.getDouble(4));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void transfer(int sacc,double amount) {
		try {
			Scanner sc=new Scanner(System.in);
			

			con=DriverManager.getConnection(url,username,password);
			con.setAutoCommit(false);
			String sendtrans="Update bank set balance=balance-? where acc_no=?";
			String rectrans="Update bank set balance=balance+? where acc_no=?";
			psmt=con.prepareStatement(sendtrans);
			
			psmt.setDouble(1,amount);
			psmt.setInt(2, sacc);
			int sent=psmt.executeUpdate();
			System.out.println(sent+"Sent");
			
			
			
			

			System.out.println("enter account no of Receiver");
			int racc=sc.nextInt();
			psmt=con.prepareStatement(rectrans);
			psmt.setDouble(1,amount);
			psmt.setInt(2, racc);
			int received=psmt.executeUpdate();
			System.out.println(received+"Received");
			System.out.println("Enter pin");
			int pin=sc.nextInt();
			create_table c=new create_table();
			c.authenticate(pin,con);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void authenticate(int pin,Connection con) {
		if(pin==ogpin) {
			try {
			con.commit();
			System.out.println("Successfull");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Wrong pin Unsuccessfull");
			try {
				con.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scint=new Scanner(System.in);
		Scanner scstr=new Scanner(System.in);
		
		int anotherT=0;
		while(anotherT==0) {
			System.out.println("Enter choice 1 create 2 insert 3 display");
			int choice=scint.nextInt();
		switch(choice){
		case 1:
				table();
				System.out.println("Enter 1 to stop 0 to again step");
				anotherT=scint.nextInt();
				break;
		case 2:
			int stop=0;
			while(stop==0) {
			System.out.println("Enter id:");
			int id=scint.nextInt();
			System.out.println("Enter account no:");
			int acc_no=scint.nextInt();
			System.out.println("Enter a name:");
			String name=scstr.nextLine();
			System.out.println("Enter a Balance:");
			double balance=scint.nextDouble();
			insertinfo(id,acc_no,name,balance);
			System.out.println("Enter 1 to stop 0 to again step");
			stop=scint.nextInt();
			}
			System.out.println("Enter 1 to stop 0 to again step");
			anotherT=scint.nextInt();
			break;
		
		case 3:
			display();
			System.out.println("Enter 1 to stop 0 to again step");
			anotherT=scint.nextInt();
			break;
		case 4:
			System.out.println("enter account no of sender");
			int sender_accno=scint.nextInt();
			System.out.println("enter amount to transfer");
			double amount=scint.nextDouble();
			
			transfer(sender_accno,amount);
			System.out.println("Enter 1 to stop 0 to again step");
			anotherT=scint.nextInt();
			break;
		}
		}

	}

}
