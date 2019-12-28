package Day23_Arrays;

public class WarmUpTask_2 {

	public static void main(String[] args) {

		String str = "AAABCDEEFF";
		String strNew = "";

		for (int j = 0; j < str.length(); j++) {
		
		int count = 0; // count how many times the character appears in the string
		
		for (int i = 0; i < str.length(); i++) {
						// highest value of i: str.length()-1;
			if (str.substring(i, i+1).equals(""+str.charAt(j))) {
				count++;
			}
		}

		
		if(count == 1) {
			strNew += ""+str.charAt(j);
		}
		}	
		System.out.println(strNew);

	}

}
