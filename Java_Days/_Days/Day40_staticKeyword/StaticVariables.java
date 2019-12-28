package Day40_staticKeyword;

public class StaticVariables {

	static String name;
	static double staticNum;
	
	public static void method1() {
		System.out.println("Open the browser");
	}
	

	
	public static void main(String[] args) {
		
		StaticVariables obj1 = new StaticVariables();
			obj1.name = "Omer";
			
		StaticVariables obj2 = new StaticVariables();
			obj2.name = "Mahmut";
		System.out.println(   obj2.name  );
		
		System.out.println(   obj1.name  );

		// ===================================================
		
		System.out.println(StaticVariables.staticNum);
		
		StaticVariables object1 = new StaticVariables();
		
		object1.staticNum = 4.5;
		System.out.println(object1.staticNum);
		
		StaticVariables object2 = new StaticVariables();
		
		System.out.println(object2.staticNum);
		
		StaticKeyword.printHello();
		
	}
	
	
}
