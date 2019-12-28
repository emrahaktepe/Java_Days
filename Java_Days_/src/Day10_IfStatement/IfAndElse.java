package Day10_IfStatement;

public class IfAndElse {
			
		/*
		 	if & else:
		 	
		 	if ( Condition ){
		 		//A		//if block is only gets executed if the condition is true
		 	}
		 	else { //B 	//else block is only gets executed if the condition is false
		 	}
		 	
		 	if condition is true ===> A
		 	if condition is false ==> B
		
		 */
		
	public static void main(String[] args) {

		if(9 >= 8) {
			System.out.println("9 is greater than or equal to 8");
			}
		
		else {
			System.out.println("9 is less than 8");
		}
		
		if(false == !false) {
			System.out.println("if block");
		}
		else {
			System.out.println("else block");
		}
		
		/*Task01:
		if score < 60 ===> failed
		if score >=60 but score <90 ===> pass
		if score >= 90 ===> passed with honor 
		
		*/
		
		int score = 79;
		if(score >=60 && score<90) {
			System.out.println("Passed");
		}
		if(score > 90) {
			System.out.println("Passed with Honor");
		}
		else {
			System.out.println("Failed");
		}
		
		//Task02
		
		/*
		 1. triangle: has three angles
		 	sum of three angles must be equal to 180
		 	
		 	1. declare three variables angle1, 2, and 3
		 	2. type a program to check if triangle is valid or not
		 */
		
		int angle1 = 20, angle2 = 50, angle3 = 75;
		
		if(angle1+angle2+angle3 == 180) {
			System.out.println("This is a valid triangle");
		}
		else {
			System.out.println("This is NOT a valid triangle");
		}
		
		
		/* multi-branch if ststement: we use them when thre are more than two possibilities

		if(condition1){
		 	//A
		 }
		else if(condition2){
			//B
		}
		else if(condition3){
			//C
		}
		
		if condition1 is true ===> A
		if condition2 
		
		*/
		
		
		
		
		
		
		
		
	}

}
