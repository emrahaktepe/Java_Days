package Day25_ArraysContinued;

import java.util.Arrays;

public class Practice_2D_Arrays {
	public static void main(String[] args) {

		int[][] arr2D = { { 1, 2 }, { 3, 4, 5, 6, 7 }, { 8, 9 } };
		int length = arr2D.length;
		System.out.println(length);

		for (int i = 0; i < arr2D.length; i++) { // i: 0 1 2
			System.out.println(Arrays.toString(arr2D[i]));
		}

		for (int i = 0; i < arr2D.length; i++) { // checks each index of 1D arrays
			for (int j = 0; j < arr2D[i].length; j++) { // checks each index of 2D arrays
				System.out.print(arr2D[i][j] + " ");
			}
		}
		System.out.println("\n====================================\n");
		
		char[][] ch2D = { { 'A', 'B' }, { 'C', 'D', 'E', 'F'} };

		for (int i = 0; i < ch2D.length; i++) {
			for (int j = 0; j < ch2D[i].length; j++) {
				System.out.print(ch2D[i][j] + " ");
			}
		}

	}
}
