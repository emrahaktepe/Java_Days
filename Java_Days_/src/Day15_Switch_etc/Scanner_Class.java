package Day15_Switch_etc;

import java.util.Scanner;

//		package name: java.util
//		class: Scanner

public class Scanner_Class {

	public static void main(String[] args) {
		
	// Scanner variableName - variableName: can reference and object of a Scanner class
		
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a byte value: ");
	byte num1 = input.nextByte();
	
	System.out.print("Enter a short value: ");
	short num2 = input.nextShort();
	
	System.out.print("Enter a int value: ");
	int num3 = input.nextInt();
	
	System.out.print("Enter a long value: ");
	long num4 = input.nextLong();
	
	System.out.print("Enter a float value: ");
	float num5 = input.nextFloat();
	
	System.out.print("Enter a double value: ");
	double num6 = input.nextDouble();
	System.out.println(num1 +" "+ num2 +" "+ num3 +" "+ num4 +" "+ num5 +" "+ num6);
	
	
	
	
	
}	
}
