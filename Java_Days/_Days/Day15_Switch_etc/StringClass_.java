package Day15_Switch_etc;

public class StringClass_ {
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		// concat();
		
		String s1 = "Cybertek";
		
		s1.concat(" School"); // attempt to modify String s1
		
		System.out.println(s1); // String is immutable
		
		s1 = s1.concat(" School");
		System.out.println(s1);

		// toUpperCase
		
		String s2 = "Bir ben vardir bende benden iceru";
			s2 = s2.toUpperCase();
		System.out.println(s2);
		
		// toLowerCase

		String s3 = s2.toLowerCase();
		System.out.println(s3);
		
		
		/*
		 charAt(index), length(), concate(Str), toUpperCase, toLowerCase
		 */
		
		String a = "Batch 12 Javaengers";
		// index:	0123456789....
		System.out.println(a.charAt(14));
		
		
		int Length = a.length();
		System.out.println(Length); 
		
		int highestIndexNumber = a.length() - 1;
		System.out.println(highestIndexNumber);
	}

}
