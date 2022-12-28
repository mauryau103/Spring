package com.bean.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.entity.User;

public class UserService {
	
	private static List<User> list = new ArrayList<User>();

	static {
		User u = new User("User 1");
		list.add(u);
		
		u = new User("User 2");
		list.add(u);
		
		u = new User("User 3");
		list.add(u);
	}
	
	public List<User> getList(){
		return list;
	}
}
