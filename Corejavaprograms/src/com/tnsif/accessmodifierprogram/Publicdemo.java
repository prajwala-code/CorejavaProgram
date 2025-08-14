package com.tnsif.accessmodifierprogram;

public class Publicdemo{
	public int a=9;
	private String name ="ruva";
	protected float s=9.5f;
	int u=9; //default access modifier
	public void display() {
		System.out.println("welcome");
	}
public static void main(String[]args) {
	Publicdemo p=new Publicdemo();
	System.out.println(p.name);
	System.out.println(p.a);
	System.out.println(p.s);
	System.out.println(p.u);
	p.display();
}
}