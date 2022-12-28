package com.interfaces;


//Any service requirement specification is called an interface.
//inside interface every method is by default every method is abstract.
//Any service requirement specification (SRS) or any contract between client and service provider or 100% pure abstract classes is considered as an interface.

//whenever we are implementing the methods of interface inside class.it's compulsory to be declared as a public otherwise we will get compile time error . that we are lessering the scope size if we have'nt define public.

//methods -->by default public and abstract.
//variables --> public,static,final

//method naming conflicts
//1.If two interfaces contain a method with same signature and same return type in the 	implementation class only one method implementation is enough.
//2.if two interfaces contain method with same name but with different argument in the imple,mentation class we have to provide impl for both methods and these methods acts as a overloaded methods.
//3.if two interfaces contain a method with same signature but diffrent return types then it is not possible to implement both interfaces simultaneously.
interface A{
	int x=999;
	public void methodOne();
	
	//public void methodTwo(int b);
	
	public void methodThree(int b);
}
interface B{
	int x=888;
	public void methodOne();
	
//	public void methodThree(int b);
	
	public void methodTwo(int b,int c);
}

public class InterfaceDemo implements A,B{

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void methodTwo(int b, int c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodThree(int b) {
		// TODO Auto-generated method stub
		
	}
	
	
	//Marker interface
	
	

}
