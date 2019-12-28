package Day58_Exceptions;

public class Exception_ {
	
	public static void main(String[] args) {
		
		try {
			Thread.sleep(2000);
			System.out.println(9/0);
			System.out.println("try block");
		}	catch (Exception e) {
			System.out.println("catch blok");
		}	finally	{
			System.out.println("finally block");
		}
		
		
		System.out.println("================================");
		
		try {
			Thread.sleep(2000);
			System.out.println("try block");
		}	catch (Exception e) {
			System.out.println("catch blok");
		}	finally	{
			System.out.println("finally block");
		}
		
		
	}

}
