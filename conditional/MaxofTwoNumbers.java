package com.conditional;

public class MaxofTwoNumbers {

	public static void main(String[] args) {
             int number1 = 24;
             int number2 = -44;
             //MAX
             if(number1>number2)
            	 System.out.println("Max is " +number1);
             else 
            	 System.out.println("Max is"+number2);
             
          // Ternary Operation
             int max = (number1 > number2) ? number1 : number2;
             System.out.println("Max is " + max);

	}

}
