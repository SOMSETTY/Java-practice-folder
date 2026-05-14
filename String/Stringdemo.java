package com.String;

public class Stringdemo {

	public static void main(String[] args) {

		int x = 10;
		String name = "jatin";
		String name2 = "Jatin";
		System.out.println(name.hashCode());
		System.out.println(name2.hashCode());

		int y = 10;

		System.out.println(x == y);  // Value  compare 
		System.out.println(name == name2);  // reference  Hashcode 
		System.out.println(name.equals(name2));  //  values checked  (euals = case sensitive)
		
		System.out.println(name.equalsIgnoreCase(name2)); // value checked 
	}

}
