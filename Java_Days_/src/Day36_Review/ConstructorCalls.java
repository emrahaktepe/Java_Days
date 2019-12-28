package Day36_Review;

public class ConstructorCalls {
	
	public ConstructorCalls() {
		
		System.out.println("A");
		
	}
	
	public ConstructorCalls(int a){
		//ConstructorCalls();
		
	//	System.out.println("B"); // constructor call has to be the first step in a constructor
		this();  // A
		System.out.println("B");
		
	}
	
	public ConstructorCalls(double a) {
		
		this(10);  // A B
		//this();    // one constructor can only call one constructor
		System.out.println("C"); // C
		
	}
	
	
	
	public static void main(String[] args) {
	//	ConstructorCalls();
		
		ConstructorCalls obj  = new ConstructorCalls( 10.5 );  // A B
		
	}
	

	

	
}

