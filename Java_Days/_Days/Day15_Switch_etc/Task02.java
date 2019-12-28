package Day15_Switch_etc;

import java.util.Scanner;

public class Task02 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first of 3 numbers: ");
		double n1 = input.nextDouble();
			
		System.out.print("Enter second of 3 numbers: ");
		double n2 = input.nextDouble();
		
		System.out.print("Enter third of 3 numbers: ");
		double n3 = input.nextDouble();
		
		
		double largest = (n1 > n2 && n1 > n3) ? n1
							: (n2 > n3 && n2 > n1) ? n2
								: n3 ;

		System.out.println("The largest number is " + largest);
		input.close(); // gets rid of the warning of the scanner class
	}

}
