package com.tnsif.exceptionhandling;

public class Withexception {
	public static void main(String[]args) {
		
		int d=0;
		
		try {
			System.out.println("hello world");
		int a=55/0;
		System.out.println("hello");
		}
		
		catch(ArithematicException e) {
			
			System.out.println("exception caught"+e.getMessage());
		}
	}
}


