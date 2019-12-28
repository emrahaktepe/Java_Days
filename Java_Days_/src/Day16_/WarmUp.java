package Day16_;

import java.util.Scanner;

public class WarmUp {
	
	public static void main(String[] args) {
		
		/*
		 write a java program that asks user to enter first and last names, 
		 then printout the user's full name in all capital letters.
		 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstName = scan.nextLine(); 
		// String firstName = scan.nextLine().toUpperCase;
		System.out.print("Enter your last name: ");
		String lastName = scan.nextLine();	
		// String lastName = scan.nextLine().toUpperCase;
		
		String fullName = firstName + " " + lastName;
		// String fullName = firstName.concat(" " + lastName
			fullName = fullName.toUpperCase();
			
		System.out.println(fullName);
		
		
	}

}
