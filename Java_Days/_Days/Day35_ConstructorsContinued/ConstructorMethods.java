package Day35_ConstructorsContinued;

public class ConstructorMethods {

	/*
	Constructor:
			1- Every single class MUST have a constructor
			2- If we don't define a cunstructor, compiler will give the default constructor
			3- Execution depends on the creation of the object
			
	create object from a class:
	ClassName obj = new 
			
	Declaration of Cunstructor:
			access-modifier		className(){
			}
			
			there is no return type
			there is no specifier
			constructor name MUST be same with the class name
			constructor can overload
			
	Constructor call:
			1- only a constructor can call another constructor
			2- constructor cannot be called by their name, 
			3- constructor call has to be the priority
				constructor call has to be the first statement 
			4- One constructor can only call one other constructor
			5- Constructor cannot call itself
	 */
	
	public ConstructorMethods(int a) {
		
		System.out.println("constructor with an int argument " + a);
		
	}
	
	public ConstructorMethods(boolean a) {
		
		//	ConstructorMethods(9);	//constructor cannot be called by the name
		
		this(100);
		
		System.out.println("constructor with a boolean argument " + a);
		
	}
	
	public static void main(String[] args) {
	
		//	ConstructorMethods obj = new ConstructorMethods("Hello");
		// wont work
		
//		ConstructorMethods obj1 = new ConstructorMethods();
			// wont work
		
		ConstructorMethods obj2 = new ConstructorMethods(true);
	}
	
	public static void method1() {
		
	}
}
