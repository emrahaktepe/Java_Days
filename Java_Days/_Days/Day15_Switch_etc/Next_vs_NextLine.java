package Day15_Switch_etc;

import java.util.Scanner;

public class Next_vs_NextLine {
	
	public static void main(String[] args) {
		
		// next() vs nextLine();  ===> returns String value
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter your first name ");
//		String firstName = scan.nextLine();
//		
//		System.out.print("Enter your last name ");
//		String lastName = scan.nextLine();
//		
//		System.out.println(firstName + " " + lastName);
		
		
		Scanner scanX = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstNameX = scanX.next();
		
		System.out.print("Enter your last name: ");
		String lastNameX = scanX.next();
		
		System.out.println(firstNameX + " " + lastNameX);
		
	}

}
