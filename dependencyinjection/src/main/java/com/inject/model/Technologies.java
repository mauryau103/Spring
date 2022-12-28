package com.inject.model;

import org.springframework.stereotype.Component;

@Component
public class Technologies {

	private int techid;
	private String techname;
	
	public Technologies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Technologies(int techid, String techname) {
		super();
		this.techid = techid;
		this.techname = techname;
	}

	public int getTechid() {
		return techid;
	}

	public void setTechid(int techid) {
		this.techid = techid;
	}

	public String getTechname() {
		return techname;
	}

	public void setTechname(String techname) {
		this.techname = techname;
	}

	@Override
	public String toString() {
		return "Technologies [techid=" + techid + ", techname=" + techname + "]";
	}
	
	public void tech()
	{
	System.out.println(" Successful");
	}
	
	//now to call tech() method in the customers class we have to cretae an object of the technologies class.in the customers class.
	
	
}
