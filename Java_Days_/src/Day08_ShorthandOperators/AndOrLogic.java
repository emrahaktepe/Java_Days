package Day08_ShorthandOperators;

public class AndOrLogic {
	
	/*
	 && : and logic
	 || : or logic 
	 
	 */
	
	
	public static void main(String[] args) {
		
		
		
		boolean resultB = 8>5 && 7 == (8-2+1);
						// true && true ===> true
		System.out.println(resultB);
		
		boolean resultC = !false !=true && !false ==!(!true);
						// true != true && true == !false
						// false && true ===> false
		System.out.println(resultC);

		// ||:
		
		boolean D = "Monday" == "Funday" || 6 == 6;
		System.out.println(D);
		
		boolean E = true || false;
		System.out.println(E);
		
		boolean F = ! (8>5) || !("Today" != "Friday");
		System.out.println(F);
		
		boolean G = true && true || false;
		System.out.println(G);
		
		boolean H = !(7>5 && 6 != 5) && ( 9>5 || 10>4);
		System.out.println(H);
		
		
		
	}

}
