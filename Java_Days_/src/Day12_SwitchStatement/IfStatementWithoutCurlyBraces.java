package Day12_SwitchStatement;

public class IfStatementWithoutCurlyBraces {

		public static void main(String[] args) {
			
			if(true) {
				System.out.println("Hello");
			}
			else{
			System.out.println("World");	
			}
			
			//without the curly brace: a single line of statement
			
			if(true)
				System.out.println("Hello");
			//	System.out.println("Hello");
			//	without the curly brace cannot hold more then one statement
			else
				System.out.println("World");
			
			if(true)
				if(false)
					System.out.println("Hello World");
				else
					System.out.println("Hello Cybertek");
			
			System.out.println("=============================");

			//nested if without the curly brace
			
			if(true)
				if(false)
					System.out.println("Hello Y'all");
				else
					System.out.println("Hello Guys");
			else
				System.out.println("Invalid");

			System.out.println("=============================");

			//multi branch if:
			
			int grade = 85;
			if(grade>=90) {
				System.out.println("A");
			}
			else if(grade >= 80) {
				System.out.println("B");
			}
			else if(grade >= 70) {
				System.out.println("C");
			}
			
			if(grade>=90) 
				System.out.println("A");
			
			else if(grade >= 80) 
				System.out.println("B");
			
			else if(grade >= 70) 
				System.out.println("C");
			
		}
		
	

	
}
