package Day10_Tasks;

public class Task01_greaterNumber {
	
	public static void main(String[] args) {
		
		
		int num1 = 20; 
		int num2 = 30; 
		int max1; 
				
		if(num1 > num2)
			max1 = num1;
		
		else if (num2>num1)
				max1 = num2;
		
		else max1 = num1;
		
		System.out.println(max1);

		System.out.println(" =============================== ");

		// or
		
		int numX = 20;
		int numY = 30;
		int numZ = Math.max(numX,  numY);
		
		System.out.println(numZ);
		
		int numA = 40;
		int numB = 100;
		int numC = Math.max(numA,  numB);
		System.out.println("max = " + numC);
			
		
		
	}

}
