package Day45_Protected_Default;


class A{
	
	public static void methodA() {
		System.out.println("A");
	}
	
	public static void main(String[] args) {
//		methodB();	//	super class cannot inherit anything from sub class
//		methodC();
	}
	
}

class B extends A {
	
	public static void methodB() {
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		methodA();
	}
	
}

public class InheritanceReview extends A{

		
	public static void methodC() {
		System.out.println("C");
	}
	
	public static void main(String[] args) {
	
		methodA();
	//	methodB();
		methodC();
		
	}
	
	
	
}
