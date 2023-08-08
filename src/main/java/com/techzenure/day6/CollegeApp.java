/**
 * program about College App For hostellers Details
 * @author Nutan
 * @since Day 6
 */
package com.techzenure.day6;

import java.util.Scanner;

public class CollegeApp {

	public static void main(String[] args) {
		 Hosteller hosteller = getHostellerDetails();

	        System.out.println("The Student Details are as follows:\n");

	        System.out.println("Student ID: " + hosteller.getStudentId());
	        System.out.println("Student Name: " + hosteller.getName());
	        System.out.println("Department ID: " + hosteller.getDepartmentId());
	        System.out.println("Student Gender: " + hosteller.getGender());
	        System.out.println("Student Phone No: " + hosteller.getPhone());
	        System.out.println("Hostel Name: " + hosteller.getHostelName());
	        System.out.println("Room No: " + hosteller.getRoomNumber());
	    }

	    public static Hosteller getHostellerDetails() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the Student Details & Hostel Details:");

	        System.out.print("Student ID: ");
	        int studentId = scanner.nextInt();
	        scanner.nextLine();

	        System.out.print("Student Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Department ID: ");
	        int departmentId = scanner.nextInt();
	        scanner.nextLine();

	        System.out.print("Gender[M/F]: ");
	        String gender = scanner.nextLine();

	        System.out.print("Phone Number: ");
	        String phone = scanner.nextLine();

	        System.out.print("Hostel Name: ");
	        String hostelName = scanner.nextLine();

	        System.out.print("Room Number: ");
	        int roomNumber = scanner.nextInt();
	        scanner.nextLine();

	        System.out.print("Modify Room Number(Y/N): ");
	        String modifyRoom = scanner.nextLine();
	        if (modifyRoom.equalsIgnoreCase("Y")) {
	            System.out.print("New Room Number: ");
	            roomNumber = scanner.nextInt();
	            scanner.nextLine();
	        }

	        System.out.print("Modify Phone Number(Y/N): ");
	        String modifyPhone = scanner.nextLine();
	        if (modifyPhone.equalsIgnoreCase("Y")) {
	            System.out.print("New Phone Number: ");
	            phone = scanner.nextLine();
	        }
	        scanner.close();

	        return new Hosteller(studentId, name, departmentId, gender, phone, hostelName, roomNumber);


	}

}
