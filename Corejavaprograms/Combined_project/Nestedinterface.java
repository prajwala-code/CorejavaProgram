package com.tnsif.interfacedemo;

import com.tnsif.interfacedemo.Myinterface.Myinnernterface;

public class Nestedinterface implements 
Myinnernterface{
	
	@Override
	public void print() {
			
			System.out.println("inner interface method");
		}
		
		public static void main(String[]args) {
			Nestedinterface n=new Nestedinterface();
			n.print();
			
			System.out.println(Nestedinterface.id);
		}
	}
	
			
