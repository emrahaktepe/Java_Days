package Day21_WhileLoop;

import java.util.Scanner;

public class Practice {

	/*
	 Ask user to enter two number
	 then find the sum of those two numbers
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		while (true) {
		System.out.println("Enter first number");
		int a = scan.nextInt();
		
		System.out.println("Enter second number");
		int b = scan.nextInt();
		
		System.out.println("Sum of numbers is: " + (a+b));
		System.out.println("do you want to add more numbers");
		String answer = scan.next();
		if(answer.equalsIgnoreCase("No")) {
			break;
		}
		}
		
		
		
	}
}
