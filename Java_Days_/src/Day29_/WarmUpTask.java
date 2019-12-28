package Day29_;

public class WarmUpTask {

	// Write a method that can find the frequency of characters in a String
	//
	// Ex: input: XXXYYYZZZ
	// output: X3Y3Z3

	public static void main(String[] args) {
		
		String str = "AAABBBCCDEEEEEE";
		
		String rmvDups = "";
		
		for(int i=0; i<str.length(); i++) {
			if(!rmvDups.contains(str.substring(i, i+1))) {
				rmvDups += (str.substring(i, i+1));
			}
		}
		System.out.println(rmvDups);
		
		String result = ""; // to store the expected result
		
		
		for(int j=0; j<rmvDups.length(); j++) {
			int count = 0; // count the frequency or repeat numbers of each char
			for(int i=0; i<str.length(); i++) {
				if(str.substring(i, i+1).equals(rmvDups.substring(j, j+1)))
				count++;
		}
		result += (rmvDups.substring(j, j+1) + count)+" ";
	}
		System.out.println(result);
	}

	public static void freqStr(String a, int b) {

		String result = a + b;

		for (int i = 0; i < a.length(); i++) {
			result += a.charAt(i);
		}

	}

}
