package com.declaration_and_access_modifiers.membermodifier;


//public members
//If a member declared as the public then we can access that member from anywhere “but the corresponding class must be visible” hence before checking member visibility we have to check class visibility. 

//default members
//If a member declared as the default then we can access that member only within the current package hence default member is also known as package level access.

//private members
//If a member declared as the private then we can access that member only with in the current class.
// Private methods are not visible in child classes where as abstract methods should be visible in child classes to provide implementation hence private, abstract combination is illegal for methods.

//protected members
//If a member declared as the protected then we can access that member within the current package anywhere but outside package only in child classes.
//Protected=default+kids.
//We can access protected members within the current package anywhere either by child reference or by parent reference but from outside package we can access protected members only in child classes and should be by child reference only that is we can’t use parent reference to call protected members from outside language.

//Final variables.

//Final instance variables:-If the instance variable declared as the final compulsory we should perform initialization whether we are using or not otherwise we will get compile time error. 
//  initialize final instance variable 1.at the time of diclaration
//2.inside instance block.
//3.inside construuctor

//Final static variables
//If the static variable declare as final then compulsory we should perform initialization explicitly whether we are using or not otherwise we will get compile time error.
//1.at the time of diclarartion.
//2.inside static block.

public class MemberModifierDemo {

//	final int i;
	
	public MemberModifierDemo() {
		
	//for constructor public,private,protected,default is available as modifiers.
		//basically we use private constructor to define utility class where we dont have to create an object of that class .
		
		super();
	//	i=10;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
	}
	
}
