package Day43_Review;

//	to import a single class import Day43_Review.StaticKeyword;

import Day43_Review.StaticKeyword;

public class Practice {

	public static void main(String[] args) {
		
		StaticKeyword.printName();
		// 	static methods can be called thru the class name
		
		// StaticKeyword.printName2();
		//	instance method cannot be called thru the class name

		Practice.printName();
		
		printName();	// this is same as the one above 
		
	}
	
	public static void printName() {
		System.out.println("Semra");
		//	first command wont print this because we are calling it from the class name
	}
	
}
