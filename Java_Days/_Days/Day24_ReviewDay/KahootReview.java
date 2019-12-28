package Day24_ReviewDay;

public class KahootReview {

	public static void main(String[] args) {

		// 1.

//		boolean A= true, B=false;
//		
//		while(true) {
//			if (A!=!B) {
//				System.out.println("Cybertek");
//			}
//		}

		// 2.
		// will be an infinite loop
//		int x = 5; //4
//		do {
//			x--;
//			System.out.println(x+" "); // 4 3
//			++x;
//			
//		}while(x>0);

		// 3.
//		int x;
//		int y=5;
//		for(x=0; x<y; x++) {
//			System.out.print( x += 2 + " ");
//		}

		// 4.
		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 1; i < arr.length; i++) {
			System.out.println(arr[i]);
			break;
		}

		// 5.

		System.out.println();
		int xX = 10;
		for (int iI = 0; iI <= 5; iI++) {
			xX += iI;
		}
		System.out.println(xX);

		// 7.
		for (int jJ = 0; jJ <= 5; jJ++) {
			System.out.println(jJ + " ");
			break;
			// jJ+=2;
		}

		// 8.

		String str = "java";
		String strNew = new String(str);
		
		System.out.println(str == strNew); // different memory locations
		System.out.println(str.equals(strNew));
		
		int count = 10;
		do {
			count += 2;
		}while(str == strNew);
		System.out.println(count);
		
		//10.
		
		String strX = "    ";
		str.trim();
		int n1 = 0;
		
		while(str.isEmpty()) {
			n1 +=5;
			
			if(n1 == 20);
		}
		System.out.println(strX);
		
		}
		
		
	
}
