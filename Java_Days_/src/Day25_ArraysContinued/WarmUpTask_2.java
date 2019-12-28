package Day25_ArraysContinued;

public class WarmUpTask_2 {

	public static void main(String[] args) {

		/*
		 * write a program that can print unique values from a String Array
		 */

		String[] arr = { "A", "A", "B", "C", "C" };

		for (int j = 0; j < arr.length; j++) {
			int count = 0;

			for (int i = 0; i < arr.length; i++) {
				if ((arr[i].equals(arr[j]))) {
					count++;
				}
			}
			if(count == 1);
			System.out.print(arr[j] + " ");
		}
		
	}

}
