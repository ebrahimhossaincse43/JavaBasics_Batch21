package com.ebrahim.hossain;

public class ArrayExamples {

	public static void main(String[] args) {
		
		//Data-Type[] array-name = {......}
		String[] names= {"manazir", "kanak", "mehejabin", "fahim", "rahul"};
		
		System.out.println(names.length);
//		System.out.println(names[2]);
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
