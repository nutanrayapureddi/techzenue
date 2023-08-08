/**
 * program about print odd numbers
 * @author Nutan
 * @since Day 3
 */
package com.techzenure.day3;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many odd numbers to be generated : ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++) {
			int x = (2*i-1);
			System.out.print( x+",");
		
		}

	}

}
