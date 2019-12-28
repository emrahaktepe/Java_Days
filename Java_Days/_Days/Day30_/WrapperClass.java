package Day30_;

import java.util.Arrays;

public class WrapperClass {

	
	/*
	 Wrapper classes:
	 every primitive in java has a class that's designed to it
	 
	 Primitives: byte, short, int, long, float, double, boolean, char
	 Wrapper Classes: Byte, Short, Integer, Long, Float, Double, Boolean, Character
	 
	 default values of primitives:
	 byte, short, int, long ==> 0;
	 double, float ==> 0.0;
	 boolean  ==> false;
	 char ==> space
	 */
	
	
	public static void main(String[] args) {
		
		int numInt = 10;
		Integer numInteger = 10;
		
		double numdouble = 5.5;
		Double numDouble = 5.5;
		
		long numlong = 20L;
		Long numLong = numlong;	// auto boxing
		
		System.out.println(numlong);
		System.out.println(numLong);
		
		Boolean bResult = true;
		boolean bresult = bResult; // unboxing
		
		char ch1 = 'L';
		Character ch2 = ch1;	// auto boxing
		char ch3 = ch1;			// none
		char ch4 = ch2;			// unboxing
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);

		int[] arr = new int[3];
		System.out.println(Arrays.toString(arr));
		
		Integer[] arr1 = new Integer[3];
		System.out.println(Arrays.toString(arr1));
		
		Boolean[] arr2 = new Boolean[3];
		System.out.println(Arrays.toString(arr2));
		
		int num1 = 10;
		// num1.method(); primitives do not have methods, 
		
		Integer num2 = 20;
		int x = num2.MAX_VALUE;
		
		
		
		
		
		
		
		
		
		

	}
}
