package com.ebrahim.hossain;

public class StaticVsNonStatic {

	/*
	 * Static Method: static, non-static(object)
	 * Non Static Method: static, non-static
	 * 
	 */
	
	static int s=10;
	int d =20;
	
	//Static method
	public static void sub(int x , int y) {
		int sum = x-y;
		System.out.println("Sub: "+sum);
		System.out.println(s);

	}
	
	//Non Static Method
	public void division(int a, int b) {
		System.out.println("DIV: "+(a/b));
		System.out.println(s);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		sub(20,10);
		
		//object
		StaticVsNonStatic obj= new StaticVsNonStatic();
		obj.division(20,10);

	}
	
	static {
		System.out.println("Static................");
	}

}
