package Day20_Loop;

import java.util.Scanner;

public class Sep13_WarmUpTask_2_1 {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 1; i<= 10; i++) {
		System.out.println("Enter your number: ");
		int inputNum = input.nextInt();
		sum += inputNum;
		}

		System.out.println("Sum is: " + sum);
	}
}
