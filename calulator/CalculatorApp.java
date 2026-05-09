package com.calulator;

public class CalculatorApp {

	public static void main(String[] args) {
		double number1;
		int number2;
		number1=100;
		number2=5;
	    double result ;
	   result = calculateSum(number1,number2);
	   System.out.println(result);
	   
	  double x = calculateSubofTwoNumber(number1, number2);
	  System.out.println(x);
	  
	  
	result  = CalculateDivisionofTwoNumber(number1, number2);
	 System.out.println(result);
	  
	  
	 result=  CalculateMultiplicationofTwoNumber(number1, number2);
	System.out.println(result);
	  
	   
	   

	}  // end of main method

	public static double CalculateMultiplicationofTwoNumber(double number1, int number2) {
		double result;
		result = number1*number2;
		return result ;
	}

	public static double CalculateDivisionofTwoNumber(double number1, int number2) {
		double result;
		result = number1/number2;
		  return result;
	}

	private static double calculateSubofTwoNumber(double number1, int number2) {
		double result;
		result = number1-number2;
		 return result ;
	}
	
	public static double calculateSum(double number1,int number2) {
		double result = number1 + number2;
		return result ;
	}

	}


