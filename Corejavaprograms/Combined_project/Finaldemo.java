package com.tnsif.finaldemo;

public class Finaldemo {
	
	static int a=5;
	//final variable we can't change value
	static void display() {
		a=10;
	}

	void show() {
		//final method we can't override
		
		System.out.println("welcome");
	}
	
}



