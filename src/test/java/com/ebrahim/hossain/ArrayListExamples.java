package com.ebrahim.hossain;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		//ArrayList<Data-Type> arrayListName = new ArrayList<Data-Type>();

		ArrayList<String> names = new ArrayList<String>();
		names.add("manazir");
		names.add("kanak");
		System.out.println(names.size());
		System.out.println(names);
		
		names.add("mehejabin");
		names.add("fahim");
		System.out.println(names.size());
		System.out.println(names);
		
		names.remove(1);
		System.out.println(names.size());
		System.out.println(names);
		names.add("rahul");
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		names.clear();
		System.out.println(names.size());
	}

}
