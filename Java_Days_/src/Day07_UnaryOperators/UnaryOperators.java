package Day07_UnaryOperators;

public class UnaryOperators {
	/*
	 +: positive
	 -: negative
	 ++: increment: increases the value by 1.
	 	pre increment: operator is placed before the variable 
	 	
	 	increases the value immediately
	 --: decrement: decreases the value by 1. 
	
	 + - ===> -
	 - - ===> +
	 + + ===> +
	*/
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = -10;
		System.out.println(b);
		
		int c = +b; // +(-10) ===> -10
		System.out.println(c);

		int d = -c; //-(-10) ===> 10
		System.out.println(d);
		
		int num = 100;
		System.out.println(num++);
		
		int intNum = 100;
		System.out.println(intNum ++);
		System.out.println(intNum);
		
		
		short sNum = 4;
		int rNum = sNum * 4 - sNum--;
		System.out.println(rNum);
		
		int W = 1;
		System.out.println(W = - W-- + W++ / -W-- * --W);
		//						post   post	 post	pre
		//                      -1   +   0 /  -1  * -1
							//   -1  +  0  *  -1
							//  -1 + 0
							//  -1
		
		int xyz = 25;
		System.out.println(++xyz);
		System.out.println(--xyz);
		
		int abc = 30;
		System.out.println(abc++);
		System.out.println(abc--);
		
		int x1 = 2;
		int y1 = x1++;
		System.out.println(y1);
		
		int x2 = 2;
		System.out.println(x2++);
		
		int x3 = 2;
		System.out.println(--x3);
		
		int x4 = 8;
		int y4 = x4--;
		System.out.println(y4);
		
		
		
		
	}

}
