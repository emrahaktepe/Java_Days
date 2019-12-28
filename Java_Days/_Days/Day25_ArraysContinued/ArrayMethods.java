package Day25_ArraysContinued;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMethods {

	public static void main(String[] args) {

		int num1 = 10;
		System.out.println(num1);

		int[] arr = { 1, 2, 3 };
		System.out.println(arr);

		/*
		 * to print entire array as a whole, we need to convert the array to String
		 * Arrays.toString(variableName)
		 */

		String str = Arrays.toString(arr);
		System.out.println(str);

		String[] names = { "Ali", "Veli", "Deli", "Kirkdokuz", "Elli" };
		System.out.println(Arrays.toString(names));

		/*
		 * Arrays.sort(variableName): sorts the values of the array in ascending order
		 * small to bigger
		 */

		int[] numbers = { 9, 8, 100, 3000, 4, 5, 6 };
		System.out.println(Arrays.toString(numbers));

		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

		System.out.println("Maximum " + numbers[numbers.length - 1]);
		System.out.println("Maximum " + numbers[0]);

		System.out.println("\n=========================================\n");

		String[] nameList = { "Zainab", "Osman", "Mehtab", "Emrah", "Orhan" };
		Arrays.sort(nameList); // alphabetical order
		System.out.println(Arrays.toString(nameList));

		System.out.println("\n=========================================\n");

		char[] ch = { '0', '9', '8', '5', '3', '2', '1' };
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));

		System.out.println("\n=========================================\n");

		Integer[] nums = { 2000, 90, 89, 78, 65, 5555, 444, -5 };

		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println("\nMinimum number of this array is " + nums[0]);
		System.out.println("\nMaximum number of this array is " + nums[nums.length - 1]);

		Arrays.sort(nums, Collections.reverseOrder());
		System.out.println(Arrays.toString(nums));

		System.out.println("\n=========================================\n");

//		int[] myNums = { 99, 10, 200, 3000, 40, 50, 4444 };
//		Arrays.sort(myNums);
//		System.out.println(Arrays.toString(myNums));
//		System.out.print("[");
//		for (int i= myNums.length-1; i>=0; i--) {
//			result += myNums[i] + ", ");
//			System.out.println();
//		}
//		result = result.trim().substring(0, result.length()-2 + "]");
//		System.out.print("]");

		int[] myNumz = { 99, 10, 200, 3000, 40, 50, 4444 };
		Arrays.sort(myNumz);

		int[] newNumz = new int[myNumz.length];
//		newNumz[0] = myNumz[6];
//		newNumz[1] = myNumz[5];
//		newNumz[2] = myNumz[4];
//		newNumz[3] = myNumz[3];
//		newNumz[4] = myNumz[2];
//		newNumz[5] = myNumz[1];
//		newNumz[6] = myNumz[0];

		int z = 0;
		for (int i = myNumz.length-1; i >= 0; i--) {
			newNumz[z] = myNumz[i];
			z++;
		}
		
		System.out.println(Arrays.toString(myNumz));
		System.out.println(Arrays.toString(newNumz));

	}
}
