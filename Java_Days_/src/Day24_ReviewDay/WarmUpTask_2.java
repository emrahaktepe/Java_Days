package Day24_ReviewDay;

import java.util.Scanner;

public class WarmUpTask_2 {

	public static void main(String[] args) {
		
		// write a program that can return the 
		// minimum value from an int array
		
		int[] arr = {100, 2, 2, 3, 4, 5, 6};
		int min = 99999999; // since we are looking for the min give a big number
		for( int i = 0; i < arr.length; i++) {
		if(arr[i] < min) {
			min = arr[i];
		}	
		}
		System.out.println("Minimum number of this array is " + min);
		
		
		int secondMin = 999999;
		for(int j=0; j<arr.length; j++) {
			if(arr[j] < secondMin && arr[j] > min) {
				secondMin = arr[j];
			}
		}
		
		System.out.println("Second minimum number of this array is " + secondMin);

	}
	
	
	
}
