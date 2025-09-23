package com.tnsif.comparatr;

public class Comparator {
	public class SortbyRoll implements Comprator<Student>{
	
	@Override 
	public int compare (Student b1, Student b2 ) {
		
		return b2.rollno-b1.getRollno();
	}
}
	
