/**
 * program about Ticket prize calculation
 * @author Nutan
 * @since Day 5
 */
package com.techzenure.day5;

import java.util.Scanner;

public class TicketPrizeCalculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no of bookings: ");
        int numBookings = scanner.nextInt();

        System.out.print("Enter the available tickets: ");
        int availableTickets = scanner.nextInt();
        Ticket.setAvailableTickets(availableTickets);

        for (int i = 0; i < numBookings; i++) {
            System.out.print("Enter the ticketid: ");
            int ticketid = scanner.nextInt();

            System.out.print("Enter the price: ");
            int price = scanner.nextInt();

            System.out.print("Enter the no of tickets: ");
            int nooftickets = scanner.nextInt();

            Ticket ticket = new Ticket();
            ticket.setTicketid(ticketid);
            ticket.setPrice(price);

            int totalAmount = ticket.calculateTicketCost(nooftickets);
            if (totalAmount != -1) {
                System.out.println("\nAvailable tickets: " + Ticket.getAvailableTickets());
                System.out.println("Total amount: " + totalAmount);
                System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());
                System.out.println();
                }
            else {
                System.err.println("Tickets are not available.");
            }
        }

        scanner.close();

	}

}
