/**
 * program about print even numbers
 * @author Nutan
 * @since Day 3
 */
package com.techzenure.day3;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		
		
    Scanner sc = new Scanner(System.in);
	
		
		
		System.out.print("Enter the First No  : ");
		int x = sc.nextInt();
		
		
		System.out.print("Enter the Last No   : ");
		int y = sc.nextInt();
		
		if (x<y) {
			System.out.print("Even numbers Between " + x + " and " + y + "  Are : " );
			
		
		for(int i = ++x; i<y; i++)
		{
				
			if(i % 2 == 0)
			{
			
			System.out.print(" "+i+" ");
			
			
			}
			
		}
		}
		else {
			System.err.println( "Invalid Input : Second Number Should Be Greater Than First Number");
		}
		sc.close();
		
		

	}

}
