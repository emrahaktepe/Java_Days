package Day21_WhileLoop;

public class DoWhileLoop {

	/*
	 do - while:
	 
	 do{
	 statements;
	 } while(condition);
	 
	 compiler executes the do block first,
	 then checks the condition, if the condition 
	 is true it keeps executing, otherwise exits the loop.
	 */
	
	public static void main(String[] args) {
		
		boolean A = false;
		while(A) {
			System.out.println("Hello!");
			
		}
		
		
		do {
			System.out.println("Hello");
		} while( A );
		
		
		int x =1;
		do {
			if(x%2==0) {
				System.out.print(x+" ");
			}
			x++;
		}while(x <= 100);
		
				
	}
}
