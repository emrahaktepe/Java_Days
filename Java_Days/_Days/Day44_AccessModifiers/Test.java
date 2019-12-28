package Day44_AccessModifiers;

import static Day44_AccessModifiers.Testdata.*;
import static Day44_AccessModifiers.Testdata.ID;
import static Day44_AccessModifiers.Testdata.School;

public class Test {
	
	public static String Name = "Muhtar";
	
	public static void main(String[] args) {
		System.out.println(Name);
		System.out.println(Testdata.Name);
		System.out.println(ID);
		System.out.println(School);

		printHello();
		
		System.out.println(age);
		
	}

}
