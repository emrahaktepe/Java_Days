package Day10_IfStatement;

public class SingleIfStatement {
	
	public static void main(String[] args) {
	
		/*
		 single if:
		 if( boolean expression){
		 //A
		 */
		
		if(9>8) {
		System.out.println("9 is greater than 8");
		}
		
		if(9<8) {
		System.out.println("8 is greater than 9");
		}
		
		System.out.println("Test Completed"); // does not belong to an if statement
		
		
		System.out.println("==========================");
		
		//Task01
		
		int num1 = 100;
		int num2 = 300;
		int max1 = 0;
		if(num2>num1) {
			max1 = num2;
		}
		if(num1>num2) {
			max1 = num1;
		}
		System.out.println("Maximum number between " + num1 +" and " + num2 + " is " + max1);
		
		//Task02
		
		int hours = 25;
		int minutes = 45;
		int seconds = 30;
		String amOrPm = "PM";
		
		System.out.println(hours + ":" + minutes + ":" + seconds + ":" + amOrPm);
		
		//Task03
		
		int n1=1000, n2=5000, n3=1700;
		int maximum = 0;
		
		if(n1>n2 && n1>n3) {
			maximum = n1;
		}
		if(n2>n1 && n2>n3) {
			maximum = n2;
		}
		if(n3>n1 &&n3>n2) {
			maximum = n3;
		}
		System.out.println("The maximum number among " + n1 + ", " + n2 + ", " + n3 + " is " + maximum);
		
		System.out.println("==========================");

		int A;
		if(true) {
			A = 12;
		}
		System.out.println(A);
		
		System.out.println("==========================");

		//Task04
		
		int statusCode = 404;
		String finalResult = "";
		
		if(statusCode == 200) {
			finalResult = "OK";
		}
		if(statusCode == 201) {
			finalResult = "Created";
		}
		if(statusCode == 404) {
			finalResult = "Not Found";
		}
		System.out.println("Status code " + statusCode + " brings " + finalResult);
		
		System.out.println("==========================");

		//Task05
		
		int number1 = 0;
		String str = "ZERO";
		
		if(number1>0) {
			str = "POSITIVE";
		System.out.println(str);
			}
		
		if(number1<0) {
			str = "NEGATIVE";
		System.out.println(str);}
		

		
		//or
	
		double numX = (int) 7;
		
		if(numX > 0) {
			System.out.println("Positive");
			}
		if(numX < 0) {
			System.out.println("Negative");
		}
		if(numX == 0) {
			System.out.println("Zero");
		}
	
}
}
