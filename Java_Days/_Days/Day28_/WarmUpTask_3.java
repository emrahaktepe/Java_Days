package Day28_;

import java.util.Arrays;

public class WarmUpTask_3 {

	/*
	 * warm Up: 1. write a method that can convert km to miles
	 * 
	 * 2. write a method that can convert gallons to litters
	 * 
	 * 3. write a method that accepts 3 parameters: 2 numbers and one operator, and
	 * prints out the calculation if operator is not between [-, +, *, /, %] output
	 * should be Invalid Operator Ex: calculate(10,2, "*") ==> 20;
	 * 
	 * 4. write a method that can calculate grade if score is 100 ~ 90 ==> A if
	 * score is 89 ~ 80 ==> B if score is 79 ~ 70 ==> C if score is 69 ~ 60 ==> D if
	 * score is 0 ~ 59 ==> F otherwise ==> Invalid Score
	 */

	public static void main(String[] args) {

		calculate(20, 5, "/");

		gradesCal(65);
		
		kmToMiles(327);
		
		mileToKm(75);
		
		gallonToLiter(4);
		
		literToGallon(1);
		
		int [] arr = {32, 43, 88, 27, 79, 61, 56};

		DescendingArr(arr);
	}
	
	public static void kmToMiles(double km) {
		double miles = km * 0.621;
		System.out.println(km +" km is " + miles + " miles\n");
	}
	
	public static void mileToKm(double mile) {
		double Km = mile / 0.621;
		System.out.println(mile +" miles is " + Km + " km\n");
	}
	
	public static void gallonToLiter(double liter) {
		double gallon = liter / 3.785;
		System.out.println(liter + " liter is " + gallon + " gallons.\n");
	}
	
	public static void literToGallon(double gallons) {
		double liters = gallons * 3.785;
		System.out.println(gallons + " gallon is " + liters + " liters.\n");
	}

	public static void calculate(int num1, int num2, String operator) {
		String result = "";

		result += (operator.equals("-")) ? (num1 - num2)
					: (operator.equals("+")) ? (num1 + num2)
						: (operator.equals("*")) ? (num1 * num2)
							: (operator.equals("/")) ? (num1 / num2)
								: (operator.equals("%")) ? (num1 % num2) 
									: "invalid";
		System.out.println(result+"\n");

	}

	public static void gradesCal(int score) {

		char grade = (score >= 90 && score <= 100) ? 'A'
						: (score >= 80 && score <= 89) ? 'B'
							: (score >= 70 && score <= 79) ? 'C'
								: (score >= 60 && score <= 69) ? 'D' 
									: (score >= 0 && score <= 59) ? 'F' 
										: 'X';
		if (grade == 'X')
			System.out.println("Invalid Entry");
		else
			System.out.println("You got " + grade + " on this test!\n");

	}
	
	public static void DescendingArr(int[] array) {
		Arrays.sort(array);
		for(int i = array.length-1; i>=0; i--) {
			System.out.print(array[i] + " ");
		}
	}

}
