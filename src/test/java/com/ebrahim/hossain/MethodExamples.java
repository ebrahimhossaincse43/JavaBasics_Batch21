package com.ebrahim.hossain;

public class MethodExamples {
	
	public void add(int x , int y) {
		int sum = x+y;
		System.out.println("Summation: "+sum);
	}
	

	public static void main(String[] args) {
		/*
		 * Object Syntax
		 * ClassName objectName = new ClassName(parameter..);
		 */
		MethodExamples ex = new MethodExamples();
		ex.add(10,20);
		ex.add(100,120);
	}

}
