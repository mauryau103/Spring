package com.design.factory;

public class FactoryMain {

	public static void main(String[] args) {
		
		System.out.println("this is factory design pattern");
		
		OperatingSystemFactory osf = new OperatingSystemFactory();
		
		//
		
		OS obj = osf.getInstance("Open");
		obj.spec();
		
		
		
		//OS obj = new Windows(); //-->if we do this the Windows class is visible in right side and it is also represent an dependency
		//obj.spec();
	}
}
