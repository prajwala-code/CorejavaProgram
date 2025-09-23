package com.tnsif.stringbuffer;

public class Stringbufferdemo {
	
	public static void main(String[]args) {
		
		StringBuffer str=new StringBuffer("welcome");
		
		System.out.println(str);
		System.out.println(str.append("to java"));
		
		System.out.println(str.insert(4, "to python"));
		
		System.out.println(str.length());
		
		System.out.println(str.delete(5,9));
		
		System.out.println(str.reverse());
		
	System.out.println(str.replace(1, 4,  "fire"));
		
		
	}
}





