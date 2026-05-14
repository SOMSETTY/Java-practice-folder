package com.student.management.system;

import java.util.Scanner;

public class SdutentManagementSystem {

	public static void main(String[] args) {

		// Store the information of student
		String studentName;
		int studentAge;
		double marksObtainedInenglish;
		double marksObtainedInscience;
		double marksObtainedInmaths;
		String studentGrade;
		int studentRollNumber;

		System.out.println("SdutentManagementSystem");

		// Reading Values from the Terminal or console

		Scanner scanner = new Scanner(System.in); // scanner is a class : java util package

		System.out.println("Enter student name");
		
		studentName = scanner.next();

		System.out.println("Enter studentAge");
		studentAge = scanner.nextInt();

		System.out.println("studentRollNumber");
		studentRollNumber = scanner.nextInt();

		// You cannot read single character with scanner class : in String format and
		// then convert string to char ! str.char(0)

		System.out.println("Enter Marks for english");
		marksObtainedInenglish = scanner.nextDouble();

		System.out.println("Enter Marks for Science");
		marksObtainedInscience = scanner.nextDouble();

		System.out.println("Enter Marks for Maths");
		marksObtainedInmaths = scanner.nextDouble();

		double totalMarkesObtained = marksObtainedInenglish + marksObtainedInscience + marksObtainedInmaths;
		double percentageObtained = (totalMarkesObtained / 3.0) ;

		if (percentageObtained >= 95) {
			studentGrade = "A+";
		} else if (percentageObtained >= 90) {
			studentGrade = "A";
		} else if (percentageObtained >= 85) {
			studentGrade = "B+";
		} else if (percentageObtained >= 80) {
			studentGrade = "B";
		} else if (percentageObtained >= 75) {
			studentGrade = "C+";
		} else if (percentageObtained >= 70) {
			studentGrade = "C";
		} else if (percentageObtained >= 60) {
			studentGrade = "D";
		} else {
			studentGrade = "F";
		}

//		System.out.println("studentGrade");
//		studentGrade = scanner.next();

		System.out.println("Student Name:" + studentName);
		System.out.println("Student Age:" + studentAge);
		System.out.println("English:" + marksObtainedInenglish);
		System.out.println("Science:" + marksObtainedInscience);
		System.out.println("Maths:" + marksObtainedInmaths);
		System.out.println("student Grade:" + studentGrade);
		System.out.println("student Roll Number:" + studentRollNumber);

	}

}
