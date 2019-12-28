package Day21_WhileLoop;

import java.util.Scanner;

public class WhileLoop {

	/*
	 while loop:
	 it only requires condition.
	 while(condition){
	 statements
	 }
	 while loop gets executed as loon as the condition is true
	 a repeating if statement
	 */
	
	public static void main(String[] args) {
		
		int a = 9;
		
		while(4<a) {
			--a;
			System.out.println("Hello");
			
		}
		
	/*
	 break: exits the switch statement
	 also used in loop
	 forcefull exit of the loop
	 */
	
		while(true) {
			System.out.println("hello");
			break;
		}
		
		int i = 0;
		while ( true ) {
			i++;
			System.out.println("Say it " + i);
			if( i == 5) {
			break;
		}
		}
		
		// ANY FOR LOOP CAN BE CONVERTED TO A WHILE LOOP
		// initialization;
		// while(condition){
		// statements;
		// iterator
		//	}
		
		/*
		 use while loop to print all even numbers between 0 to 100
		 */
		
		for (int z=1; z<=100; z++) {
				if(z%2==0) {
					System.out.print(z+" ");
				}
		}
		
		System.out.println("\n===================================");
		
		int Z = 1;
		while(Z <= 100) {
			if(Z%2==0) {
				System.out.print(Z+ " ");
			}
			Z++;
		}
		
		System.out.println("\n===================================");

		Scanner scan = new Scanner(System.in);
		System.out.println("Starting number");
		int start = scan.nextInt();
		
		System.out.println("Ending number");
		int end = scan.nextInt();
		
//		for ( int j = start; j<=end; j++) {
//			if ( j%2==0) {
//				System.out.print(j+" ");
//			}
//		}
		
		
		int k = start;
		while (k<=end) {
			if(k%2==0) {
				System.out.print(k+" ");
			}
			k++;
		}
		
		
		
		
		
		
	}
}
