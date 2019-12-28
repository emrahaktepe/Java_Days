package Day21_WhileLoop;

public class _WarmUpTask2 {

	//writw a java program that can remove duplicated
	//values from the String
	// input: aabbcc		output: abc
	
	
	public static void main(String[] args) {
		
		String s1 = "aaaaaabbbbbbbccccccccdddddd";
		String s2 = ""; //abc
		
		for(int i=0; i < s1.length(); i++) {
			if(!s2.contains(s1.substring(i, i+1))) {
				s2 += s1.substring(i, i+1);
			}
		}
		System.out.println(s2);
		
		
		String S1 = "aaaaaabbbbbbbccccccccddddddeeeeee";
		String S2 = ""; //abc
		
		for(int i=0; i < S1.length(); i++) {
			if(!S2.contains(""+S1.charAt(i))) {
				S2 += S1.substring(i, i+1);
			}
		}
		System.out.println(s2);
		
		
	}
	
}
