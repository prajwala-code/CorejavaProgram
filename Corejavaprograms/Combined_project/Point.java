package com.tnsif.polymorphism;

//method overloading

public class Point {
	
	int add(int a, int b){
		
		return a + b;
	}

	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[]args) {
		Point p = new Point();
		System.out.println(p.add(2, 5));
		System.out.println(p.add(1,2,3));
	}
}



