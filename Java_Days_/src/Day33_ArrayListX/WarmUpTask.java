package Day33_ArrayListX;

import java.util.Arrays;

public class WarmUpTask {

	/*
	 Warm up:
    write a return method that accepts an int array and sorts it in descending order
    write a return method that accepts a double array and sorts it in descending order
    write a return method that accepts a char array and sorts it in descending order
    write a return method that accepts a String array and sorts it in descending order
        Hint: method overloading is prefered here
	 */
	
	public static void main(String[] args) {
		
		int[] arr = {10, 89, 20, 300, 10, 900, 0, 1};
		
		reverseArray(arr);		
		System.out.println(Arrays.toString(arr));
		
		double[] arrD = {10.5, 5.5, 300, 2.1, 6.8};
		reverseArray(arrD);		
		System.out.println(Arrays.toString(arrD));

	}
	
	public static int[] reverseArray(int[] arr) {
		
		Arrays.sort(arr); // ascending order - artan
		
		int[] newArr = new int[arr.length]; // the new arr
		
		// we cannot use nested loop because it is going to repeat
		// the inner loop each time with the outer loop
		
		int j = 0;

			for (int i = arr.length-1; i >= 0; i--) {
			newArr[j] = arr[i];
		//	newArr[]arr.length-1-i] = arr[i];
			j++;
		}
		
		return arr;
	}
	
	public static double[] reverseArray(double[] arr) {
        Arrays.sort(arr);  // ascending order
        double[] newArr = new  double[arr.length];   // can contain all values of arr
        int j=0;
        
        for(int i = arr.length-1;  i >= 0 ; i-- ) {
                newArr[j] = arr[i];
            //  arr2[arr.length-1-i] = arr[i];
                    j++;
        }
        
        return newArr;
	}
	
	
public static Integer[] reverseArray(Integer[] arr) {
		
		Arrays.sort(arr); // ascending order - artan
		
		Integer[] newArr = new Integer[arr.length]; // the new arr
		
		// we cannot use nested loop because it is going to repeat
		// the inner loop each time with the outer loop
		
		int j = 0;

			for (int i = arr.length-1; i >= 0; i--) {
			newArr[j] = arr[i];
		//	newArr[]arr.length-1-i] = arr[i];
			j++;
		}
		
		return arr;
	}
	
}
