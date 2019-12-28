package Day12_SwitchStatement;

public class SwitchStatement {


		public static void main(String[] args) {
			
			/*
	 		switch statement does a smiliar thing like multi-branch if statement
	 		switch(Expression){
	 			case CaseValue:
	 				statement1
	 				statement2
	 				break;
	 				
	 				we can have as many cases as we want but only one default in a switch statement
	 				if there is no break in switch
	 				code will continue to run until exits the switch statement
	 		}
			 */
			
			int score = 1;
			if(score==1) {
				System.out.println("1");
			}
			else if(score==2) {
				System.out.println("2");
			

			}
		
			switch(score) { //Must give an expression: data
				case 1:
					System.out.println("1");
					
				default:
					System.out.println("Invalid");
					
				case 2:
					System.out.println("2");
			}
		
			
			System.out.println("=======================");
			
			String str = "Java";
			
			switch (str) {
			
				case "C#":
				System.out.println("C# programing language");
				break;
				
				case "Paython":
					System.out.println("Python programming language");
			
				default:
				System.out.println("Invalid");
		
			}
			
			System.out.println("=======================");

			char ch = 'A';
			
			switch(ch) {
			
			
			case 'B':
				System.out.println("Passed with B");
			case 'C':
				System.out.println("Passed with A");
			default:
				System.out.println("Failed");
			}
			
		String days = "Tuesday";
		
		switch (days) {
		case "Monday":
			System.out.println("Monday is fun day");
			break;	
		
		case "Tuesday":
			System.out.println("Tuesday is the second day");
			
		case "Wednesday":
		System.out.println("Wednesday is the third day");
		break;	
		
		case "Thursday":
			System.out.println("Thursday is the third day");
			break;
		
		case "Friday":
			System.out.println("TGI Friday");
			break;
			
		default:
			System.out.println("It is the Weekend!!!!");
			break;
			}	
		
		long N1 = 10;
		//switch (N1) { }
		
		float N2 = 100;
		// switch (N2){ }
		
		double N3 = 10;
		// switch(N3){ }
		
		boolean N4 = true;
		// switch (N4) { }
		
		char C1 = 'A';
		switch(ch) {
		case 'A':
			System.out.println(C1);
		}
		
		System.out.println("= = = = = = = = = = = = = = =");

		char gradeX = 'B';
		
		switch (gradeX) {
		case 'A':
		break;
		
		case 'B':
				System.out.println("you have passed with B");
		break;
		
		default:
			System.out.println("Failed the test!");
		}	
		
		int gradeNum = 93;
			
		switch (gradeX) {
			case 100:
			case 99:
			case 98:
			case 97:
			case 96:
			case 95:
			case 94:
			case 93:
			case 92:
			case 91:
			case 90:
			System.out.println("You got A!");
		break;
		}
		
	}
	}

