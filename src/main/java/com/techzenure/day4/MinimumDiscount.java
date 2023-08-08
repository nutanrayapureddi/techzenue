/**
 * program to find the Minimum discount
 * @author nutan
 * @since Day 4
 */
package com.techzenure.day4;

import java.util.Scanner;

public class MinimumDiscount {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of items: ");
	        int n = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        String minDiscountItem = null;
	        int minDiscount = Integer.MAX_VALUE;

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter item details (name, price, discount percentage): ");
	            String input = scanner.nextLine();
	            String[] itemDetails = input.split(",");

	            String itemName = itemDetails[0];
	            int price = Integer.parseInt(itemDetails[1]);
	            int discountPercentage = Integer.parseInt(itemDetails[2]);

	            int discountedPrice = price * (100 - discountPercentage) / 100;

	            if (discountPercentage < minDiscount) {
	                minDiscount = discountPercentage;
	                minDiscountItem = itemName;
	            }
	        }

	        if (minDiscountItem != null) {
	            System.out.println("Item with minimum discount is " + minDiscountItem );
	        } else {
	            System.out.println("No items entered.");
	        }

	        scanner.close();


	}

}
