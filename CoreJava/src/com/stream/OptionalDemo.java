package com.stream;

import java.util.Optional;

public class OptionalDemo {
	
	//by using optional class we deal with nullpointerexception.
	
	//to create object of optional there are 3 factory static methods present .
	
	//1.empty().
	//2.of()
	//3.ofNullable()
public static void main(String[] args) {
	
	
	Optional<String> empty = Optional.empty();
	System.out.println(empty);
	
	
	Optional<String> str = Optional.of("Umesh");
	System.out.println(str);
	
	Optional<String> str1 = Optional.ofNullable(null);
	System.out.println(str1);
	
}
}
