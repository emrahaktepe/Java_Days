package Day14_Tasks;

import java.util.Scanner;

public class WED_Tasks_Discount {
	
	/*
	 Write a Java program to calculate total amount of sale based on the unit price and quantity of a product taken.
	- User should be able to enter unit price and quantity.
	- Then the program will perform calculations and display amounts.
	- The discount rate is 10% for the quantity purchased between 100 and 120 units, 
		and 15% for the quantity purchased greater than 120 units.
	- If the quantity purchased is less than 100 units, the discount rate is 0%.
	- See the example output as shown below:
			Input:
			Enter unit price: 25
			Enter quantity: 110
			Output:
			Grand Total: $ 2750.0
			Discount: 10%
			Discount applied: $ 275.0
			Total: $ 2475.0

	 */

	public static void main(String[] args) {
	
		Scanner unitPrice = new Scanner(System.in);
		System.out.print("Enter unit price: ");
		int unitPriceInput = unitPrice.nextInt();
		
		Scanner itemQuantity = new Scanner(System.in);
		System.out.print("Enter quantity: ");
		int itemQuantityInput = itemQuantity.nextInt();
		
		int grandTotal = unitPriceInput * itemQuantityInput;
		
		System.out.println("Grand total: $" + grandTotal);
		
		double discountRate = (itemQuantityInput>120) ? 0.15
								: (itemQuantityInput >=100 && itemQuantityInput<=120) ? 0.10
										: 0.00;
										 	
//			if(itemQuantityInput>120) {
//			discountRate = 0.15;
//			System.out.println("Discount: " + "15%");
//			}
//			else if(itemQuantityInput >=100 && itemQuantityInput<=120) {
//			discountRate = 0.10;
//			System.out.println("Discount: " + "10%");
//			}
//			else if(itemQuantityInput<100) {
//				discountRate = 0.0;
//				System.out.println("Discount: " + "0%");
//			}
			
			System.out.println("Discount applied: $" + grandTotal * discountRate);
			
			System.out.println("Total: $" + (grandTotal - (grandTotal*discountRate)));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
