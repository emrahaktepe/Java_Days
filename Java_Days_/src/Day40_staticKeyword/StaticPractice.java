package Day40_staticKeyword;

public class StaticPractice {
	
	//	Today's summary:
	//	1. static is shared by class and all other objects
	//	2. there can be only one copy for the static variable
	//	3. each objects has its own copy of instance variable
	//	4. static members can be called through the class name
	//	5. static methods only accept static members
	//	6. in order to call non static method in a static method it must be called through the object.
	
    static long num1;
    long num2;

public static void main(String[] args) {
 
 System.out.println( num1 );
 System.out.println( StaticPractice.num1 ); 
 
//  System.out.println( num2 );
//  System.out.println( staticPractice.num2 );
 
 
 StaticPractice.method1();
 
 // staticPractice.method2();
 
 StaticPractice obj = new StaticPractice();
     obj.method2();
     
     obj.method1(); 
}


public static void method1() {
 System.out.println("A");
}

public void method2() {
 System.out.println("B");
}
}
