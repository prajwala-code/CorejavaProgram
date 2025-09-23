package com.tnsif.exceptionhandling;

public class Test {
public static void main(String[]args) {
	try {
		
		System.out.println("welcome");
	}
	
catch(Exception e) {
	
	System.out.println(e.getMessage());
}
finally {
	
	System.out.println("Hello world");
}
}
}
