/**
 * program about First assesment
 * @author Nutan
 * @since Day 1&2
 */
package com.techzenure.day1;


import java.util.Scanner;

public class FirstAssesment {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number of pizza's:  ");
				int pizza = sc.nextInt();
				
				System.out.println("Enter the number of puffs:  "); 
				int puff = sc.nextInt();
				
				System.out.println("Enter the number of drinks:  "); 
				int drink = sc.nextInt();
				
				System.out.println("Bill Details");
				
				int pizzascost = pizza*100;
				
				System.out.println("number of pizzas "+ pizza + "   cost: "+ pizzascost);
				
		        int puffscost = puff*20;
				
				System.out.println("number of puffs "+  puff + "    cost: "+ puffscost);
				  
		        int drinksscost = drink*10;
				
				System.out.println("number of drinks "+ drink + "   cost: "+ drinksscost);
				
				int totalprice = pizzascost + puffscost+ drinksscost;
				
				System.out.println("Total price = "+totalprice);
				System.out.println();
				System.out.println("ENJOY THE SHOW");
				

			}


	}


