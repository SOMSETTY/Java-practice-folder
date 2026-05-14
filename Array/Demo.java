package com.Array;

public class Demo {

	public static void main(String[] args) {
		int x=10;
		
		int marks [] = new int [3];
//		System.out.println(x);
//		System.out.println(marks);
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
//		System.out.println(marks[3]);
//		System.out.println(marks[4]);
		
		System.out.println(marks.length);
		
		marks[0]=8;
		marks[1]=7;
		marks[2]=6;

		
		
		for(int index=0;index<=marks.length-1;index++) {
			System.out.println(marks[index]);
		}


	}

}
