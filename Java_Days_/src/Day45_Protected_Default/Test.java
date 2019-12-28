package Day45_Protected_Default;

import Day45_Inheritance.Protected_vs_Default;

public class Test extends Protected_vs_Default{
	
	public static void main(String[] args) {
		
		/*
		Protected_vs_Default obj = new Protected_vs_Default();
			obj.printHello();	// protected access modifier is not visible
			obj.printHola();	// default access modifier is not visible
		
		System.out.println(obj.name);
		System.out.println(obj.id);
		*/
		
		Test obj = new Test();
		System.out.println(obj.name);
		
	//	printHello();
	}
	

}
