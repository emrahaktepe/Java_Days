package Day60_ExceptionsReview;

public class ExceptionsContinued {

	public static void method2() {
		
		try {
			Thread.sleep(3000);
		}	catch (Exception e) {
			
		}
		
	}
	
	
	public static void method3() throws Exception{

		Thread.sleep(3000);
		System.out.println("step2");
		System.out.println("step3");

		Thread.sleep(3000);
		System.out.println("step4");
		System.out.println("step5");
		
		Thread.sleep(3000);
		
		try {
			int a = 10;
			System.out.println(a/0);
		}	catch(Exception e)	{
			
		}

	}
	
	public static void method4() throws RuntimeException{
		System.out.println(9/0);
	}

	
	
	
}
