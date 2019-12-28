package Day34_;

public class ConstructorPractice {

	
	//default constructor
	public ConstructorPractice() {
		
	}
	
	public ConstructorPractice(int num) {
		System.out.println("This is a constructor with a parameter of int: " + num);
	}
	
	public static void main(String[] args) {
		
		ConstructorPractice obj = new ConstructorPractice();
		// default (no-arg) constructor is given by default, when there is no other constructor given
		
		ConstructorPractice obj2 = new ConstructorPractice(8);

		method1();
	}
	
	public static void method1() {
		System.out.println("Regular Method");
	}
}
