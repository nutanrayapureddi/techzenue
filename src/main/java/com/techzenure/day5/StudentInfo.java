/**
 * program about Student Details
 * @author Nutan
 * @since Day 5
 */
package com.techzenure.day5;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter student address: ");
        String studentAddress = scanner.nextLine();

        System.out.print("Is the student from NIT? (yes/no): ");
        String isFromNIT = scanner.nextLine();

        Student student;

        if (isFromNIT.equalsIgnoreCase("yes")) {
            student = new Student(studentId, studentName, studentAddress);
        } else if (isFromNIT.equalsIgnoreCase("no")) {
            System.out.print("Enter college name: ");
            String collegeName = scanner.nextLine();
            student = new Student(studentId, studentName, studentAddress, collegeName);
        } else {
            System.out.println("Wrong Input");
            return;
        }

        System.out.println("Student details:");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Address: " + student.getStudentAddress());
        System.out.println("College Name: " + student.getCollegeName());

        scanner.close();

	}

}
