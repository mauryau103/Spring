package com.language_fundamental.main_method;

//on runtime jvm will check for the main method
//public -->to call the jvm from any where 
//static -->without existing object also jvm has to call this method.
//void --> main() method won't return anything to jvm
//main(String[] args) --> coomandline arguments.
//we can replace string[] with var-arg 
//also we can use any other variable name.
//main() can be declared with the following modifiers:
//final,synchronized,strictfp.
public class Maindemo {

	public static void main(String[] args) {
		System.out.println("String main method");
	}
	public static void main(int[] args) {
		System.out.println("int main method");
	}
}

class Child extends Maindemo{
	public static void main(String[] args) {
		System.out.println("child main method"
				+ "");
	}
}
//we can overload main method but JVM always call String[] argument main() method only.