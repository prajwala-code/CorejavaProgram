package com.tnsif.interfacedemo;

public class SBI implements Bank
{
	
	@Override
	public float rateofinterest() {
		
		return 3.5f;
	}
	
	public static void main(String[]args) {
		
		SBI s =new SBI ();
		
		System.out.println("ROI"+s.rateofinterest());
		
		PNB p=new PNB();
		
		System.out.println("ROI"+p.rateofinterest());
	}
}


