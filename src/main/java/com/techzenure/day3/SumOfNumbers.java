/**
 * program about print sum of digits of numbers
 * @author Nutan
 * @since Day 3
 */
package com.techzenure.day3;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.printf("Enter the Number :");
		int x = sc.nextInt();
		int r;
		int sum=0;
		
		while(x>0) {
			r=x%10;
			sum=sum+r;
			x=x/10;
			}
		sc.close();
		System.out.print( sum);
		

	}

}
