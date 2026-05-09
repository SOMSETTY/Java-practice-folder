package com.calulator;

public class Cal {

	public static void main(String[] args) {
		
		int numberOne = 10;
		int numberTwo = 20;
		int numberThree = 40;
		
		addNumbers(numberOne,numberTwo);
		addNumbers(numberOne,numberTwo,numberThree);
        addNumbers(23.5,10);
		
		
	}
		
private static void addNumbers(double numberOne, int numberTwo) {
    System.out.println(numberOne+numberTwo);		
	}

private static void addNumbers(int numberOne, int numberTwo, int numberThree) {
		
	System.out.println(numberOne+numberTwo+numberThree);

	}

private static void addNumbers(int numberOne, int numberTwo) {
		
		System.out.println(numberOne+numberTwo);
				

	
		
	

	
		
	}
	
	

}
