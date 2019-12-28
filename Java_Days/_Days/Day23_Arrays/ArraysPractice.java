package Day23_Arrays;

import java.util.Scanner;

public class ArraysPractice {

	public static void main(String[] args) {

		String student1 = "Ali";
		String student2 = "Veli";
		String student3 = "Deli";

		String[] allStudents = { "Ali", "Veli", "Deli" };

		allStudents[0] = "Marufjon";
//	allStudents[3] = "Muhtar"; Max index is 2 so wont work

		// Array's size must be initialized.
//	We can initialize array size by
//	1- giving values	int[] a = {1, 2, 3}
//	2- 	

		int[] array = new int[4];

//	this array can contain 4 values, its length is = 4

//	 default velue of int = 0;

		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);

//	give values to the array	
		array[1] = 100;
		System.out.println(array[1]);
		array[0] = 200;
		System.out.println(array[0]);
	/*
	 array[5] = 500;
	 	System.out.println(array[5]);
	 	array size is fixed. 5 is out of range
	 */
		
		int[] array2;
		
//		System.out.println(array2[2]);
		
		Scanner scan = new Scanner(System.in);
		int [] inputs = new int[10]; // in this array we can store 10 elements 
		// highest number of index is 9
		
		for(int i = 0; i < inputs.length; i++) {
		System.out.println("Enter a number");
		inputs[i] = scan.nextInt();
		}
		for(int i = 0; i < inputs.length; i++) {
		System.out.print(inputs[i]+" ");
	}
		
		
//		PRACTICE = CRATE A STRING ARRAY TO COLLECT STUDENT NAMES
		
		String[] allStudentsNames = new String[358];
//		new keyword is used in array to initialize the size
		
		
}
}