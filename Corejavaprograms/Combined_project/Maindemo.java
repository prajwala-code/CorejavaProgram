package com.tnsif.superkeyword;

 public class Maindemo extends Superdemo {
	 
	 int a=8;
	 void drinking () {
		 System.out.println("boost")
;
	 }
	 
 void display() {
	 System.out.println(super.a);
	 
	 super.drinking();
 }
 
 
 public static void main(String[]args) {
	 Maindemo d = new Maindemo() ;
	 //object creation
	 
	 //System.out.println(s.a);
	 d.display();
	 d.drinking();
 }
 }
 
