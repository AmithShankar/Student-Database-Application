package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tutionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Student First Name and Last Name: ");
		this.firstName = scan.nextLine();
		this.lastName = scan.nextLine();
		
		System.out.println("1 - First year\n2 - Second year\n3 - Third Year\n4 - Fourth year\n Enter Student Class Level: ");
		this.gradeYear = scan.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
	}
	
	// Generate an ID
	private void setStudentID(){
		// Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// Enroll in Courses
	
	// View Balance
	
	// Pay Tuition
	
	// Show Status
	
	
}
