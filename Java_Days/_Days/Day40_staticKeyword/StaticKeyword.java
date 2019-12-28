package Day40_staticKeyword;

public class StaticKeyword {

	// What can be static in Java?
	// 1. Static variables
	// 2. Static Methods
	// 3. Static Initializer Block
	// 4. Static Inner Class (Nested Class)

	// Instance Variables: created in the class outside any method.
	// belongs to the object. each object will have its own copy
	
	//	Local Variables: declared within the methods or blocks
	//	Only accessible within the method or block
	
	//	Static Variables: created in the class outside method with static keyword
	// When a variable is static, it is shared by class and all objects
	//	It can be called with the class name

	int a;
	
	static int b;
	
	public static void printHello() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {

		StaticKeyword obj1 = new StaticKeyword();
		obj1.a = 100;

		StaticKeyword obj2 = new StaticKeyword();
		obj2.a = 200;

		System.out.println(obj1.a);

		
		double num = 10.5;
		
		System.out.println(StaticKeyword.b);
		System.out.println(obj1.b);
		System.out.println(obj2.b);

		StaticKeyword obj3 = new StaticKeyword();
			obj3.a = 100;
		
		System.out.println(obj3.a);

		StaticKeyword obj4 = new StaticKeyword();
		
		System.out.println(obj4.a);
		
		obj3.b = 400;
		System.out.println(obj3.b);
		System.out.println(obj4.b);

		
		
	}
	
	public static void method1() {
		
		//	System.out.println(num);
		//	Local variable only visible within the method
	}

}
