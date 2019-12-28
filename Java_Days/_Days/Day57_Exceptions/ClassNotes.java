package Day57_Exceptions;

/*
 		Exceptions:	unwanted or unexpected events
 		
 		Exception is class that will be thrown when those unexpected
 		and unwanted events occurred
 		
 		there are two types of exceptions
 		
 		unchecked exception (unexpected):	exception that occurs during runtime
 		
 			int[] arr = {1, 2, 3};
			System.out.println(arr[100]);
			
			Selenium Ex:	nullpointer exception
							NoSuchElementException
							WebDriverException
							
							WebDriver driver = new FirefoxDriver();
							driver.get("URL")
 		
 			RunTimeException class is the parent class of all the unchecked exceptions
 			
 			All the runtime exceptions are unchecked, all the exceptions are not runtime are checked 
 		
 		
 		
 		checked exception (expected):	
 							occurs during the compile time
 							those exceptions that need to be handled immediately
 							because it will give compile error
 							
 					Ex:		Thread.sleep(1000);
 					
 					
 					
 		Actions act = new Actions(driver);
 		act.pause(3000).perform();
 		
 */


public class ClassNotes {

}
