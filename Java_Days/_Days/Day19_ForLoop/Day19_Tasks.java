package Day19_ForLoop;

public class Day19_Tasks {
	
	public static void main(String[] args) {
		
		/*
			Task01: print the squares of numbers from 1 to 10
 
		 */

		for(int c = 1; c <= 10; c++) {
		System.out.println("the square of " + c + " is " + c*c);
		}
		
		// Task02
		
		for(int d=1; d<=32; d++) {
			if(d % 2 == 0)
			System.out.print(d +" ");
		}
		
		System.out.println();
		// Task03
		
				for(int d=1; d<=32; d++) {
					if(d % 2 != 0)
					System.out.print(d +" ");
				}
				
				System.out.println();
	
				
				
//		String str = "Java";
//		String rev = "" + str.charAt(3) + str.charAt(2)+ str.charAt(1)+ str.charAt(0);
//		System.out.println(rev);
//		
//		String rev2 = "";
//		for(int i = 10; i >= 0; i--) {
//			rev2 += str.charAt(i);
//		}
//		System.out.println(rev2);

				
				String str = "Java is fun";
				String rev = "" + str.charAt(3) + str.charAt(2)+ str.charAt(1)+ str.charAt(0);
				System.out.println(rev);
				
				String rev2 = "";
				for(int i = str.length()-1; i >= 0; i--) {
					rev2 += str.charAt(i);
				}
				System.out.println(rev2);
		
	}

}
