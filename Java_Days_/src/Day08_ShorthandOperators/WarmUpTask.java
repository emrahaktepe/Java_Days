package Day08_ShorthandOperators;

public class WarmUpTask {
	
	public static void main(String[] args) {
		
		int gallon = 1;
		double liter = gallon * 3.785; // converts gallon to liters
		String result1 = gallon + " gallon equal to " +liter+ " liter";
		System.out.println( result1 );
		
		double L = 1;
		double G = L/3.785;
		System.out.println(L + " liters equal to " + G + " gallons");
		
		//Task1:
		
		int x = 2;
		int y = x++;
		//post increment
		System.out.println(y+" "+x);
		
		System.out.println(" ");
		
		int x2 = 2;
		System.out.println(x2++);
		System.out.println(x2);
		
		System.out.println(" ");

		int x3 = 2;
		System.out.println(--x3);
		
		System.out.println(" ");
		
		int x4 = 8;
		int y4 = x4--;
		System.out.println(y4);
		System.out.println(x4);
		System.out.println(y4);


		int P = 222;
		int R = 111;
		boolean S = P > R;
		System.out.println("First number " + P + " greater than the second number " + R + " " + S);
		
		
		
	}

}
