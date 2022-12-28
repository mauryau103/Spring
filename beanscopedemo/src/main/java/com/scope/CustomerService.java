package com.scope;

import org.springframework.context.annotation.Scope;


public class CustomerService {
	
	

	public CustomerService() {
		System.out.println("constructor of customer service");
		// TODO Auto-generated constructor stub
	}

	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
