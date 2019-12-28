package Day25_ArraysContinued;

import java.util.Arrays;

public class ArrayMethods_2 {

	public static void main(String[] args) {

		String sentence = "Today is great day, Good day to learn java";

		String[] arr = sentence.split(" ");
		System.out.println(Arrays.toString(arr));

		String email = "firsName_lastName";
		String[] arr2 = email.split("_");

		String str = Arrays.toString(arr2);
		System.out.println(str.replace("[", "").replace("]", ""));

		String fullName = "Cybertek School Batch12";
		String[] array1 = fullName.split(" ");
		System.out.println(Arrays.toString(array1));

		String Java = " Java, I love Java and Java is fun, Java is life";
		String[] array2 = Java.split("Java");
		System.out.println(Arrays.toString(array2));
		System.out.println(array2.length - 1);

		String Python = " Python, I love Python and Python is fun, Python is life";
		String[] array3 = Python.split("Python");
		System.out.println(Arrays.toString(array3));
		System.out.println(array3.length-1);
		
		
		String emailAddress = "Abuzer_Can_Kadayif@gmail.com";
		String fullNameX = emailAddress.substring(0, emailAddress.indexOf("@"));
		System.out.println(fullNameX);
		
		String[] nameX = fullNameX.split("_");
		System.out.println(Arrays.toString(nameX));
		
		
		String word = "ABCDEFG";
		String[] wordArray = word.split(""); // all characters from the string as an array
		System.out.println(Arrays.toString(wordArray));
		
		
		/*
		 * toCharArray(): returns a char array from the String
		 */
		
		String Str = "Java";
		char[] ch = Str.toCharArray();
		
		System.out.println(Arrays.toString(ch));
		
	}
}
