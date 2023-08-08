/**
 * program to print sequence of numbers
 * @author Nutan
 * @since Day 3
 */
package com.techzenure.day3;

public class PrintSequence {

	public static void main(String[] args) {
		 int firstTerm = 1;
	        int commonDifference = 3;
	        int numberOfTerms = 15;

	        System.out.println("First " + numberOfTerms + " terms of the arithmetic sequence:");

	        for (int i = 0; i < numberOfTerms; i++) {
	            int term = firstTerm + i * commonDifference;
	            System.out.print(term);

	            if (i < numberOfTerms- 1 )
	            {
	                System.out.print(", ");
	            }
	        }

	}

}
