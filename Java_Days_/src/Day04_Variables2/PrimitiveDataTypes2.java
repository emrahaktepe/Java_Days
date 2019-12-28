package Day04_Variables2;

public class PrimitiveDataTypes2 {

	/*
	 Primitives: byte, short, int, long, float, double, boolean, char
	 
	 boolean: takes either true or false boolean expressions
	 
	 char: declared within the single quote ''; single character only
	 '' is must when given a value
	 
	 */
	
	public static void main(String[] args) {
		
		//boolean resultX = Earth is Flat;
		//boolean num1 = 100; boolean only takes true or false results
		
		boolean result1=true;
		boolean result2=false;
		boolean result3=9>3;
		boolean result4=4>8;
		
		System.out.println(result3);
		System.out.println(result4);

		//char:
		
		char character1 = 'a';
	System.out.println(character1);
	
		char char2 = '9';
		char char3 = '#';
		System.out.println(char2);
		System.out.println(char3);

		char char4 = 126, char5 = 120, char6 = 33, char7 = 37; // only time we use '' for char is when we use a single character
		System.out.println(char4);
		System.out.println(char5);
		System.out.println(char6);
		System.out.println(char7);
		
		// initializing char to other primitives: byte, short, int, long, float, double
		
		char myChar1 = 'b';
				
		int myInt1 = myChar1;
		
		
		System.out.println(myInt1);
		
		// byte myByte1 = myChar1; //won't work because of the memory difference 
		byte myByte1 = 'b';
		System.out.println(myByte1);

		// short myShort1 = myChar1; char's memory could be bigger than short and the range is different even though both are 2 bytes

		short myShort1 = 'b';
		System.out.println(myShort1);
		
		long myLong1 = myChar1;
		System.out.println(myLong1);
		
		float myFloat1 = myChar1;
		System.out.println(myFloat1);
		
		double myDouble1 = myChar1;
		System.out.println(myDouble1);
		
		char myCharx = 2210;
		System.out.println(myCharx);
		
		float floatA = 10L;
		double doubleA = 10F;
		double DoubleB = 10L;
		int aintA = 10;
		double doubleC = 20;
		
		double num = 10l;
		float num1 = 10;

		int myNum = '9';
		System.out.println(myNum);
		
		
		
		
	}
	
}
