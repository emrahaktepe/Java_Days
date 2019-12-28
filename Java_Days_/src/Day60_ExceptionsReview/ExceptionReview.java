package Day60_ExceptionsReview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionReview {
	
	public static void main(String[] args) {
		
		//	unchecked, compiler does not complain
//		throw new ClassCastException();	//line 1
		
		//	this one is a checked exception, compiler is not happy with it
//		throw new FileNotFoundException();	//line 2
		
		//	if line 2 was before line 1, later one would give a compile error
		//	first exception gives compile error, later ones do as well
		
		
		try {
			//FileInputStream file = new FileInputStream("path of file");
			Thread.sleep(3000);
			System.out.println("try block");
		}	catch	(InterruptedException e)	{
			System.out.println("catch block");
		}	finally	{
			System.out.println("finally block");
		}
		
		System.out.println("=======================");
		
		try {
		System.out.println(9/0);
		System.out.println("try block");

		}	catch	(ArithmeticException e)	{
			e.printStackTrace();
			System.out.println("catch block");

		}	finally	{
			System.out.println("finally block");
		}
		System.out.println("next test step");

		System.out.println("=======================");

		int [] arr = {1, 2, 3};
		
		try {
		System.out.println(arr[5]);
		}	catch (NullPointerException e)	{
			
		}	catch (ArrayIndexOutOfBoundsException e)	{
			
		}	catch (IndexOutOfBoundsException e)	{
			
		}	catch (Exception e)	{
			
		}
		
		
		
		
	}

}
