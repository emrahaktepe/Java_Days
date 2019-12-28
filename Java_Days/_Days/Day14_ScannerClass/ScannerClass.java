package Day14_ScannerClass;

import java.util.Scanner;

public class ScannerClass {

		// it is a class that provides the methods to get user inputs
		//scanner class presented in package "java.util" 
		
		// in order to use the scanner class, it has to be imported
		// import java.util.scanner;
		
		// import statement must be placed between package and className
		
		// Scanner plus variableName = new Scanner(System.in)
		
		
		  public static void main(String[] args) {
			    
			  Scanner scan = new Scanner(System.in);
			   System.out.println("Enter vehicle's year:");
			   int vehicleYear = 0;
			   
			   if(vehicleYear<=1998 && vehicleYear >=1995){
				   System.out.println("Your vehicle needs to be recalled!");
			   }
			   if(vehicleYear<=2002 && vehicleYear >=2001){
				   System.out.println("Your vehicle needs to be recalled!");
			   }
			   if(vehicleYear<=2006 && vehicleYear >=2004){
				   System.out.println("Your vehicle needs to be recalled!");
			   }
			   if(vehicleYear<=2017 && vehicleYear >=2015){
				   System.out.println("Your vehicle needs to be recalled!");
			   }
			   else{
				   System.out.println("Your vehicle is fine, enjoy!");
			   }
		
			    }
	

			    
	
	
	
}
