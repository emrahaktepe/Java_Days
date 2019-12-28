package Day56_Polymorphism;

/*
 		RemoteDriver implements WebDriver, JavaScriptExecuter, TakeScreenShot
 		
 		multiple reference name, 
 		
 		ChromeDriver extends RemoteDriver
 		
 		1. Upcasting: Always allowed
 			WebDriverdriver = new ChromeDriver();
 			
 			JavaScriptExecuter js = new ChromeDriver();
 			same browser we are automating the test case with. new window
 			
 			JavaScriptExecuter js = (JavaScriptExecuter) driver;
 				js.ExecuteScript("window.open()")
 			
 			TakeScreenShot tss = new ChromeDriver();
 			TakeScreenShot tss = (TakeScreenShot) driver;
 				tss.TakeScreenShotAs("");
 			
 		2. Downcasting:	not allowed
 			throws ClassCastException exception'
 			converting super type to sub type
 			
 			
 */

class Animal{
	
	public  void method1() {
		
	}
	
}

class Dog extends Animal{
	//	Dog IS An Animal
	public void method2() {
		
	}
	
	
}


public class UpCasting {
	
	public static void main(String[] args) {
		
		System.out.println( (double) 10 );
		
		//	UpCasting:	Casting subclass to the superior type
		Dog obj1 = new Dog();
		Animal obj2 = (Animal) obj1;
		
		obj2.method1();
		
		Animal obj3 = new Animal();
		
		Dog obj4 = (Dog) obj3;
		
	}

}
