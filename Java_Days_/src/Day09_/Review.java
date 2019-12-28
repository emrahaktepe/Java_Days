package Day09_;

public class Review {
	
	/*
	  relational operators:
	  > : grater than
	  >=: grater than or equal
	  < : less than
	  <=: less than or equal
	  ==: equals to
	  !=: not equals to
	  
	  logical operators:
	  
	  &&:
	  !!:
	  
	  
	  
	  
	 */

	public static void main(String[] args) {
		
		System.out.println('Z' > 'A');
		
		System.out.println('Z' >= 'A');
		
		System.out.println('a' > 'A'); // Capital letters come first at ASCII table so have lesser values than lower case
		
		System.out.println('a' < 'A');
				
		System.out.println('A' <= 'A');
		
		System.out.println('A' <= 'a');
		
		System.out.println(100 == 10*10);
		
		System.out.println(false==false);
		System.out.println(false!=true);
		
		byte x = 10; int y = 10;
		System.out.println(x == y);
		
		System.out.println( true == true && false != true);
		System.out.println(true != true || false == true);
		System.out.println("Monday" == "Funday" || true == !(false));
		
	}
	
	
}
