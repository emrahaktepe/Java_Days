package Day08_ShorthandOperators;

public class RelationalOperators {

	/*
	  > : greater than
	  >=: greater than or equal
	  < : less than 
	  <=: less than or equal
	  ==: equal
	  !=: not equal	  
	  = : assign
	  ! : exclamation mark means logical opposite in Java
	 */
	
	public static void main(String[] args) {
		
		System.out.println(10>9);
		
		boolean resultA = 10>9;
		System.out.println(resultA);
		
		System.out.println(10>=9);
		
		boolean resultB = 10>=9;
		System.out.println(resultB);
		
		boolean resultC = 10<= 9;
		System.out.println(resultC);
		
		boolean resultD = 1100 < 1200;
		System.out.println(resultD);
		
		int X1 = 1350;
		int Y1 = X1 / 10;
		boolean resultE = X1 <= Y1;
		System.out.println(resultE);
		
		// ==
		
		boolean resultG = 19 == 19;
		System.out.println(resultG);
		
		// !
		
		boolean resultH = 20!= 20;
		System.out.println(resultH);
		
		boolean zA = ! false;
		boolean zB = ! true;
		
		System.out.println(zA +" "+ zB);
		
		boolean zC = !false != !true;
		System.out.println(zC);
		
		boolean zD = true == !false;
		System.out.println(zD);
		
		boolean zE = !(!true);
		System.out.println(zE);	
		
		//practice ! (not)
	
	boolean gG = false;
	System.out.println(!gG);
	System.out.println(!true == false);
	boolean hH = "Batch12" == "batch12";
	System.out.println(hH);
	
	int no1 = 198;
	System.out.println(no1 %= 2);
	
	byte bNum = 30;
	// int iNum = iNum += bNum;
	
	
	}
	
	
	
	
}
