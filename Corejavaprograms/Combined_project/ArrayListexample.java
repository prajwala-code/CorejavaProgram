package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListexample {
	public static void main(String[]args) {
		ArrayList<String>l=new ArrayList();
		
		l.add("rose");
		l.add("mango");
		l.add("orange");
		
		System.out.println(l);
		
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

	
