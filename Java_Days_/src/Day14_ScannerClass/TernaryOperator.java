package Day14_ScannerClass;

public class TernaryOperator {
		
		public static void main(String[] args) {
			
			String schoolName = "";
			boolean Batch12 = true;
			
			String bestSchool = Batch12 ? "Cybertek" : "Invalid";
			
			System.out.println("The name of our school is "+ bestSchool);
			
			
			double d = 10;
			if(true) {
			d=10.5;
			}
			System.out.println(d);
			
			// double z = true ? 10.5; // total number of the ?s and :s has to be equal
			
			
			
			double interestRate = 0;
			boolean goodCredit = true;
			
			double interestR = goodCredit ? 0.5 : 0.9;
			
			System.out.println(interestR);
			
			String Group = "";
			char finalGrade = 'D';
				
			Group = (finalGrade == 'A') ? "Early Bird" 
						: (finalGrade=='B') ? "Group 1" 
								: (finalGrade == 'C') ? "Group 2" 
										: "After Group 2";
			System.out.println(Group);
			
			int score = 95;
			char finals = 'C';
			
			finals = (score >= 90 && score <= 100) ? 'A'
								: (score >= 80 && score < 89) ? 'B'
										: (score >= 70 && score < 79) ? 'C'
												: (score >= 60 && score < 69) ? 'D'
														: 'F';
			System.out.println(finals);

			
			int n1 = 100, n2 = 300, n3 = 400;
			
			int max = (n1>n2&&n1>n3) ? n1
						:(n2>n1&&n2>n3) ? n2
								: n3;
			System.out.println(max);
		
			
		}

	
}
