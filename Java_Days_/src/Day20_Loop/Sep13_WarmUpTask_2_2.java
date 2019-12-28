package Day20_Loop;

import java.util.Scanner;

public class Sep13_WarmUpTask_2_2 {

		
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			int max = 0;
			
			for(int i = 1; i<= 5; i++) {
			System.out.println("Enter your number: ");
			int inputNum = input.nextInt();
			if(inputNum > max) {
				max = inputNum;
			}
			}

			System.out.println("Max number is: " + max);
}
}