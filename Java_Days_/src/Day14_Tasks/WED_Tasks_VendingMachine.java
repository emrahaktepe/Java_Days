package Day14_Tasks;

import java.util.Scanner;

public class WED_Tasks_VendingMachine {

	/*
	 	Write a program that determines the change to be dispensed from a vending machine. 
	 	An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
		increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
		dollar bill to pay for the item.

		Input: 
		Enter price in cents: 95↵
		
		Output:
		Your change is 0 quarters, 0 dimes, and 1 nickels.
		
		Remember:
		1 quarter = 25 cents.
		1 dimes = 10 cents.
		1 nickels  = 5 cents.
		you will need to use assignment and short hand operators for this task.  
	 
	 */
	
	public static void main(String[] args) {
		

	Scanner scn = new Scanner(System.in);
	System.out.print("Enter price in cents: ");
	int price = scn.nextInt();
	
		int quarter =(100-price)/25;
		int dime = ((100-price)%25)/10;
		int nickel = (((100-price)%25)%10)/5;
	
	System.out.println("Your change is " + quarter + " quarters, " + dime + " dimes, and " + nickel + " nickels.");
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
