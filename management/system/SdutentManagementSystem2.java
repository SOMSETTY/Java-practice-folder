package com.student.management.system;

import java.util.Scanner;

public class SdutentManagementSystem2 {

	public static void main(String[] args) {

		// Store the information of student
		String studentName[]= new String[100];
		int studentAge[]= new int[100];
		double []marksObtainedInenglish=new double[100];
		double []marksObtainedInscience= new double[100];
		double []marksObtainedInmaths= new double[100];
		String studentGrade[]= new String[100];
		int studentRollNumber[]= new int[100];

		System.out.println("SdutentManagementSystem");

		// Reading Values from the Terminal or console

		Scanner scanner = new Scanner(System.in); // scanner is a class : java util package

		System.out.println("Enter student name");
		
		studentName[0]= scanner.next();

		System.out.println("Enter studentAge");
		studentAge[0] = scanner.nextInt();

		System.out.println("studentRollNumber");
		studentRollNumber[0] = scanner.nextInt();

		// You cannot read single character with scanner class : in String format and
		// then convert string to char ! str.char(0)

		System.out.println("Enter Marks for english");
		marksObtainedInenglish[0] = scanner.nextDouble();

		System.out.println("Enter Marks for Science");
		marksObtainedInscience[0] = scanner.nextDouble();

		System.out.println("Enter Marks for Maths");
		marksObtainedInmaths[0] = scanner.nextDouble();

		double totalMarkesObtained = marksObtainedInenglish [0]+ marksObtainedInscience [0]+ marksObtainedInmaths[0];
		double percentageObtained = (totalMarkesObtained / 3.0) ;

		if (percentageObtained >= 95) {
			studentGrade [0]= "A+";
		} else if (percentageObtained >= 90) {
			studentGrade[0] = "A";
		} else if (percentageObtained >= 85) {
			studentGrade[0] = "B+";
		} else if (percentageObtained >= 80) {
			studentGrade[0] = "B";
		} else if (percentageObtained >= 75) {
			studentGrade[0] = "C+";
		} else if (percentageObtained >= 70) {
			studentGrade[0] = "C";
		} else if (percentageObtained >= 60) {
			studentGrade[0] = "D";
		} else {
			studentGrade[0] = "F";
		}

//		System.out.println("studentGrade");
//		studentGrade = scanner.next();

		System.out.println("Student Name:" + studentName[0]);
		System.out.println("Student Age:" + studentAge[0]);
		System.out.println("English:" + marksObtainedInenglish[0]);
		System.out.println("Science:" + marksObtainedInscience[0]);
		System.out.println("Maths:" + marksObtainedInmaths[0]);
		System.out.println("student Grade:" + studentGrade[0]);
		System.out.println("student Roll Number:" + studentRollNumber[0]);
	}

}
