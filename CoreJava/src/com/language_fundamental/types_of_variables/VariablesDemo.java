package com.language_fundamental.types_of_variables;

//based on the value represented by the variables
//variables are divide into two part
//1. Primitive  variables; --> this are used to represent primitive values;
//int x=10;
//2.Reference variables; -->it is used to refer the objects.
//Student  s= new Student();



///Now Based on the purpose and positions of declaration of variable now there are divided into three types;;;

/*
 * 1.Instance Variables--> if we have not defined the value if instance variable compiler will defined it automatically.
 * a.Instance variables are defined inside a class not inside a methods.
 * b.If the value is varied from object to object such types of variable are called as instance variable.
 * c.for every object a separate copy of instance variables will be created.
 * d.instance variable will be created at a time of object creation and destroy at the time of object destruction.
 * e.hence the scope of instance variables is exactly same as scope of objects.
 * f.instance variable will be stored in the heap as a part of the object.
 * g.instance variable can be accessed directly from instance area .but cannot be accessed directly from static area.
 * h.by using object reference we can access instance variables.
 * 
 * 2. Static Variables
 * a.it can be defined anywhere but we have to use static keyword or we have to defined it inside static block.
 * b.we can not define static variable inside static methods.
 * c.if the value of a variable is not varied from object to object such types of variables is not recommended to declare as a instance variables.
 * d.we have to declare it at a class level by using modifier static.
 * e.for entire class only one copy will be created.
 * f.and shared by every object of that class.
 * g.static variable will be created at the time of class loading.
 * h.scope of static variable is same as .class file.
 * i.static variables will be stores inside method area  *** memory level point **
 * j.Static variables should be declared with in the class directly but outside of any method or block or constructor.
 * k.static variables can be accessed from both the area static and instance area directly.
 * l.
 * 3. Local Variables
 * a.local variables are defined inside method or any scope 
 * b.local variable should be initialized always and declared before use. 
 * c.The local variables will be created as part of the block execution in which it is declared and destroyed once that block execution completes. Hence the scope of the local variables is exactly same as scope of the block in which we declared.
 * e.local variables are stored in the stack ** memory level imp **
 * f. **IMP** The only applicable modifier for local variable is final.If we are using any other 
modifier we will get compile time error.

 */



public class VariablesDemo {
	
	static String staticv;
	
	int insatncev; //instance variable.
	
	
	public static void main(String[] args) {
		
		VariablesDemo vr = new VariablesDemo();
		
		String localV = "intialized"; //local variable -->throw run time error.
		
		System.out.println("Local variables : " +localV);
		System.out.println("Instance variable by compiler : "+vr.insatncev);
		System.out.println("static varible : "+staticv);
	}
	
	
	/*
	 *    **Conclusions**
	 *    
	 *    1.for Static and instance variables it is not required to perform initialization JVM will provide default values.
	 *    2.local variables JVM won't provide default values compulsory we should perform initialization explicilty before that variable.
	 *    3.instance and static variables can be accesses by multiple threads simultaneously and hence these are not thread safe but local variables can be accessed by oonly one thread at a time and hence local variables are thread safe.
	 * 	 
	 * 
	 */
	
}
