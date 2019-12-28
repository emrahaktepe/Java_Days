package Day24_ReviewDay;

import java.util.Scanner;

public class WarmUpTask_1 {

	public static void main(String[] args) {
		
		// 1. write a program that can return 
		// the maximum value from an int array
		
		
//		Scanner scan = new Scanner(System.in);
		int[] arr = {20, 200, 30, 40, 50, 500};
		int max = 0;
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum number of this array is " + max);
		// to find the second biggest number of the array
		// do the same steps with an extra condition of avoiding the first max
		int secondMax = 0;
		for(int j=0; j < arr.length; j++) {
			if(arr[j] > secondMax && arr[j] != max) {
				secondMax = arr[j];
			}
		}
		System.out.println("The second maximum number of this array is " + secondMax);

		
		
	}
}
