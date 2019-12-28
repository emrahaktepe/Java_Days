package Day11_;

public class WarmUpTask {

		/*
		 Grade Calculator
		 
		 You can also define a valid grade frame from o to 100 as a boolean 
		 and nest all the if else statements under that as the first if statement
		 and define an else statement at the end outside the nested part.
		 */
		
		public static void main(String[] args) {
			
			int grade = 120;
			boolean A = grade >= 90 && grade <= 100;
			boolean B = grade >= 80 && grade <90;
			boolean C = grade >= 70 && grade <80;
			boolean D = grade >= 60 && grade <70;
			
			if(A) {
				System.out.println("You made A!");
			}
			else if(B) {
				System.out.println("You made B!");
			}
			else if(C) {
				System.out.println("You made C!");
			}
			else if(D) {
				System.out.println("You made D!");
			}
			else {
				if(grade < 60) {
					System.out.println("You made F!");	
				}
				else {
					System.out.println("Invalid Entry");
				}
			}
		
		
			
			int age = 22;
			boolean GoodPerson = false;
			
			if(age>=18) {
				if(GoodPerson) {
					System.out.println("Alcohol is bad for you!");
				}
				else {
					System.out.println("You can buy buy cigaretes");
					if(age>=21) {
						System.out.println("You can buy hookah");
					}
					if(age>=25) {
						System.out.println("You can buy alcohol");
					}
				}
			}
			
			else {
				System.out.println("Please buy milk!");
			}
		
			
			/*
			 number of days of the month
			 
			 28 days = 2
			 30 days = 4, 6, 9, 11
			 31 days = 1, 3, 5, 7, 8, 10, 12
			 */
		
		int month = 2;
		if(month>0 && month<=12) {
			if(month==2) {
				System.out.println("There are 28 days in the " + month + "nd month of the year");
			}
			if(month == 4 || month==6 || month==9 || month==11) {
				System.out.println("There are 30 days in the " + month +"th month of the year");
			}
			if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
				System.out.println("There are 31 days in the " + month + "th month of the year");
			}
		}
		else {
			System.out.println("Invalid Entry");
		}
			
		int monthX = 2;
		if(monthX > 12) {
			System.out.println(monthX + " is not a valid month number. Please enter a valid month number!");
		}
		else {
		System.out.print("Number of days in the "); 
				
		if(monthX == 2) {
			System.out.println("28");
		}
		else if(monthX == 4 || monthX == 6 || monthX == 9 || monthX ==11) {
			System.out.println("30");
		}
		else {
			System.out.println("31");
		}
		}
		
		}
		
	}
	
	

