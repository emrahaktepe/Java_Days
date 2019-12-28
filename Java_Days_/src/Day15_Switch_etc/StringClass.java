package Day15_Switch_etc;

public class StringClass {
	
	// String is an object
	// There are two ways to create objects using the String class
	// by using "new" keyword
	// String str1 = "Cybertek"
	// String str2 = new String("Cybertek");
	
	// when the object is created by String literals, that object will be saved at String Pool.
	// String pool does not take duplicates. 
	
	// when the String object is created using new keyword, 
	// the object will be saved at java heap memory(not within the string pool.

	public static void main(String[] args) {
		
		
		String str = "Cybertek";
		String A = "Cybertek";
		String B = "Cybertek";
		
		String str2 = new String("Cybertek");
		String str3 = new String("Cybertek");

		System.out.println(A == B);
		System.out.println(str2 == str3);
	}
	
	
}
