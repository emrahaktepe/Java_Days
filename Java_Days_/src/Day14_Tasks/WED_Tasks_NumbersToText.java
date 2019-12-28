package Day14_Tasks;

import java.util.Scanner;

public class WED_Tasks_NumbersToText {
	
	
	/*
	 		write a program that can convert numbers (between 0~9) to words.
			if the number is greater than 9, the out put should be "invalid number.
            DO NOT USE IF STATEMENT
			
			ex 1: 
			input:
			enter a number between 0 to 9:
			1
			output: you have entered: one
			
			ex 2:
			input: enter a number between 0 to 9:
			2
			output: you have entered: two
			
			ex 3:
			enter a number between 0 to 9:
			10
			output: you have entered: Invalid number
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a number between 0 to 9: ");
		byte num = scanner.nextByte();
		String result = " ";
		
		switch(num) {
			case 1:
				result = "one";
				break;
			case 2:
				result = "two";
				break;
			case 3:
				result = "three";
				break;
			case 4:
				result = "four";
				break;
			case 5:
				result = "five";
				break;
			case 6:
				result = "six";
				break;
			case 7:
				result = "seven";
				break;
			case 8:
				result = "eight";
				break;
			case 9:
				result = "nine";
				break;
			default:
				result = "invalid number";
		}
		System.out.print("You have entered: " + result);
		
		
		
		
		
		
		
		
	}
	
	
}
