package Day06_ArithmeticOperators;

public class PrimitivesCasting {

	/*
	 casting: converting the primitive to smaller size
	 	dataType variableName = value
	 primitives: byte, short, int, long, float, double
	 

	 
	 
	 
	 */
	
	public static void main(String[] args){
		int a = 10;
		int b = (byte) a; //explicit casting
		System.out.println(b);
		
		double decimalNumber = 10.5;
		float floatNumber = (int) decimalNumber;	//double > float	
		System.out.println(floatNumber);
		
		long longNum = 300l;
		//int intNum = (int) longNum;
		int intNum = (short) longNum;
		System.out.println(intNum);
		
		//implicit casting
		
		byte byteNum = 100;
		int intNum2 = byteNum;
		int intNum3 = (int) byteNum;
		System.out.println(intNum3);
		
		short shortNum = 100;
		long longNum2 = shortNum;
		//same as:
		long longNum3 = (long) shortNum;
		System.out.println(longNum2);
		
		//explicit casting practices:
		
		double largestNum = 100.8765;
		byte byteNum1 = (byte) largestNum;
		System.out.println(byteNum1);
		
		float floatNum1 = (float) largestNum;
		float floatNum2 = (byte) largestNum;
		float floatNum3 = (int) largestNum;
		float floatNum4 = (short) largestNum;
		float floatNum5 = (long) largestNum;


		System.out.println(floatNum1);
		System.out.println(floatNum2);
		System.out.println(floatNum3);
		System.out.println(floatNum4);
		System.out.println(floatNum5);
		
		float floatNum6 = 500.67f;
		int myNum3 = (short) floatNum6;
		System.out.println(myNum3);
		
		// int Numb1 = 200;
		// int Numb2 = 300;
		// int Numb3 = 400;
		
		int Numb1=200, Numb2=300, Numb3=400;
		System.out.println(Numb1 + Numb2 + Numb3);
		System.out.print(Numb1 +"\t" +Numb2 +"\t" +Numb3);
		
		boolean result;
		// System.out.println(result); //local variables must be initialized (defined) before used
		
		char character1 ;
		// System.out.println(character1);
		
		boolean result1, result2, result3;
		// System.out.println(result1);
		
}		
}
