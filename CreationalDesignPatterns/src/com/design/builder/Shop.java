package com.design.builder;

public class Shop {
public static void main(String[] args) {
	
	
	Phone p= new Phone("Android",2,"Qualcom",5.5,3100);
	System.out.println(p);
	
	
	//now above line we see that we have passed 5 parameter
	//sometime there will be many parameter so it is very difficult for us.
	//and suppose we don't want to pass some ram size but .....tabhi bhi we have to pass something in that.
	
	Phone p2 = new PhoneBuilder().setOs("Android").getPhone();
	System.out.println(p2);
}
}
