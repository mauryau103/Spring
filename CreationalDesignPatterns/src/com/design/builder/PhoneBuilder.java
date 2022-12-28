package com.design.builder;

public class PhoneBuilder {
	
	
	//now whatever problem mention in the shop class.
	//here is solution for that/
	//this builder class will make phone for us
	//here we take all setter and no getter
	//and instead of mentioning the void as a type we will take the class a return type
	//at run time we specify which parameter we want to set.
		
	
	//For Example ---> Single Emplty Cocke Bottle(Phone Builder) --> after that we set everything into that like -->satizing it -->filling-->caping it-->labeling it
	//we have performed all this on that single object of cocke
	
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	
	
	
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		
		//after setting we have return that same object
		return this;
	}
	
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	
	
	public Phone getPhone() {
		//we have passed varibale name inside that
		return new Phone(os,ram,processor,screenSize,battery);
	}
	
	
}
