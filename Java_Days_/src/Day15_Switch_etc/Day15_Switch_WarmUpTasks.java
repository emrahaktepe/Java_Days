package Day15_Switch_etc;

public class Day15_Switch_WarmUpTasks {
	
	public static void main(String[] args) {
		
		int num = 8;
		String result = " ";
		
		if (num>=0 && num<=9) {
			if(num == 9)
				result = "nine";
			else if(num == 8)
				result = "eight";
			else if(num == 7)
				result = "seven";
			else if(num == 6)
				result = "six";
			else if(num == 5)
				result = "five";
			else if(num == 4)
				result = "four";
			else if(num == 3)
				result = "three";
			else if(num == 2)
				result = "two";
			else if(num == 1)
				result = "one";
			else
				result = "zero";
		}
		else {
			result = "invalid number";
		}
		System.out.println("You have entered: " + result);
	
	
	int num1 = 11;
	String result2 = (num1 == 9) ? "nine"
						: (num1 == 8) ? "eight"
								: (num1 == 7) ? "seven"
										: (num1 == 6) ? "six"
												: (num1 == 5) ? "five"
														: (num1 == 4) ? "four"
																: (num1 == 3) ? "three"
																		: (num1 == 2) ? "two"
																				: (num1 == 1) ? "one"
																						: (num1 == 0) ? "zero"
																								: "invalid number";
	
	System.out.println("You have entered: " + result2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
