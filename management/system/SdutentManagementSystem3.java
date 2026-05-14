package com.student.management.system;

import java.util.Scanner;

public class SdutentManagementSystem3 {
	// Global varable
	public static String studentName[] = new String[100];
	public static int studentAge[] = new int[100];
	public static double[] marksObtainedInenglish = new double[100];
	public static double[] marksObtainedInscience = new double[100];
	public static double[] marksObtainedInmaths = new double[100];
	public static String studentGrade[] = new String[100];
	public static int studentRollNumber[] = new int[100];

	public static int index = 0;

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int option;
		System.out.println("SdutentManagementSystem");

		while (true) {
			System.out.println("1.Add a student");

			System.out.println("2.print student details");

			System.out.println("3.Ptint All student details");

			System.out.println("4.Exit");

			System.out.println("Enter option [1-4]");

			option = scanner.nextInt();

			switch (option) {
			case 1:
				addstudent(); // static methods can call another static method
				break;
			case 2:
				printstudentinformation(); // static methods can call another static method
				break;
			case 3:
				printallstudentinformation(); // static methods can call another static method
				break;
			case 4:
				exitApp(); // static methods can call another static method
				break;

			}
		}
//		System.out.println("studentGrade");
//		studentGrade = scanner.next();

//	
	}

	private static void exitApp() {
		System.out.println("Existing from the App.....");
		System.exit(0);
	}

	private static void printallstudentinformation() {

		for (int i = 0; i<index; i++) {
			
			System.out.println("*********************************************");

			System.out.println("Student Name:" + studentName[i]);
			System.out.println("Student Age:" + studentAge[i]);
			System.out.println("English:" + marksObtainedInenglish[i]);
			System.out.println("Science:" + marksObtainedInscience[i]);
			System.out.println("Maths:" + marksObtainedInmaths[i]);
			System.out.println("student Grade:" + studentGrade[i]);
			System.out.println("student Roll Number:" + studentRollNumber[i]);
			
			System.out.println("*********************************************");
		}

	}

	private static void printstudentinformation() {
		System.out.println("printstudentinformation");
		System.out.println("Enter the index");
		int userIndex = scanner.nextInt();

		System.out.println("Student Name:" + studentName[userIndex]);
		System.out.println("Student Age:" + studentAge[userIndex]);
		System.out.println("English:" + marksObtainedInenglish[userIndex]);
		System.out.println("Science:" + marksObtainedInscience[userIndex]);
		System.out.println("Maths:" + marksObtainedInmaths[userIndex]);
		System.out.println("student Grade:" + studentGrade[userIndex]);
		System.out.println("student Roll Number:" + studentRollNumber[userIndex]);

	}

	public static void addstudent() {
		System.out.println("Enter student name");
		studentName[index] = scanner.next();

		System.out.println("Enter studentAge");
		studentAge[index] = scanner.nextInt();

		System.out.println("studentRollNumber");
		studentRollNumber[index] = scanner.nextInt();

		// You cannot read single character with scanner class : in String format and
		// then convert string to char ! str.char(0)

		System.out.println("Enter Marks for english");
		marksObtainedInenglish[index] = scanner.nextDouble();

		System.out.println("Enter Marks for Science");
		marksObtainedInscience[index] = scanner.nextDouble();

		System.out.println("Enter Marks for Maths");
		marksObtainedInmaths[index] = scanner.nextDouble();

		double totalMarkesObtained = marksObtainedInenglish[index] + marksObtainedInscience[index]
				+ marksObtainedInmaths[index];
		double percentageObtained = (totalMarkesObtained / 3.0);

		if (percentageObtained >= 95) {
			studentGrade[index] = "A+";
		} else if (percentageObtained >= 90) {
			studentGrade[index] = "A";
		} else if (percentageObtained >= 85) {
			studentGrade[index] = "B+";
		} else if (percentageObtained >= 80) {
			studentGrade[index] = "B";
		} else if (percentageObtained >= 75) {
			studentGrade[index] = "C+";
		} else if (percentageObtained >= 70) {
			studentGrade[index] = "C";
		} else if (percentageObtained >= 60) {
			studentGrade[index] = "D";
		} else {
			studentGrade[index] = "F";
		}
		index = index + 1; // index++
		System.out.println("Student information stores sucessfully");
	}

}
