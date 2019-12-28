package Day44_AccessModifiers;

public class Testdata {

	public static String Name = "Abuzer";
	public static String ID = "12345";
	public static String School = "Harvard";
	
	private static String Password = "deneme";
	
		static double salary = 100_000;	//	default access modifier
	
		static int age = 20;	//	access modifier is default
		
		protected double numbers = 3.5;
	
	public static void printHello() {
		System.out.println("Hello");
	}
	
}
