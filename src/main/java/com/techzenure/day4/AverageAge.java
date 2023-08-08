/**
 * program to find the average of the ages
 * @author nutan
 * @since Day 4
 */
package com.techzenure.day4;

import java.util.Scanner;

public class AverageAge {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of employees: ");
	        int numEmployees = scanner.nextInt();

	        if (numEmployees < 2) {
	            System.err.println("Please enter a valid employee count.");
	        } else {
	            int[] ages = new int[numEmployees];
	            boolean invalidAgeEncountered = false;

	            for (int i = 0; i < numEmployees; i++) {
	                System.out.print("Enter age of employee " + (i + 1) + ": ");
	                int age = scanner.nextInt();

	                if (age < 28 || age > 40) {
	                    invalidAgeEncountered = true;
	                    break;
	                }

	                ages[i] = age;
	            }

	            if (invalidAgeEncountered) {
	                System.err.println("Invalid age encountered!");
	            }
	            else
	            
	            {
	                double averageAge = calculateAverage(ages);
	                System.out.println("Average age of employees: " + averageAge);
	            }
	        }

	        scanner.close();
	    }

	    public static double calculateAverage(int[] ages) {
	        int sum = 0;
	        for (int age : ages) {
	            sum += age;
	        }
	        return (double) sum / ages.length;
	    }

	}

