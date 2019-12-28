package Day28_;

public class WarmUpTask_1 {	
	
	/*
	 	1. Write a method that calculates the sum of 3 numbers
    		Ex: sum(10, 20, 30) ==> 60
    
		2. Write a method that shows the grater number from 2 numbers
    		Ex: GreaterNum(10, 20) ==> 20
    
		3. Write a method that accepts birth year and displays the age in the console.   
    		Ex: calculateAge(2000) -- > 18
	 */
	
	public static void sumOfThree(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println("The sum of " + a +", "+ b + ", and " + c + " is " + sum+"\n");
	}
	
	public static void biggerNum(int a, int b) {
		int bigger = (a>b) ? a : b;
		int smaller = (a<b) ? b : a;
		
		System.out.println("Bigger of these two numbers is " + bigger+"\n");
	}
	
	public static void ageCalculator(int a) {
		int age = 2019 - a;
		System.out.println("You are " + age + " years old."+"\n");
		
	}
	
	public static void main(String[] args) {
		
		sumOfThree(2, 3, 4);
		
		biggerNum (10, 20);
		
		ageCalculator(1981);
		
		
		
	}
	
	
	

}
