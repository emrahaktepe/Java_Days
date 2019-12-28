package Day33_ArrayListX;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		numbers.remove( 3 ); // removes index 3 ==> [1, 2, 3, 5]
		System.out.println(numbers);
		
		numbers.remove( Integer.parseInt("3") ); // this one returns primitive and removes the index
		System.out.println(numbers);
		
		numbers.remove( Integer.valueOf("3")); // this one returns wrapper class and removes the value
		System.out.println(numbers);

		
		
		
	}
	
}
