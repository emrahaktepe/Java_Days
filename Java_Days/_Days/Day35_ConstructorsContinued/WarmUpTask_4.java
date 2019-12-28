package Day35_ConstructorsContinued;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask_4 {

	// 4. write a return method that accepts an Integer array and returns the
	// minimum number
	// DO NOT USE SORT METHOD
	// 5. write a return method that accepts an Integer arrayList and returns the
	// second minimum number
	// DO NOT USE SORT METHOD

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

		int minN = minNum(list);

		System.out.println(minN);

		System.out.println(secndMin(list));

	}

	public static int minNum(ArrayList<Integer> list) {

//		int min = Integer.MAX_VALUE;
//
//		for (int each : list) {
//			if (each < min) {
//				min = each;
//			}
//		}
		Integer min = Collections.min(list);
		return min;
	}

	public static int secndMin(ArrayList<Integer> list) {

		Integer minNum = minNum(list);
			list.remove(minNum);	// or list.removeAll(Arrays.asList(minNum));

		int secndMin = minNum(list);

		return secndMin;
	}

}
