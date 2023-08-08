/**
 * program about Movie ticket calculation
 * @author Nutan
 * @since Day 3
 */
package com.techzenure.day3;

import java.util.Scanner;

public class MovieTicketCalculation {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		float kingTicket = 75.0f,queenTicket = 150.0f,refreshmentPerPerson = 50.0f,ticketCost=0,refreshmentCost=0,bill=0,discount=0;
		
		System.out.print("Enter the no of ticket: ");
		int ticketQty = sc.nextInt();
		System.out.print("Do you want refreshment(y/n): ");
		char refreshment = sc.next().charAt(0);
		System.out.print("Do you have coupon code(y/n): ");
		char coupon = sc.next().charAt(0);
		System.out.print("Enter the circle(k/q): ");
		char circle = sc.next().charAt(0);
		
		sc.close();
		
		if(ticketQty<5 || ticketQty>40) {
			System.err.println("Minimum of 5 and Maximum of 40 Tickets");
			return ;
		}
		if(circle=='k'||circle=='K') {
			ticketCost = ticketQty * kingTicket;
		}else if(circle=='q'||circle=='Q') {
			ticketCost = ticketQty * queenTicket;
		}else {
			System.err.println("Invalid Input");
			return ;
		}
		if(refreshment=='y'||refreshment=='Y') {
			refreshmentCost = refreshmentPerPerson * ticketQty;
		}
		if(ticketQty>20) {
			discount = (ticketCost*0.1f);
		}
		if(coupon=='y'||coupon=='Y') {
			discount += (ticketCost-discount)*.02f;
		}
		bill = ticketCost + refreshmentCost - discount;
		System.out.printf("Ticket cost        :%8.2f\n",bill);
	}

	}

