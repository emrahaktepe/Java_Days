package Day28_;

public class WarmUpTask_2 {

	/*
	 	1. Create a method that can divide two numbers without using division operators.
        
		2. Write a method that check if a string is build out of the same letters 
		     as another string.
		     
		3. Write a method that returns max value out of array of integers.
		 	DO NOT use sort method
		    Ex: int[] arr = {2,3,4};      max(arr) -> 4
		            
		4. Write a method that can find the unique characters from the String
		    Ex:         unique("AAABBBCCCDEF") ==> "DEF";
		
		5. Write a method that can rverse the a String
		    Ex: Reverse("ABC") ==> CBA
	 */
	
	public static void main(String[] args) {
		
		divDiv(20, 5);
		
		strReverse("deneme");
		
		onlyOnce("AAABBBCCCDEF");
		
		unqChars("AAABBBCCCDEF");
		
		
	}
	
	// Task 1
	public static int divDiv(int a, int b) {
		int bigger = (a>b) ? a : b;
		int smaller = (a<b) ? b : a;
		
		int count = 0;
		
		while(bigger >= smaller) {
			bigger -= smaller;
			++count;
			
		}
		return count;

	}
	
	// Task 4
	public static void onlyOnce(String a) {
		String unq = "";
		for(int i=0; i<a.length(); i++) {
			if(!unq.contains(a.substring(i, i+1))) {
				unq += a.substring(i, i+1);
			}
		}
		System.out.print(unq);
		System.out.println("\n");
	}
	
	// Task 4
		public static void unqChars(String b) {
			String unq1 = "";
			for(int i=0; i<b.length(); i++) {
				if(b.indexOf(i) == b.lastIndexOf(i)) {
					unq1 += b.charAt(i);
				}
			}
			System.out.print(unq1);
			System.out.println("\n");

		}
	
	// Task 5
	public static void strReverse(String str) {
		for(int i=str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("\n");
	}
	
}
	

