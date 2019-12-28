package Day26_ForEachLoop;

public class ForEachLoop_MultiDimensional {

	// n dimensional array contains (n-1) dimensional arrays

	public static void main(String[] args) {

		int[] arr1D = { 1, 2, 3, 4 };

		int[][] arr2D = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		for (int i = 0; i < arr2D.length; i++) {
			// counts the 1D arrays
			for (int j = 0; j < arr2D[i].length; j++) {
				System.out.print(arr2D[i][j] + " ");
			}
		}

		System.out.println("\n=================================\n");

		for (int[] each1 : arr2D) {
			for (int each2 : each1) {
				System.out.print(each2 + " ");
			}
		}
		
		System.out.println("\n=================================\n");

		String[][] str2D= { {"Osman", "Mehtab", "Orhan"}, {"Zainab", "Emrah"} };
		
		for(String[] each1DArrays : str2D){
			for(String eachValues : each1DArrays) {
				System.out.print(eachValues+" ");
			}
		}
		
		System.out.println("\n=================================\n");

		int[][] num2D = {{1,2}, {3, 4}};
		
		int[][][] num3D = { { {1,2}, {3, 4} }, { {5,6}, {7, 8} } };
		
		for(int[][] each2DArray : num3D) {
			for(int[] each1DArray : each2DArray) {
				for(int each : each1DArray) {
					System.out.print(each + " ");
				}
			}
		}
		
	}
}
