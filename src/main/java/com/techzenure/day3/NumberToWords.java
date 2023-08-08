/**
 * program to print number to word
 * @author Nutan
 * @since Day 3
 */
package com.techzenure.day3;

import java.util.Scanner;

public class NumberToWords {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a digit (0-9): ");
	        int digit = scanner.nextInt();
	        scanner.close();
	        
	        String numberWord = convertDigitToNumberWord(digit);
	        
	        if (numberWord != null) {
	            System.out.println("Number word: " + numberWord);
	        } else {
	            System.out.println("Invalid input. Please enter a valid digit (0-9).");
	        }
	    }
	    
	    public static String convertDigitToNumberWord(int digit) {
	        String[] numberWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	        
	        if (digit >= 0 && digit <= 9 )
	        {
	            return numberWords[digit];
	        }
	        
	        else 
	        {
	            return null;
	        }
	}

}
