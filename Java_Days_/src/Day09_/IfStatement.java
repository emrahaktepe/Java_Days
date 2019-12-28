package Day09_;

public class IfStatement {
	
	/*
	 
	 if statements:
	 single if statement:
	 if( boolean expression ){
	 	some codes to run
	 }
	 
	 if block is only executed if the condition is true
	 
	 */
	
	public static void main(String[] args) {
		
		if(9<10) {
			
			System.out.print("Hello ");
			System.out.print("Happy Friday ");
			System.out.print("Tomorrow is a day off");
			System.out.println(" class starts back on Monday!");

		}
			
	int a = 1000;
	
	if( a++ == 1001 ) {
		a = 2000;
		System.out.println("a is increased");
	}
		
		System.out.println(a);
		
	
	int b = 1000;
		
	if( b == 1000 ) {
		b = 2000;
		System.out.print("b is increased to ");
		}
			
			System.out.println(b+"\n\n\n");
			
	int c = 987654320;
	if( c%2 == 0) {
		System.out.print(c)
	;
		System.out.println(" is an even number");		
	}
			
	if( c%2 != 0) {
		System.out.print(c)
	;
		System.out.println(" is an odd number");		
	}		
			
	int d = 2345678;
	
	if (d % 5 == 0) {
		System.out.print(d + " can be divided by 5");		
	}
	
	if (d % 5 != 0) {
		System.out.println(d + " cannot be divided by 5");		
	}
		
	String CEO = "Main Boss";
	String Kuzzat = "Main Boss";
	System.out.println(CEO == Kuzzat);  //true
	
	if(Kuzzat == CEO) {
		System.out.println("Great person in general");
		System.out.println("First");
	}		
	if(Kuzzat != CEO) {
		System.out.println("Great person in general");
		System.out.println("Second");
	}
	
	double tN = 100;
	boolean Cybertek = true;
	boolean BestSchool = true;
	
	if(Cybertek == BestSchool) {
		tN += 500;
	}
	
	if(Cybertek != BestSchool) {
		tN -= 50;
	}
	
	System.out.println(tN);
	
	}

}
