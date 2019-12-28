package Day10_IfStatement;

public class MultiBranchIfStatement {
	
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
	if condition1 is false and condition2 is true ===> B
	if condition1 and condition2 are both false and condition3 is true and other two conditions are false ===> C
	
	*/
	
	
	/*
	 if-else if-else:
	 
	 if(condition1){
	 	//A
	 }
	else if(condition2){
		//B
	}
	else if(condition3){
		//C
	 
	 
	 */
	
	
	public static void main(String[] args) {
		
		if(false){
		 	System.out.println("if block");
		 }
		else if(false){
		 	System.out.println("else if block");
		}
		else{
		 	System.out.println("else block");
		}
		
		int grade = 70;
		
		if(grade>=90) {
			System.out.println("Your garde is A");
		}
		else if(grade<90 && grade >=80) {
			System.out.println("Your grade is B");
		}
		else if(grade<80 && grade >=70) {
			System.out.println("Your grade is C");
		}
		
		else if(grade<70 && grade >=60) {
			System.out.println("Your grade is D");
		}
		else{
			System.out.println("Your grade is F");		
		}
			
		//Task02
		
		/*
		 1. Write a program that:
		 	1. 0 to 12  ===> Good Morning
		 	2. 12 to 15 ===> Good Afternoon
		 	3. 15 to 20 ===> Good Evening
		 	4. 20 to 24 ===> Good Night
		 */
		
		int hour = 12;
		if(hour >= 0 && hour < 12) {System.out.println("Good Morning!");}
		else if(hour > 12 && hour <= 15) {System.out.println("Good Afternoon!");}
		else if(hour > 15 && hour <= 20) {System.out.println("Good Evening!");}
		else if(hour > 20 && hour <= 24) {System.out.println("Good Night!");}
		else if(hour == 12) {System.out.println("Enjoy Your Lunch!");}
		
		
		//Task:
		
		
		
	}

}
