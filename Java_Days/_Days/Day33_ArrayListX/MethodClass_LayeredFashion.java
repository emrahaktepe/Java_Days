package Day33_ArrayListX;

public class MethodClass_LayeredFashion {

	
	public static void main(String[] args) {
		
	method1(); // method cannot call itself
	method2();	
	method3();
	
	}
	
	
	
	
	
	public static void method1() {
		System.out.println("A");
		method2();
	}
	
	public static void method2() {
		method1();
		System.out.println("B");
	}
	
	public static void method3() {
		method2();
		System.out.println("C");
	}
}
