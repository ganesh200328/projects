package com.example.model;

public class usermodel {
	private int empid;
	private String empname;
	private String password;
	private String email;
	private String address;
	private String role;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public usermodel(){
		super();
	}
	public usermodel(int empid,String empname,String password,String email,String address,String role){
		super();
		this.empid=empid;
		this.empname=empname;
		this.password=password;
		this.email=email;
		this.address=address;
		this.role=role;
	}
	public usermodel(String empname, String password, String email, String address, String role) {
		super();
		this.empname = empname;
		this.password = password;
		this.email = email;
		this.address = address;
		this.role = role;
	}
	@Override
	public String toString() {
		return "usermodel [empid=" + empid + ", empname=" + empname + ", password=" + password + ", email=" + email
				+ ", address=" + address + ", role=" + role + "]";
	}
	
	
	

}
