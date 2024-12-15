package com.dao;

import java.util.ArrayList;
import java.util.*;

import com.model.user;


public interface userdao {
	int insertuser(user u);
	ArrayList<user> getalluser();
	ArrayList<user> getbyid(int id);
	
	
	
	
}
