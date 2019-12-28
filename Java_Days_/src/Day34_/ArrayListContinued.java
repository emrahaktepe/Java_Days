package Day34_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListContinued {

	public static void main(String[] args) {

	// RemoveAll(Interface):

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.addAll(Arrays.asList(1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4));

		numbers.removeAll(Arrays.asList(1, 2));
		System.out.println(numbers);

	// remove() method not designed to be used within a loop

		ArrayList<Integer> lis = new ArrayList<>();
		lis.addAll(Arrays.asList(1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 1));

		for (int i = 0; i < lis.size(); i++) {
			if (lis.get(i) == 1) {
				lis.remove(i);
			}
		}
		System.out.println(lis);

	// Sorting the ArrayList:
		// Collections.sort(VariableName);
		// Collections class is presented in "java.util" package
		
		Integer[] array = {1000, 919, 750, 80, 152, 524, 429};
		
		ArrayList<Integer> price = new ArrayList<>();
		price.addAll(Arrays.asList(array));
		
		System.out.println(price);
		
		Collections.sort(price); // sorts the ArrayList in ascending order
		
		System.out.println(price);
	}
}
