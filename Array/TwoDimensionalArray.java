package com.Array;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
//		
//		for(int index= 0 ; index<a.length ; index++) {
//			
//			System.out.println(a[index]);

//		for(int temp:a) {
//			System.out.println(temp);

		int b[][] = new int[4][2];

		System.out.println(b[0].length);

		for (int rowIndex = 0; rowIndex < b.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < b[0].length; columnIndex++) {
				// System.out.println(rowIndex + " " +columnIndex );
				System.out.print(b[rowIndex][columnIndex] + " ");
			}
			System.out.println(" ");
		}
	}

}
