package com.language_fundamental.Arrays;

//An array is a indexed collection of a fixed number of homogeneous data element.

public class ArraysDemo {
	//below all are valid declaration of array.
	//single dimension array declaration
	
	//this is instance variable there is no restriction whether to initialize or not.
	String name;
	
	int[] a;
	
	int []b;
	int c[];
	//above all are valid declaration of array.
	
	//Two dimension array declaration
	
	int[][] d;
	int[] []e;
	int [][]f;
	int g[][];
	int []h[];
	
	
	//multiple array declaration
	
	int[] a1,b1; //here both are single d array
	
	int[] a2[],b2; //here a2 --> double d and b2-->single d
	
	int[][] a3,b3; //both are 2d;
	
	int[] []a4,b4; //both are 2d;
	
//	int[] a5,[]b5; //this is invalid we can't specify the dimension to variable after first variable only before first element we can do that.
	
	
	//Every array in java is an object 
	
	public static void main(String[] args) {
		
		//This is local variable ..it should be initialized necessarily.
		String name2 = "initialized";
		System.out.println(name2);
		ArraysDemo arrayDemo = new ArraysDemo();
		System.out.println(arrayDemo.name);
		
		
		//array Construction
		//At the time of array creation compulsory we should specify the size otherwise we will get compile time error.
		//error --> array dimension missing
		int[] a = new int[3];
		a[0]=2;
		a[1]=1;
		System.out.println(a);
		
		//we can have array as a size zero in java.
		int[] b = new int[0];
		
		//If we are taking array size with -ve int value then we will get runtime exception saying NegativeArraySizeException.
		
//		int[] c = new int[-3]; //it will throw run time exception
		
		//we can define array size with byte,short,int,char only.
		
		int[] d = new int[(short)5.9];
		d[0]=2;
		d[1]=2;
		d[2]=2;
		
		for(int i=0;i<5.0;i++) {
			System.out.println(d[i]);
		}
		System.out.println("____________");
		int[] e = new int[5];
		System.out.println(e.length);
		//length Vs length():

		/*
		 * length is a final variable applicable only for array.
		 * it represents the size of array.
		 * 
		 * length() is a final method applicable for string objects.
		 * It returns the number of character present in the string.
		 */
		
		String s="String1";
		System.out.println(s.length());
		
		System.out.println("_________Annonymous array________");
		
		/*
		 * Sometimes we can create an array without name such type of nameless arrays are 
		called anonymous arrays. 
		• The main objective of anonymous arrays is “just for instant use”.
		At the time of anonymous array creation we can’t specify the size otherwise we will get 
		compile time error.
		 */
		
		System.out.println(sum(new int[] {10,20,30,40}));
		
		System.out.println("____________Object type array________");
		//here i can provide any datatype also any object 
		Object[] obj = new Object[4];
		obj[0]="Umesh";
		obj[1]=2;
		obj[2]=new Integer(10);
		obj[3]=new String("Umesh");
		for(int i=0;i<4;i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println("______Interface type array_______");
		// interface type array are the array where we can give only the classes which are implementing that interface.
		Runnable[] r= new Runnable[2];
		r[0]=new Thread();
	//	r[1]=new String("umesh"); -->Not allowed
		
	}
	
	public static int sum(int[] x) 
	 { 
	 int total=0; 
	 for(int x1:x) 
	 { 
	 total=total+x1; 
	 } 
	 return total; 
	 }
	
}
