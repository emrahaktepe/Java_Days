package Day13_;

public class Day13 {

	public static void main(String[] args) {
		
		if(!true != !false) {
			System.out.println("Cybertek");
		}
		else {
			System.out.println("Something else");
		}
		
		System.out.println("= = = = = = = = = = = = = = = =");

		
		//Q2
		
		boolean resultA = 9>=9 || 10<=10,
				resultB = 'A' >= 128 && 'B' < 128;
				
				// resultA = true || true ===> true
				// resultB = false && true ===> false
		
		if(resultA) {
			if(resultB) {
				System.out.println(resultA);
			}
			else {
				System.out.println(resultB);
			}
		}
		
		System.out.println("= = = = = = = = = = = = = = = =");

		//Q4
		
		int num1 = 9;
		
		if(++num1 <10) {
			System.out.println("Hello World");
		}
		else {
			System.out.println("Hello Universe");
		}
		
		System.out.println("= = = = = = = = = = = = = = = =");

		//Q5
		
		int x =1, y=0;
		
		if(x++ > ++y) {
			System.out.println("Hello");
		}
		else {
			System.out.println("Welcome");
		}
		System.out.println(" Log "+x+"");
		
		
		System.out.println("= = = = = = = = = = = = = = = =");

		//Q6
		
		double y1 = 200;
		// float flt = y1;
		
		System.out.println("= = = = = = = = = = = = = = = =");

		//Q7
		
		boolean result = true;
		int N = 100;
		
		if(true) {
			System.out.println("one");
		}
		if(true) {
			System.out.println("two");
		}
		if(true) {
			System.out.println("true");
		}
		
		System.out.println("= = = = = = = = = = = = = = = =");

		//Q8
		
		boolean Result = true;
		int V = 100;
		if(Result) {
			V/=10; //N = 10
			Result = !Result; // Result = false
		}
		if(Result) { //false
			V*=2; //N = 10
			Result = !Result; // Result = false
		}
		else {
			V-=5; // V=10
		}
		System.out.println(V);
		
		
		System.out.println("= = = = = = = = = = = = = = = =");

		//Q9
		
		boolean Z = true;
		
		if(Z == false){
			System.out.println("one");
		}
		if(Z == false){
			System.out.println("One");
		}
		if(Z == false != true){
		//  true 	== true  ==>  true
			System.out.println("Two");
		}
		
		System.out.println("= = = = = = = = = = = = = = = =");

		//Q10
		
		int n1 = 'B'; // corresponding number of the character will be assigned
		if(n1>128 || n1<=128){
		// false || true ==> true
			System.out.println('B');
		}
		else {
			System.out.println('A');
		}
		
		
		
		
		
		
		
		
		
	}
	
}
