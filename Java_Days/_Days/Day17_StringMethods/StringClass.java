package Day17_StringMethods;

public class StringClass {

	
/*
 String Pool: Located in Java Heap memory, 
 it is a very special memory location for string literals.
 
 every time if the String object is created by String 
 literals, the object will be saved at String pool
 
 Every time if the String object is created by using "new" 
 keyword, the object will be saved at Heap memory 
 which is outside the string pool
 */

	public static void main(String[] args) {
		
		String str1 = "Hello Javanegers";
		String str2 = "HelloJavaengers";
		boolean R1 = str1 == str2; //true
		
		String str3 = new String("Hello Javaengers");
		String str4 = new String("Hello Javaengers");
		boolean R2 = str3 == str4; //false
		
		boolean R3 = str1 == str3; //false
		
		
		
		
	}
	
	
}
