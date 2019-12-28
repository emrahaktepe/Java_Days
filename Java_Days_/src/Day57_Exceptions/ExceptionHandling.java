package Day57_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int[] arr = {100, 200, 300};
		
		try {
			System.out.println(arr[5]);
			System.out.println("Try block, Checked Exception");
		} catch	(ArrayIndexOutOfBoundsException e)	{
			System.out.println("catch block, unexpected exception");
		}
		
		
		try{
			Thread.sleep(2000);
			System.out.println("Try block, checked exception");
		}	catch(InterruptedException e) {
			System.out.println("catch block, unexpected exception");
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(1,2,3));
		
		try {
			System.out.println(list.get(10));
			System.out.println("Try block, Checked Exception");
		}	catch (IndexOutOfBoundsException e) {
			System.out.println("catch block, unchecked exception");
		}
		
		//parent exception can handle all the child class exceptions
		
		int[] nums = {2, 4, 6, 8};
		try {
			System.out.println(nums[10]);
		}	catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Checked Exception");		
		}
		
	}
	
	public static void method(String kfc) {
		
	}
	
}
