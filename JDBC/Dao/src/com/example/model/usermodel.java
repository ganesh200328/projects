package com.example.model;

public class usermodel {
	
	private int userid;
	private String username;
	private String emailid;
	private long mobileno;
	private String department;
	
	
	usermodel(int userid,String username,String emailid,long mobileno,String department){
		this.userid=userid;
		this.username=username;
		this.emailid=emailid;
		this.mobileno=mobileno;
		this.department=department;
	}
	
	usermodel(String username,String emailid,long mobileno,String department){
		this.username=username;
		this.emailid=emailid;
		this.mobileno=mobileno;
		this.department=department;
	}
	
	
	usermodel(){
		
	}
	
	public int getuserid() {
		return userid;
	}
	public void setuserid(int userid) {
		this.userid=userid;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String username){
		this.username=username;
	}
	public String getemailid() {
		return emailid;
	}
	public void setemailid(String emailid){
		this.emailid=emailid;
	}
	
	public long getmobileno() {
		return mobileno;
	}
	public void setmobileno(long mobileno){
		this.mobileno=mobileno;
	}
	public String getdepartment() {
		return department;
	}
	public void setdepartment(String department){
		this.department=department;
	}
	
	
	
	
	public String toString() {
		return userid+" "+username+" "+emailid+" "+mobileno+" "+department;
		
	}
	

}
