/**
 * program about print Reverse Of a Number
 * @author Nutan
 * @since Day 3
 */

package com.techzenure.day3;

import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int reverse = 0;
        
         while(num>0) {
     	   int r = num%10;
     	   
     	   reverse = reverse*10 + r;
     	   
     	   num=num/10;
    
     	   }
         sc.close();
     	   System.out.print("the reverse number is : "+ reverse);
     	      
	            }
	
	}

