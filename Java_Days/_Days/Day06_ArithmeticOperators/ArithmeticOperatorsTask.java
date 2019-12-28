package Day06_ArithmeticOperators;

public class ArithmeticOperatorsTask {
	
	public static void main(String[] args) {
		
		System.out.println(5 + 2 * 4);
		System.out.println(10 / 2 - 3);
		System.out.println(8 + 12 * 2 - 4);
		System.out.println(4 + 17 % 2 -1);
		System.out.println(6 - 3 * 2 + 7 -1 +"\n");
		
		System.out.println((5+2) * 4);
		System.out.println(10 / (5 - 3));
		System.out.println(8 + 12 * (6-2));
		System.out.println((4+17) % 2 - 1);
		System.out.println((6 - 3) * (2 + 7) / 3 + "\n");
		
		int numbr1 = 46;
		int numbr2 = 90;
		System.out.println(numbr1 + "+" + numbr2 + "=" + (numbr1 + numbr2) + "\n");
		
		
		double c = 38;
		double f = 9 * c / 5 + 32;
		System.out.println(f);
		System.out.println("\n");
		
		int mile = 1;
		double km = mile * 1.609344;
		System.out.println(65 * km);
		
		System.out.println("\n");
		
		double radius = 5.5;
		double perimeter = 2 * radius * 3.14;
		double area = radius * radius * 3.14;
		System.out.println(area);
		System.out.println(perimeter);
		
		System.out.println("\n");

		double width = 4.5;
		double height = 7.9;
		area = width * height;
		System.out.println(area);
		
		System.out.println("\n");

	
		int aaa = 5;
		int bbb = 4;
		int ccc = 9;
		int ddd = (aaa+bbb+ccc)/3;
		System.out.println(ddd);
		
		System.out.println("\n");
		
		int pies = 10, people = 4;
		double piesPerson;
		piesPerson = pies / people;
		System.out.println(piesPerson);
		
		System.out.println("\n");

		short fN = 10;
		short sN = 20;
		int tN; // short won't work because when you are doing an arithmetic operation it temporarily converts to int
		tN = fN+sN;
		System.out.println(tN);
		

		
		
	}
	

}
