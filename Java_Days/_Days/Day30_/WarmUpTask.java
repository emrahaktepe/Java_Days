package Day30_;

public class WarmUpTask {

	
	public static void main(String[] args) {
		
		
		String str2 = uniqValue("AABBCCCDEF");
		System.out.println(str2);
		
	}
	
	public static String uniqValue(String str) {
		
		String result = "";
		for(int j=0; j<str.length(); j++) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == str.charAt(j)) {
				count++;
			}
		}
		if(count == 1) result += ""+str.charAt(j);
		}
		return result;
	}
}
