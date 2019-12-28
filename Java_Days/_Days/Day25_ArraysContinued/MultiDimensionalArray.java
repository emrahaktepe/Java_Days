package Day25_ArraysContinued;

import java.util.Arrays;

public class MultiDimensionalArray {
	public static void main(String[] args) {

		int[] arr1D = { 1, 2, 3 };

		// 2 dimensional array: array that contains more than 1 dimensional arrays
		
		int[][] arr2D = { {1,2,3}, {4,5,6} };

	String[] arr1 = {"A", "B"};
//						  0	   1	  0    1	2
	String[][] arr2 = { {"A", "B"}, {"C", "D", "E"} };
//							0			1
	
	System.out.println(arr2[0][0]);
	
	System.out.println(arr2[1][1]);
	
	System.out.println(arr2[1][2]);
	
	System.out.println(Arrays.toString(arr2[0]));
	
	System.out.println(Arrays.toString(arr2[1]));

	// Arrays.deepToString(variableName): converts multi dimensional Arrays to String
	
	System.out.println(Arrays.deepToString(arr2));
	
	int[][] nums2D = {{1,2}, {3,4}, {5, 6, 7, 8, 9, 10}};
	
	System.out.println(nums2D[2][1]);
	
	System.out.println(nums2D[2][5]);

	System.out.println(Arrays.toString(nums2D[2]));

	System.out.println(Arrays.deepToString(nums2D));
	
	//3 dimensional
	
	int [][] Array2D = { {1,2}, {3,4} };
//							   0	  1			  0		 1
	int [][][] Array3D = { { {1,2}, {3,4} } , { {5,6}, {7,8} } };
//									0					1
//	index 
	
	System.out.println(Array3D[1][1][1]);
	
	System.out.println(Arrays.toString(Array3D[1][0]));

	System.out.println(Arrays.deepToString(Array3D[1]));

	// 4 dimensional arrays
	
	}

}
