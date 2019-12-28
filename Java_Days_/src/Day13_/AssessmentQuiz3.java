package Day13_;

public class AssessmentQuiz3 {
	
	public static void main(String[] args) {
		
		//Q1
		
		int num =9;
		if(num++ == 10) {
		//  9 == 10 ==> false
			System.out.println("Hello World " + num);
		}
		else {
			System.out.println("Hello Universe " + num);
		}
		
		System.out.println("= = = = = = = = = = = = = = = =");

		//Q2
		
		int score = 0;
		//	0 == 0 ==> true
		if (score == 0) {
			score += 50;
		}
		if (score != 0) {
		// 50 != 0 ==> true
			score+= 50;
		}
		System.out.println(score);
		
		System.out.println("= = = = = = = = = = = = = = = =");

		//Q3
		
		char grade= 'A';
		boolean Passed = grade =='A' || grade =='B';
						// 'A' == 'A' || 'A' =='B'
						//     true   || false ==> true
		boolean Passed2 = grade =='C' || grade =='D';
						// 'A' == 'C' || 'A' =='D'
						//     false   || false ==> false
		if(Passed || Passed2) {
			System.out.println("You have passed the test");
		}
		else {
			System.out.println("You failed!");
		}
		
		System.out.println("= = = = = = = = = = = = = = = =");

		//Q4
		
		boolean A = true, B= !false;
		
		if(B) {
			System.out.println("B");
		}
		else if(A) {
			System.out.println("A");
		}
		else {
			System.out.println("C");
		}
		
		System.out.println("= = = = = = = = = = = = = = = =");

		//Q5
		
		boolean result = true;
		if(result) {
			System.out.println("it is true");
		}
		else {
			System.out.println("it is false");
		}
		/*
		 else if(result){
		 System.out.println("None of the above");
		 multi-branch if statement you cannot use else statement in the middle. it has to be at the end
		 */
		
		System.out.println("= = = = = = = = = = = = = = = =");

		//Q8
		boolean G = true, H = !G;

		if(G) {

			if(H) {

				System.out.println("Monday");

			}
			else {

				System.out.println("Tuesday");

			}

		}

		else {

			if(G) {

				System.out.println("Thursday");

			}
			else {

				System.out.println("Friday");

			}

		}
		
		
		System.out.println("= = = = = = = = = = = = = = = =");

		
		//Q9
		
		
		int number = 10;

		if(--number > 10) {

		System.out.println("Hello Cybertek " + number);

		}else if(number == 9) {

		System.out.println("Hello World " + number);

		}
		
		System.out.println("= = = = = = = = = = = = = = = =");

		
		//Q10
		
		boolean j = true; // true

		boolean k = !j==false;	// false = false ==> true

		boolean l = k; // true

		 

		if( j ) {

		System.out.println("Hello Everyone");

		} if( k ) {

		System.out.println("Today is great day");

		} if( l ) {

		System.out.println("We have picnic on Saturday");

		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
