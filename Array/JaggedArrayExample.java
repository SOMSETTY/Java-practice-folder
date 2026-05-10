package com.Array;

import java.util.Arrays;

public class JaggedArrayExample {

	public static void main(String[] args) {
		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		for (int temp : a) {
			System.out.println(temp);
		}

		System.out.println(Arrays.toString(a));

		int b[][] = new int[2][2];
		b[0][0] = 100;
		b[0][1] = 200;
		b[1][0] = 300;
		b[1][1] = 400;

		System.out.println(Arrays.toString(b[0]));
		System.out.println(Arrays.toString(b[1]));

		// Jagged array exampls

		int j[][] = new int[2][];

		j[0] = new int[] { 10, 20, 30 };
		j[1] = new int[] { 40 };
        System.out.println(j.length);
		for(int rowIndex = 0; rowIndex < j.length; rowIndex++) {
			for(int columnIndex = 0; columnIndex < j[rowIndex].length; columnIndex++) {

				System.out.print(j[rowIndex][columnIndex]+ " ");
			}
			System.out.println(" ");
		}

	}

}
