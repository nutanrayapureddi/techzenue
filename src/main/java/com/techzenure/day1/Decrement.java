/**
 * program to understand decrement Operator
 * @author Nutan
 * @since Day 1&2
 */
package com.techzenure.day1;

public class Decrement {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(n--); // 10
		System.out.println(--n); //9
		
		n = 10;
		n= n-- + --n;//18
		System.out.println(n);
		n = 40;
		n= n-- + --n;//40+38=78
		System.out.println(n);

	}

	}

