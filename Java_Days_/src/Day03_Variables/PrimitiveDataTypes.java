package Day03_Variables;

public class PrimitiveDataTypes {
	/*
	 byte: we can assign numbers. -128 and 127
	 short: we can only assign whole numbers. Must be within -32.768 and 32767
	 int:(used more often) we can only assign whole number. Must be within 
	 long; we can only assign whole numbers
	 		at the end of the value we can use l or L
	 		byte < short < int < long
	 		small one can be assigned to a larger one
	 		
	 float: we can assign decimal numbers
	 	must have f or F at the end of the value
	 	
	 	double (used more often): We can assign decimals
	 	
	
	 */
public static void main(String[] args) {
	
	byte length = 3;
	System.out.println(length);
	
	byte width = 5;
	System.out.println(width);
	
	// byte 9num = 100; variables names must start with a~z, or A~Z
	
	byte num_and$ = 1;
	
	// byte length = 6; variabla name must be unique
	
	byte Public = 10; //variable names cannot be java reserved words
	
	// byte myNum1 = -129
	byte myNum2 = 127; 
	
	// short _num2 = &; we can only assign whole numbers
	
	short myNum3 = 10000;
	
	int myNum4 = 1000000;
	
	int myNum5 = 1_000_000_000; //easier to read - just like in accounting
	System.out.println(myNum5);
	
	long longNumber = 10L;
			
	short shortNumber2 = 18;
	// byte byteNumber2 = shortNumber2; short's byte size is bigger than byte's
	
	int intNumber = -19876;
	long longNumber2 = intNumber; 
	// left side of the = has to be equal or greater than the right side of =
	
	short shortNumber3 = -30000;
	short shortNumber4 = shortNumber3;
	System.out.println(shortNumber4);
	
	//int exampleNumber1 = 10.5;
	float exampleNumber2 = 10.5F;
	float exampleNumber3 = 10.5f;
	
	double doubleNumber = 10.5;
	
	double doubleNumber2 = 30.9;
	// float floutNumber = doubleNumber2; double data type is larger then float data type
	
	System.out.println("=========================");
	byte bNum = 10;
	short sNum = 20;
	int iNum = 30;
	long lNum = 40;
	System.out.println(bNum);
	System.out.println(sNum);
	System.out.println(iNum);
	System.out.println(lNum);
	System.out.println();
	
	float fNum1 = bNum;
	float fNum2 = sNum;
	float fNum3 = iNum;
	float fNum4 = lNum;
	System.out.println(fNum1);
	System.out.println(fNum2);
	System.out.println(fNum3);
	System.out.println(fNum4);
	System.out.println();
	
	double dNum1 = bNum;
	double dNum2 = sNum;
	double dNum3 = iNum;
	double dNum4 = lNum;
	System.out.println(dNum1);
	System.out.println(dNum2);
	System.out.println(dNum3);
	System.out.println(dNum4);
	System.out.println();
}
}
