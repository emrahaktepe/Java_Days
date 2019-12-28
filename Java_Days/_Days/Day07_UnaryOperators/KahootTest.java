package Day07_UnaryOperators;

public class KahootTest {
	
	public static void main(String[] args) {
		//question 1:
		
		int a = 30;
		int b = (byte) a;
		System.out.println(b);
		
		
		//question 2:
		// System.out.println(a+1) // line1
		// int b = 100;
		// System.out.println(b);
		
		//question 3:
		System.out.print("Result A " + 0+1);
		System.out.println("; Result B" + (1) + (2));
		// Result A 01; ResultB12
		
		//question 4:
		
	
		System.out.println("5 + 2 = " +3+4);
		
		//question 5:
		float fNum = 100.9876543f;
		short sNum = (byte) fNum;
		System.out.println(sNum);		
		
		//question 6:
		// byte bNum = 200; // byte's max capacity is 127
		
		int bNum = 200;
		int iNum = 2;
		System.out.println(bNum/iNum);
		
		//question7:
		
		System.out.println( (3+2) * 2 / 3 % 2);
							// 5 * 2 / 3 % 2
							// 10 / 3 % 2
		
		//question 8:
		// int a1 = 9, b1 = 0, c1 = a1/b1;
		// System.out.println(c1);
		
		
		//question 9:
		
		long lNum = 3_000l;
		double dNum = (float) lNum;
		int iNum1 = (short) dNum;
		System.out.println(iNum1 % 1000);
		
		
		//question10:
		
		double result1 = 10/3;
		System.out.println(result1);
		
		
		//question11:
		System.out.println(10/3.0);
		
		//question 12:
		//string str = "10.5"+ 3; // string of text
		// int inNum = (int) str;
		
		//question 13:
		
		int i1 = 10, i2 = 20, i3 = 30;
		i1 = i1%5; //0
		i2 = i2%5; //0
		i3 = i1*i2; //0
		
		System.out.print(i1 + "\t" + i2 + "\t" + i3);
		
		

	}

}
