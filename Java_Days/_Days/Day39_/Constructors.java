package Day39_;

public class Constructors {

	public Constructors() {
		System.out.print("Erhan ");	
	}

	public Constructors(int a) {
		this();	// Erhan
		System.out.print("Ali ");	
	}
	
	public Constructors(double a) {
		
		this(100);	// Erhan Ali
		System.out.print("Shawkrat ");
	}
	
	public Constructors(boolean a) {
		
		this(2.5);	// Erhan Ali Shewkrat
		System.out.print("Dinara ");
	}	
	
	public Constructors(String a) {
		
		this(100);	// Erhan Ali Seyfo
		System.out.print("Seyfo ");
	}
	
	public static void main(String[] args) {
		
		Constructors obj = new Constructors(9<10);
		
		
	}
	
	
	
}
