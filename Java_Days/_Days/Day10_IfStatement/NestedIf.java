package Day10_IfStatement;

public class NestedIf {

	public static void main(String[] args) {
		
		int grade = 120;
		if(grade>= 60 && grade <= 100) {
			System.out.println("You passed");
			
			if(grade>=90 && grade<=100) { System.out.println("\t with a grade A");}
			else if(grade>=80 && grade<=90) { System.out.println("\t with a grade B");}
			else if(grade>=70 && grade<=80) { System.out.println("\t with a grade C");}
			else if(grade>=60 && grade<=70) { System.out.println("\t with a grade D");}
			else if(grade>=50 && grade<=60) { System.out.println("\t with a grade F");}
			else if(grade>=40 && grade<=50) { System.out.println("\t with a grade G");}
			else if(grade>=30 && grade<=40) { System.out.println("\t with a grade H");}
			else if(grade>=20 && grade<=30) { System.out.println("\t with a grade I");}
			else if(grade>=10 && grade<=20) { System.out.println("\t with a grade J");}
			else if(grade>=0 && grade<=10) { System.out.println("\t with a grade K");}






		}
		
		else {
			if(grade<60) {System.out.println("You failed \twith a Grade F. Please retake the class.");}
			else {System.out.println("Invalid Score!");
			}
		}
	}
	
}
