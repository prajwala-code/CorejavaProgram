package com.tnsif.statickeyword;
//demo for static keyword

public class Employee {
	int eid;
	String name;
	static String company="TNS";
	
	Employee(int e ,  String n){
		eid = e;
		name=n;
	}
	
	void display() {
		System.out.println(eid +" "+name+" "+company);
	}
	
	public static void main(String[]args) {
		Employee e = new Employee(1,"Rakshmi");
		Employee e1 = new Employee(1,"radhika");
		Employee e2 =  new Employee(1,"Raghu");
		
		e.display();
		e1.display();
		e2.display();
	}
}
