package Day35_ConstructorsContinued;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask_1 {

	/*
	 Warm Up: 
    1. write a return method that accepts an int array and returns it as an ArrayList
    2. write a return method that accepts an Integer array and returns the maximum number
            DO NOT USE SORT METHOD
    3. write a return method that accepts an Integer arrayList and returns the second maximum number
            DO NOT USE SORT METHOD
    

	 */
	
	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 50, 40, 34, 76, 85, 92, 38};
		ArrayList<Integer> list = Array2List(arr1);
		System.out.println(list);	
		
		Double[] arr2 = {1.0, 2.0, 5.0, 4.0, 3.4, 7.6, 8.5, 9.2, 3.8};
		ArrayList<Double> listD = Array2List(arr2);
		System.out.println(listD);
		
	}
	
	public static ArrayList<Integer> Array2List(int[] arr) {
		
		ArrayList<Integer> list = new ArrayList<>();
		// list.addAll(  Arrays.asList(arr))	wont work cuz primitive to integer not good
		
		for(int each : arr) {
			list.add(each);	// auto-boxing
		}
		
		return list;
	}
	
	public static ArrayList<Double> Array2List(Double[] dub){
		
		ArrayList<Double> list = new ArrayList<>();
		for(Double each : dub) {
			list.add(each);	// auto-boxing
		}
		
		return list;
	}
	
}
