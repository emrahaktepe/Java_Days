package Day22_NestedLoop;

public class NestedLoopNew {

	public static void main(String[] args) {

		/*
		 *
		 ***
		 ****
		 *****
		 ******
		 */

		for (int j = 1; j <= 10; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

//	for(int i = 1; i<=2; i++) {
//		System.out.print("*");
//	}
//	System.out.println();	
//		
//	for(int i = 1; i<=3; i++) {
//		System.out.print("*");
//	}
//	System.out.println();	
//	 for(int i = 1; i<=4; i++) {
//		System.out.print("*");
//	}
//	System.out.println();	

	for(int j=1; j<=10; j++) {

		for (int i = 10; i >= j; i--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}