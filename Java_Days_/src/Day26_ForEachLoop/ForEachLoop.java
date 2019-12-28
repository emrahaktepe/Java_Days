package Day26_ForEachLoop;

import java.util.Arrays;

public class ForEachLoop {
	 
	/*
	 * For Each Loop: Used to access the value in collection of values it is a loop
	 * that has already been iterated. For Each Loop can NEVER be infinite 
	 * syntax of for each loop:
	 * for(dataType variableName : variableNameOfCollection
	 * for(dataType each : arrayName){}
	 */
	
	public static void main(String[] args) {

	int[] arr = {1,2,3,4,5};
	
	for(int i=0; i<arr.length; i++) {
		arr[i] +=1;
		System.out.print(arr[i] + " ");
	}
	System.out.println("\n=================================\n");	
		
		for(int each : arr) {
			System.out.print(each);
		}
		
		System.out.println("\n=================================\n");	

	String[] str = 	{"A", "B", "C", "D", "E", "F"};
	for(String each : str) {
		System.out.print(each);
	}
	
	System.out.println("\n=================================\n");	

	char[] ch = {'z', 'x', 'y', 'c', 'a', 'e', 'm'};
	Arrays.sort(ch);
	for(char each : ch) {
		System.out.print(each + " ");
	}
	
	System.out.println("\n=================================\n");	

	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	for(int each : arr1) {
		if(each%2 == 0)
		System.out.print((each) + " ");
	}
	System.out.println("\n");
	for(int each : arr1) {
		if(each%2 != 0)
		System.out.print((each) + " ");
	}
	
	

	}
}
