package Day11_;

public class DenemeX {

public static void main(String[] args) {
		
		/*
		 Define budget and write a program to tell the customer which car to buy.
		 
		 Kia Rio = 5000
		 Toyota Corolla = 8000
		 Honda CRV 14000
		 Acura MDX = 20000
		 Mercedes G55= 50000
		 */
		
		
		int budget = 55000;
		String kia = "Kia Rio ";
		String toyota = "Toyota Corolla ";
		String honda = "Honda CRV ";
		String acura = "Acura MDX ";
		String mercedes = "Mercedes G55 ";
		
		if(budget < 5000) {
			System.out.print("You don't have enough money");
		}
		else if(budget >= 5000 && budget < 8000) {
			System.out.println("You can buy " + kia);
		}
		else if(budget >= 8000 && budget < 14000) {
			System.out.println("You can buy "+ kia + toyota);
		}
		else if(budget >= 14000 && budget < 20000) {
			System.out.println("You can buy "+ kia + toyota + honda);
		}
		else if(budget >= 20000 && budget < 50000) {
			System.out.println("You can buy "+ kia + toyota + honda + acura);
		}
		else if(budget > 20000) {
			System.out.println("You can buy "+ kia + toyota + honda + acura + mercedes);
		}
	}

}
	

