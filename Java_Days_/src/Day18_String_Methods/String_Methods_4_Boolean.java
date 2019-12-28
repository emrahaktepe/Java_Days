package Day18_String_Methods;

public class String_Methods_4_Boolean {
	
	public static void main(String[] args) {
		
/*
 isEmpty(): checks if the String is empty
 returns boolean expression
 empty ==> true && !empty ==> false
 */
			
		String str = "Menemen";
		boolean R1 = str.isEmpty();
		System.out.println(R1);	
			
		
		String str2 = "";
		if(str2.isEmpty()) {
			System.out.println("it is an empty String");
		}
		else {System.out.println("it is not empty");
		}
		
/*
 equals(): checks if two String's face values
 are equal or not
 */
		
		String A1 = "Menemen";
		String A2 = new String("Menemen");
		
		System.out.println(A1==A2); // false
		
		boolean R2 = A1.equals(A2);
		System.out.println(R2);
		
				
/*
 equalsIgnoreCase(): checks if two String's face values
 (visible texts) are equal or not. return boolean expression
 takes out the effect of Case Sensitivity 
 */	
		
		String s1 = "JAVA";
		String s2 = new String("java");
		
		System.out.println(s1 == s2); // false, different locations
		
		System.out.println(s1.contentEquals(s2)); // false, case sensitive
		
		System.out.println(s1.equalsIgnoreCase(s2)); // true; no case sensitivity
		
		
/*
contains(): checks if the str contained in the String or not
then returns a boolean expression
contained ==> true && !contained ==> false
 */			
		
		String me = "Emrah";
		boolean R3 = me.contains("ah");
		
		System.out.println(R3);
		
/*
startsWith(): checks if the str contained in the String or not
 */			
		
		String Today = "Java";	
		boolean R5 = Today.startsWith("J");
		System.out.println(R5);
		
		String names = "Ben bir cesme yaptirdim mermer tasindan";
		System.out.println(names.startsWith("Ben bir"));
		
/*
endsWith(): checks if the String is ended with the given
str or not, then returns a boolean expression
endsWith ==> true && !endsWith ==> false
 */			
		
		
		String B1 = "Abuzer Kadayif";
		System.out.println(B1.endsWith("if"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
