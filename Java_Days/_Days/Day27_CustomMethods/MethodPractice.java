package Day27_CustomMethods;

public class MethodPractice {

	public static void removeDuplicates(String a) {
		String singles = "";
		for(int i=0; i<a.length(); i++) {
			if(!singles.contains(a.substring(i, i+1))) {
				singles += a.substring(i, i+1);
			}
		}
		System.out.print(singles + " ");
	}
	
	public static void main(String[] args) {	
	
		removeDuplicates("aabbddchhh");
	
		String dupls = "AAABBCCDDEEFFGGHHIJJKKLLMMNNOOPRRRSSSTTTUUUVVVWWWXXXYYYZZZ";
		
		removeDuplicates(dupls);
		
}
}