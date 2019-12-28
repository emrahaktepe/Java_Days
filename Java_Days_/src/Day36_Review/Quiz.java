package Day36_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		
//		Question_1: Valid declarations of ArrayList
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<>();

//		Question_2: compile error

//		ArrayList<int> list3 = new ArrayList<>();
//			list3.add(10);
//			System.out.println(list3);
			
//			Question_3: 
			ArrayList<Integer> list4 = new ArrayList<Integer>();
			list4.addAll(Arrays.asList(1, 2, 3));
			//					index: 0  1  2
			
			int a = 1;
			list4.remove(a);
			System.out.println();
			System.out.println(list4);
			
//			Question_4: 

			ArrayList<Integer> list5 = new ArrayList<Integer>();
			list5.addAll(Arrays.asList(1, 2, 3));
			//					index: 0  1  2
			
			Integer A = 1;
			list5.remove(A);
			System.out.println();
			System.out.println(list5);
		
//			Question_5: 
			String[] arr = {"Rob", "Bran", "Rick", "Bran"}; 
			ArrayList<String> names = new ArrayList<>(Arrays.asList(arr));
			
			if(names.remove("Bran")) {
				names.remove("John");
			}
			
			System.out.println(names);
			
//			Question_6: 
			ArrayList<String> colors = new ArrayList<>();
				colors.add("green");
				colors.add("red");
				colors.add("blue");
				colors.add("yellow");
				colors.add(3, "cyan");
				System.out.println(colors);

//				Question_6: 
	
			
			
			
			
			
			
			
			
		
	}
}
