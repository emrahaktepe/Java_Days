package Day06_ArithmeticOperators;

public class AritmeticOperators {

	/*
	  + : addition, adds two or more numbers together
	  - : subtraction, subtracts a number from another number
	  * : multiplication, multiplies
	  / : division, divides
	  % : remainder: 
	 */
	
	public static void main(String[] args) {
	
		int a = 100;
		int b = a-400;
		System.out.println(b);
		
		int c = a + b;
		System.out.println(c);
		
		
		int x=3, y=5, z=x*y;
		System.out.println(z);
		
		double length = 100, width = 10, area = length * width;
		System.out.println(area);
		
		System.out.println(3 + 5 + 4 - 2);
		
	//System.out.println(3/0); denaminator cannot be Zero
		
		short Number1 = 10/3;
			System.out.println(Number1);
			
		double dNumber1 = 10/3f;
			System.out.println(dNumber1);
	
		int output = 12 + 6 / 3;
		System.out.println(output);
			
		int output1 = 5 + 4 * 2;
		System.out.println(output1);
		
		int rslt1 = 10%3;
		System.out.println(rslt1);
		
		System.out.println( 12%5);
		
		/*
		 20, 45, 65, 67, 68
		 even: can be divided by 2 without a remainder
		 odd: devided by 2 will have remainder
		 */
		
		int numb20 = 20 % 2;
		int numb45 = 45 % 2;
		int numb65 = 65 % 2;
		System.out.println(numb20);
		System.out.println(numb45);
		System.out.println(numb65);
		
		System.out.println(4 + 17 % 2 - 1);

		System.out.println(6 - 3 * 2 + 7 - 1);
// first come first serve except the VIP. VP: () , % , / , *

		System.out.println(1 + 2 - 2 + 3); //4
		System.out.println(1 + 2 - (2 + 3)); //2

		System.out.println(3+4*4+5*(4+3));
		
		System.out.println((4+17) %2 - 1);
		
	}
}
