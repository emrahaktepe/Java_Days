package Day35_ConstructorsContinued;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask_2_3 {

	// 2. write a return method that accepts an Integer array and returns the maximum number
	// DO NOT USE SORT METHOD
	
	// 3. write a return method that accepts an Integer arrayList and returns the second maximum number
	// DO NOT USE SORT METHOD

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

		int maxN = maxNum(list);

		System.out.println(maxN);
		
		// =======================================================================
		
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		
		int secondMax = secondMax(list2);

		System.out.println(secondMax);

	}

	public static int maxNum(ArrayList<Integer> list) {

		int max = Integer.MIN_VALUE;
		for (int each : list) { // un-boxing
			if (each > max) {
				max = each;
			}
		}
		return max;

	}

	public static int secondMax(ArrayList<Integer> list) {

		Integer max = maxNum(list);
			list.removeAll(Arrays.asList(max));
		
		int secondMax = maxNum(list);
		
		return secondMax;

	}

}
