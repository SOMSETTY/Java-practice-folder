package com.String;

import java.util.Arrays;

public class Stringmethod3Example {

	public static void main(String[] args) {
		
		String data = "Hello World Hi How are you ?";
		
		String words[] = data.split(" ");
		
		for (String temp : words) {
			
			System.out.println(temp);
			//System.out.println(Arrays.toString(words));
			
		}
		System.out.println(Arrays.toString(words));

	}

}
