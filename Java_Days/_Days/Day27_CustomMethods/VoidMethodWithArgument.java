package Day27_CustomMethods;

public class VoidMethodWithArgument {
	
	/*
	 methods with arguments / parameters:
	 sometime method needs specific information to
	 perform its task, then we need to declare the
	 method with parameters
	 parameters can be any data type
	 Ex: Arrays.sort(arraysName)
	
	 access modifier   specifier   return-type  nameOfTheMethod(parameter){
		}
	 */

	
	


	
	public static void sumOfTwo(int a, int b) {
		System.out.println("Sum of " +a +" and " +b +" is " + (a+b));
	}
	
	
	public static void oddOrEven(int a) {
		if(a % 2 == 0)
			System.out.println(a + " is an even number");
		else
			System.out.println(a + " is an odd number");

	}
	
	public static void main(String[] args) {
		
		oddOrEven(65);
		
		// method is designed to take an argument
		// method needs an argument to perform its task
		// need to provide a vlue that can be assigned to that specific data type
		
		
		int z = 100/3;
		
		oddOrEven(z);
		
		sumOfTwo(17, 4);
		
		
	}
	
}
