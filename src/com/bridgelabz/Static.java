package com.bridgelabz;

public class Static {
	static int x = 10;
	static void display() {
		System.out.println("Static Method");	
	}
	static {
		System.out.println("Static Block");
	}
	public static void main(String args[]) {
		System.out.println(x);
		display();
	}
}
