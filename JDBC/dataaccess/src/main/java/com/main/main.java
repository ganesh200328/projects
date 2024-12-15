package com.main;
import com.model.user;
import java.util.ArrayList;
import java.util.Scanner;

import com.dao.userdao;

import com.daoimpl.userdaoimpl;
import com.model.user;
public class main {
	public static void main(String[] args) {
		userdao a =new userdaoimpl();
//		
		ArrayList<user> g=new ArrayList<user>();
		System.out.println("");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice){
			case 1:
				user u=new user("Kumar","kumar","kumar@gmail.com","chennai","OFFICER");
				int row=a.insertuser(u);
				System.out.println(row);
				break;
			case 2:
				g=a.getalluser();
				//user a1=new user();				
				for(user user:g) 
				{
					
					System.out.println(user);
					
				}
				System.out.println(g.get(1));
				
				break;
			case 3:
				g=a.getbyid(1);
				for(user user:g) 
				{
					
					System.out.println(user);
					
				}
				break;
				
			
		}
		
	}   

 }
