package com.tnsif.polymorphism;

//child class

public class Child extends Parent
{
	
	void drinking() {
		System.out.println("juice");
	}
	
	public static void main(String[]args) {
		Child c =new Child (); {
			
			c.drinking();
		}
	}
	
}



