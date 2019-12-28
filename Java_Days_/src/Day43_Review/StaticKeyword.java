package Day43_Review;

public class StaticKeyword {

	public String instName = "Filiz";
	public static String staName = "Abuzer"; 
	public static void printName() {
	//	System.out.println(instName);	// static only calls static 
		
		System.out.println(staName);  	// static only accepts static
	}
	
	
	public void printName2() {	// this is an instance method
								// there are objects 
		
		System.out.println(instName); 	//	class members are always accepted
		System.out.println(staName);
	}
	
	
}
