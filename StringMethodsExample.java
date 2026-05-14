package com.String;

public class StringMethodsExample {

	public static void main(String[] args) {

		String data = "    apple123   ";
		String data2 = "Apple";

		// Equals & EqualIgnorecase
		// System.out.println(data.hashCode());
		// System.out.println(data2.hashCode());

		// Method 1 :
//		System.out.println(data == data2); // Refereneces!! value
//		System.out.println(data.equals(data2)); // case sensitive comparsion
//		System.out.println(data.equalsIgnoreCase(data2)); // case insensitive

		// method -2 : length check : return me the size of the string !!! Total number
		// of charcters
		// present in the string
		// System.out.println(data.length());

		// Method 3 : Trim ;

		data = data.trim();
		// System.out.println(data.length());

		// Method 4 & 5: toLowerCase() and toUpperCase()
		// System.out.println(data);
		// data = data.toLowerCase();
		// System.out.println(data.toLowerCase());

		// System.out.println(data.toUpperCase());

		// Method 6 : String concat! : Joining of multiple strings
		// System.out.println(data + "abc");
//		System.out.println(data.concat("abc"));

		// Method 7 : charAt()

		System.out.println(data.charAt(4));
		
		// methos 8 :contains(); 
		
		System.out.println(data.contains("123b"));
		
		
		// Method 9 : isEmpty()  // empty string
		String data3="";
		System.out.println(data3.isEmpty());

	}

}
