package Day29_;

public class ReturnStatement {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
//		if(true)
//			return;
		
		System.out.println("Hola");
		
		for(int i=0; i<5; i++) {
			if (i==3)
				return;
			System.out.println(i);
		}
		System.out.println("Completed");
		
//		System.exit(0): java stops all the execution
	}
	
}
