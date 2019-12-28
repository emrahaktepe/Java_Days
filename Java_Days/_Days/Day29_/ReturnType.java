package Day29_;

import java.util.Arrays;

public class ReturnType {

//	returnType: void or other data-types (int, String, etc...)
//	if the return type is void, the method does not return a value
//	if the return type is not void, the method must return a value

	// return statement: it is used for exiting the method, we can
	// also use return statement to return a value from the method
	
//	 does not have "void" as return type
//	must retrun a value
//	the returning value must macth the return type of the method
	
//	return methods are either printed or assigned
	
	public static void method1() {
		System.out.println("Whassup Y'all\n");
	}

	public static String name() {
		return "Wassup Y'all";
	}
	
	public static boolean boo() {
		
		return true;
	}
	
	// write a method that accepts an int array and retuns the maximum number from the array
	public static int maxIntArr(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	
    public static String LongestWord(String[] arr) {
    	String longWord = "";
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i].length() > longWord.length()) {
    			longWord = "" + arr[i];
    		}
    	}
		return longWord;
    }
 
    public static int[] sort(int[] arr) {
    	Arrays.parallelSort(arr);
    	int[] numbers = new int[arr.length];
    	
    	int z = 0;
    	for(int i=arr.length-1; i>=0; i--) {
    		numbers[z] = arr[i];
    		z++;
    	}
    	return numbers;
    }
    
    
    

	public static void main(String[] args) {
		
		System.out.println(name());
		
		String str = name();
		
		method1();

		System.out.println(boo());
		
		int[] arr = {10, 20, 30, 2, 3, 4, 5};
		int maxNum = maxIntArr(arr);
		System.out.println(maxNum);
		
		String[] arr1 = {"emrah", "dinara", "munevver", "yusuf", "hatice", "djalaluddin", };
		System.out.println(LongestWord(arr1));
		
		int[] arr3 = {1,2,3,4,5,6,7};
		arr3 = sort(arr3);
		System.out.println(Arrays.toString(arr3));
	}
}
