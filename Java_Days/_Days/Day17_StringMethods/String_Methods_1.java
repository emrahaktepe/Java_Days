package Day17_StringMethods;

public class String_Methods_1 {
	
	public static void main(String[] args) {
		
		/*
		 trim(): it is used for removing the unused spaces
		 */
		
		
		String s1 = "              hello";
		s1.trim();
		System.out.println(s1);
		s1 = s1.trim();
		System.out.println(s1);
		
		
		String s2 = "Cybertek             School";
		s2 = s2.trim();
		System.out.println(s2);
		
		String s3 = "           deneme         menemen        ";
		s3 = s3.trim();
		System.out.println(s3);
		
		/*
		 substring(beginning index): it creates the sub-value of the String.
		 from the beginning index till the last index
		 returns it as NEW String value
		 */
		
		String Str1 = "Menemen School";
		//			  01234567889
		String Str2 = Str1.substring(8);
		
		System.out.println(Str1);
		System.out.println(Str2);

		String Address = "Murphy TX 75094";
		//				  12345678910
		String zipCode = Address.substring(10);
		System.out.println(zipCode);
		
		
		/*
		 substring(beginning index, ending index): it creates the sub-value of the String.
		 from the beginning index till the assigned ending index
		 returns it as NEW String value - ending index num is excluded
		 */
		
		String Name = "Dialogue Institute Dallas";
		//			   0123456789
		String NameX = Name.substring(9, 18);
		System.out.println(NameX);
		
		String fullName = "Abuzer Kadayif Killibacak";
		//				   0123456789
		String fullName1 = fullName.substring(7, 14);
		System.out.println(fullName1);
		
		
		/*
		 replace(old char, new char): 
		 
		 */
		
		
		
		
		
	}

}
