package com.declaration_and_access_modifiers.classmodifier;

//better this class can be accessible from anywhere or not.
//better child class creation is possible or not.
//whether object creation is possible or not.
//top level classes modifiers : -

//1.public -->we can access this class from anywhere
//2.default --> only within a current package(package level access).
//3.final --> final is applicable for classes,methods and variables.
			
			//a.final Methods
				//whatever the methods parent has by default available to the child.
				//the final method can't be overridden.(above line meant the same in another way).
			//b.final class
				//if final class is there then inheritance concept is not applicable for final classes.
				//every method present inside final class is always by default final. but every variable present in final class need not be final.
				//main advantage of final we achieve security.
				//main disadvantage is we are missing oops concept.polymorphism(because of final methods) and inheritance(due to final classes).
//4.Abstract -->Abstract is the modifier applicable only for methods and classes but not for variables.

				//a.Abstract Methods
				// when we use abstract method then our class should also be abstract.
				//our abstract method implementation is the responsibility of child classes.
				//abstract method have only declaration but not implementation.
				//abstract methods never talk about implementation at same place .. so combination with implemenation like modifiers is not valid for abstract methods.
				//possible illegal combinations
					//abstract ~> final,static,synchronized,native,strictfp,private.
				
				//b.Abstract Class
				//if we are not allow to create an object of a class then go for abstract class.
 //If a class extends any abstract class then compulsory we should provide implementation for every abstract method of the parent class otherwise we have to declare child class as abstract. 
//If we declare class child as abstract then the code compiles fine but child of child is responsible to provide implementation for methodTwo().


//5.strictfp

//strictfp is the modifier applicable for methods and classes but not for variables.
//If a method declare as the Strictfp then all the floating point calculations in that method has to follow IEEE754 standard. So that we will get flat from independent results.

//if we use any other modifier will get ce.


//inner level classes modifiers 

//1.private
//2.protected
//3.static

public class ClassModifiers {
	
	
}
final class Finclass{
	
}
abstract class AbsClass extends Strclass{
	
}
strictfp class Strclass{
	
}