package com.String;

public class Stringmethod2 {

	public static void main(String[] args) {
		
		String data = "Hello World";
		
		// Sub string 
		String result = data.substring(1, 5);
		System.out.println(result);
		
		
		// Replace
		
		String replaceddata = data.replace('l', 'L');
		System.out.println(replaceddata);
		
		
		char c = data.charAt(4);
		System.out.println(c);
		
	int indexofchar  =	data.indexOf('o');
	System.out.println(indexofchar);
		
	int lastindexofchar  =	data.lastIndexOf('o');
	System.out.println(lastindexofchar);
	}

}
