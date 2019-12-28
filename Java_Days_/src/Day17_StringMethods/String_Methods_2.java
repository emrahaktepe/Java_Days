package Day17_StringMethods;

public class String_Methods_2 {

	
	
	public static void main(String[] args) {
		
		/*
		 replace(old char, new char): replaces all the 
		 old char values with the given char values in 
		 the String and returns it as a NEW String value.
		 
		 */
		
		
		String str1 = "Java is Fun Programming Language";
		str1 = str1.replace('a', 'e');
		System.out.println(str1);
		
		
		/*
		 replace(old String, new String): replaces all the 
		 old String values with the given String values in 
		 the String and returns it as a NEW String value.
		 
		 */
		
		String str2 = "Dallas has been receiving a lot of people out of state and from the other cities in Texas";
		str2 = str2.replace("Dallas", "Dallas Fort Worth area");
		System.out.println(str2);
		
		
		/*
		 replaceFirst(old String, new String): replaces the 
		 first occured old String value with the given String 
		 value in the String and returns it as a NEW String value.
		 
		 */
		
		String str3 = "Java is fun but Java is amazing!";
		str3 = str3.replaceFirst("Java", "Python");
		System.out.println(str3);
		
		
		String str4 = "Java is programming language, Java is Java";
		str4 = str4.replace("Java", "C#");
		System.out.println(str4);
		
}
	
	
	
}
