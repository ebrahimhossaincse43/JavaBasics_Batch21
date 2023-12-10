package com.ebrahim.hossain;

public class MethodExamples extends StaticVsNonStatic{
	
	public static void add(int x , int y) {
		int sum = x+y;
		System.out.println("Summation: "+sum);
	}
	
	public void multiplication(int a, int b, int c) {
		System.out.println("Multiplication: "+(a*b*c));
	}

	public static void main(String[] args) {
		/*
		 * Object Syntax
		 * ClassName objectName = new ClassName(parameter..);
		 */
		MethodExamples ex = new MethodExamples();
		ex.add(10,20);
		ex.add(100,120);
		ex.multiplication(10, 20, 30);
	}

}
