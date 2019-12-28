package Day45_Inheritance;

class TestBase{
	
	static String ChromeDriver;
	
	public static void TakeScreenShot() {
		System.out.println("Take a screenshot");
	}
	
	private static void closeBrowser() {
		System.out.println("Browser closed");
	}
	
}

class D extends TestBase{
	// sub		// super
	
}

public class Inheritance_ extends TestBase {
			   // sub			  // super
	//	sub class is going to inherit all the visible and protected features from the super class
	/*
	 	Inheritance:	used for building relationships between classes. 
	 	it builds super and sub relationship between classes.
	 	we use "extends" keyword to build super or sub relationship
	 	
	 			public class A extends B
	 						sub		 super
	 						
	 	sub class (A): it is also called child class.
	 	sub class can inherit the visible and protected features that super class has					
	 			visible: public, default			
	 	
	 		features that have public or protected access modifiers can be inherited anywhere. 
	 		even outside the package.
	 		
	 		features that have default access modifier can be inherited within the package
	 		
	 		features that have private access modifier can never be inherited.
	 	
	 	super class (B): it is also called parent class
	 	super class does not inherit any feature from the sub class
	 	
	 	one class can only extends to one class
	 	one class can be extended by multiple classes / one super can have multiple subs
	 	
	 	benefit of inheritance: 
	 		1-	reusability
	 		2-	easy to maintain
	 		
	 	POM: page object module
	 						
	 */
	
	public static void main(String[] args) {
		
		System.out.println(ChromeDriver);
		
		TakeScreenShot();
		
		
		
	}
	
}
