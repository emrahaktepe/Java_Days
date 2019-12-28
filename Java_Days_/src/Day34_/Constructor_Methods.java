package Day34_;

public class Constructor_Methods {

	/*
	 methods: 
	 access-modifier	specifier	return-type	 methodName(parameter)
	 
	 constructor: it is a very special method, used for creating the object of the class
	 
	 every single class MUST have a constructor,
	 if we did not give the constructor, then the compiler will give
	 the default (no-arg) constructor
	 
	 constructor cannot have return type and specifier
	 constructor's name MUST be same with the class name
	 
	 declaration of constructor:
	 	access-modifier	className( parameter ){
	 		statements;
	 }
	 
	 default constructor (constructor without arg):
	 access-modifier	className(){
	 }
	 
	 constructor calls:
	 only a constructor can call another constructor
	 
	 constructor's execution depends on the creation of the object
	 
	 create an object from a class:
	 className referenceName = new existingConstructor
	 
	 if we want to have more than one constructor, we must overload the constructor
	 
	 when we create objects from a class we MUST use an existing constructor
	  
	 */
	

	public Constructor_Methods() {
		
		System.out.println("Hello World");
		System.out.println("I am a default constructor");

	}
	
	public Constructor_Methods(int num) {
		
		System.out.println("Hello World");
		System.out.println("I am a default constructor with an argument of: " + num);

	}
	
	public Constructor_Methods(char ch) {
		
		System.out.println("Hello World");
		System.out.println("I am a default constructor with an argument of: " + ch);

	}
	
	public Constructor_Methods(float d) {
		
		System.out.println("Hello World");
		System.out.println("I am a default constructor with an argument of: " + d);

	}
	
	public static void main(String[] args) {
		
		// Constructor_Methods obj = new Constructor_Methods("A");
		//		object was not created with existing constructor
		
		Constructor_Methods obj = new Constructor_Methods();
		
		System.out.println("\n");
		Constructor_Methods obj1 = new Constructor_Methods(8);
		
		System.out.println("\n");
		Constructor_Methods obj2 = new Constructor_Methods('A');
		
		System.out.println("\n");
		Constructor_Methods obj3 = new Constructor_Methods(75.5f);
	}
	
	
	
}
