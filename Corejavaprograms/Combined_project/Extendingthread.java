package com.tnsif.multithreading;

public class Extendingthread extends Thread{
	
	public void run() {
		System.out.println("Hello");
	}
	
	public static void main(String[]args) {
		Extendingthread e = new Extendingthread ();
		e.start();
	}
}

