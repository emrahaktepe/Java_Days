package Day29_;

import java.util.Arrays;

public class MethodOverloading {

	/*
	 Method Overloading:
	 it is a feature that allows us to have more than
	 one method with the same name. the methods MUST 
	 have different parameters
	 
	 Why do we need overload method?
	 1- improves the re-usability
	 2- improves the readability
	 
	 overloading
	 ; same name, different parameter
	 
	 return types of the methods DO NOT have to be the same
	 */
	
	
	public static void main(String[] args) {
		
		int result1 = sum(333, 444);
		System.out.println(result1);
		
		int result2 = sum(111, 222, 333);
		System.out.println(result2);
		
		double result3 = sum(44.4, 55.5);
		System.out.println(result3);
		
		int[] arr = {1,2,3,4,5};
		sort(arr);
		
		char[] ch = {'a', 'b', 'c'};
		sort(ch);
		
		String[] str = {"A", "F", "L", "O", "Y", };
		sort(str);
	}
	
	
//	public static int sumOfTwoNumbers (int a, int b) {
//		return a+b;
//	}
//	
//	public static int sumOfThreeNumbers (int a, int b, int c) {
//		return a+b+c;
//	}
	
	
	public static int sum (int a, int b) {
		return a+b;
	}
	
	public static int sum (int a, int b, int c) {
		return a+b+c;
	}
	
	public static double sum (double a, double b) {
		return a+b;
	}
	
	public static void sort(int[] arr) {
		// [1,2,3,4,5]
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void sort(char[] ch) {
		// [1,2,3,4,5]
		Arrays.sort(ch);
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i] + " ");
		}
		System.out.println("\n");
	}
	public static void sort(String[] str) {
		// [1,2,3,4,5]
		Arrays.sort(str);
		for(int i=str.length-1; i>=0; i--) {
			System.out.print(str[i] + " ");
		}
		System.out.println("\n");
	}
	
}
