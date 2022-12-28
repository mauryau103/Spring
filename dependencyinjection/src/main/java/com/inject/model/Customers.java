package com.inject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//component annotation will give spring bean(spring object)
@Component
public class Customers {

	private int custid;
	private String custname;
	private String coursename;
	
	@Autowired
	private Technologies techdetail;
	
	
	//@Autowired
	public Customers(Technologies techdetail) {
		super();
		// TODO Auto-generated constructor stub --> constructor injection
		
		this.techdetail = techdetail;
		 
		
	}

	public Customers(int custid, String custname, String coursename) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.coursename = coursename;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	
	
	public Technologies getTechdetail() {
		return techdetail;
	}

	public void setTechdetail(Technologies techdetail) {
		this.techdetail = techdetail;
	}

	@Override
	public String toString() {
		return "Customers [custid=" + custid + ", custname=" + custname + ", coursename=" + coursename + "]";
	}
	
	
	/*
	 * To check whether it is working or not that main() method wala code.
	 *  
	 * */
	
	public void display()
	{
		System.out.println("Object returned successfully");
		techdetail.tech();
		/*
		 * 1.if i used it directly then it throws null pointer exception because the bean is not cretaed but 
		 * after giving component it will agian throw the same exception 
		 * so we have to use autowired to give the customers ability to recognize the presence of technologies class.
		 */
	}
	
}
