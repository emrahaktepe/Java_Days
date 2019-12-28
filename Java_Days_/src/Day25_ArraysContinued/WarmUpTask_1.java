package Day25_ArraysContinued;

import java.util.Scanner;

public class WarmUpTask_1 {

	public static void main(String[] args) {
		
		/*
		 Write a program that can print out
		 unique values from an int Array.
		 
		 Ex:
		 iff arr ==> {1, 1, 2, 3, 3}
		 output: 2
		 */
		
		// Scanner scan = new Scanner(System.in);
		
		
		int[] arr = {1, 1, 2, 2, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, };
		
		for( int j=0; j<arr.length; j++) {
				
		int count = 0; // to see how many times a value appeared in the array
		
		for(int i=0; i < arr.length; i++) {
			
			if (arr[i] == arr[j]) { // compares each index of the array with the given value
				count ++; // everytime the value occurs the count goes up one
			}
		}
		if(count ==1)
			System.out.print(arr[j] + " ");

		}
		System.out.println("\n");
	}
	
}
