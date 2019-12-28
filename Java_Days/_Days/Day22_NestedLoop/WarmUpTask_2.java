package Day22_NestedLoop;

import java.util.Scanner;

public class WarmUpTask_2 {
	
	/*
	 abba == abba ==> palindrome
	 */
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a word to check palindrome");
	String original = scan.nextLine();

	
//	String original = "ey edip adanada pide ye";
			// index:  0123456
	// reverse index 6543210
	String reverse = ""; // "gfedcba"
	
//	for(int i = original.length()-1; i >= 0; i--){
//		//	initialization			condition	iterator
//		// reverse += original.substring(i, i+1);
//		reverse += original.charAt(i);
//	}
	
	
	int i = original.length()-1;
	while(i >= 0) {
		reverse += original.charAt(i);
		i--;
	}
		
	
	
	
	
	boolean result = original.equals(reverse) ? true :false;
 	
	System.out.println(result);
	
	
	
	
	
}
}
