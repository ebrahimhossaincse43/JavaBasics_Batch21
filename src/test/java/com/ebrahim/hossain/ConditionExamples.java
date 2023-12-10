package com.ebrahim.hossain;

import java.util.Scanner;

public class ConditionExamples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 1st number");
		int number1 = input.nextInt();
		
		System.out.println("Please enter 2nd number");
		int number2 = input.nextInt();
		
		if(number1>number2) {
			System.out.println(number1+" is gratter than "+number2);
		}else if(number1<number2) {
			System.out.println(number1+" is less than "+number2);
		}else if(number1==number2) {
			System.out.println(number1+" is equal to "+number2);
		}
		else {
			System.out.println("Somethig went wrong...");
		}
		
		System.out.println("Please enter first name: ");
		String name1 = input.nextLine();
		
		System.out.println("Please enter last name: ");
		String name2 = input.nextLine();
		
		if(name1.equals(name2)) {
			System.out.println(name1+" is exact same to "+name2);
		}else if(name1.contains(name2)) {
			System.out.println(name1+" is contains "+name2);
		}else if(name1.equalsIgnoreCase(name2)) {
			System.out.println(name1+" is similar to "+name2);
		}
		else {
			System.out.println("Somethig went wrong...");
		}
 
	}

}
