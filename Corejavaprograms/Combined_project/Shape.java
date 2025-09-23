package com.tnsif.abstraction;

public abstract class Shape{
	protected float area;
	//variable 
	
	//abstract method
	
	abstract void calarea();
	//concreate method 
	
	void show() {
		System.out.println("area of the square "+area);
	}
	
}



