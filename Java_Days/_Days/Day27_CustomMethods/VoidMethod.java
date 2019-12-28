package Day27_CustomMethods;

public class VoidMethod {

	/*
	 
	 decleration of method:
	 access-modifier   specifier   return-type   methodname() {
	 statements
	 }
	 
	 */
	
public static void myFirstMethod() {
	
	// method is grouping a series of statements to perform specific task
	// benefits; reusable, avoids duplication
		
		System.out.println("Hello World");
		System.out.println("Hello Africa");
		System.out.println("Hello Cybertek");
	}
	
	public static void even1to100() {
		for(int i=0; i<100; i++) {
			if(i%2!=0) {
				continue;
		}
			System.out.print(i+" ");
			}
		
	}
	
	
	public static void main(String[] args) {
		
		myFirstMethod();
		
		even1to100();
		
	}
	

	
	
	
	
	
}
