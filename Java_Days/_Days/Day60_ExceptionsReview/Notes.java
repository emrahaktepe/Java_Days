package Day60_ExceptionsReview;

/*
 		
	checked exception:		exceptions that happen during compile time.
							unwanted code, compiler is not happy with, compile error
							Must be handled immediately
							Ex:	FileNotFoundException
								InterruptedException
								IOException
 								
 	unchecked exception:	exceptions that occur during runtime
 							unexpected event
 							All the unchecked exceptions are under RunTimeException
 							
 							Ex:	NoSuchElementException
	 							WebDriverException
	 							TimeOutException
	 							StaleElementException
 							
 	1-	try & catch blocks:	used for handling exceptions
 	
 			try{
 				exception code;
 				}	catch (exception e)	{
 				statements;
 				}	finally {
 				statement;
 				}
 		
 		try block gets executed if the exception is checked exception.
 		
		catch clock gets executed if unexpected event occurs
		
		finally block always gets executed
		
	multi-catch blocks:	
	condition:	parent exception type cannot be before sub exception type
				cannot be conflicting exceptions
				
	
			try{
			
			}	catch(Exception1 e)	{
			
			}	catch(Exception2 e)	{
			
			}
			
 		Ex:	try{
 				}	catch (RuntimeException e)	{
 				}	catch (Arithmetic Exception) {
 				}
 				compile error, parent exception type needs to be after the sub exception
 				
 			try{
 				}	catch (NullPointerException e)	{
 				}	catch (ClassCastException Exception) {
 				}
 				
 		//	if the exception is checked, we should not be suing multi-catch block
		//	checked exceptions must be handled immediately
		
	throws keyword:	used for exception handling 
	
	Must be used with method signture
	
		public void main
 				
 				
 				
 				
 				
 				
 				
 				
 				
 */

public class Notes {

}
