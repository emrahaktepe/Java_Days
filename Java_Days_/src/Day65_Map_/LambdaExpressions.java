package Day65_Map_;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class LambdaExpressions {
	
	public static void main(String[] args) {
		
		Predicate<Integer> remove100 = p -> p == 100;
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(100, 100, 100, 100, 100, 100));
		list1.removeIf(remove100);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(100, 200, 300, 400, 500, 600));
		list2.removeIf( R -> R > 300);
		System.out.println(list2);
		
		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		list3.forEach(p -> { if (p < 5) {System.out.print(p + " ");} } );
		
		List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "Ibrahim", "Madina", "Ahmet", "Mehmet"));
		Predicate<String> removeET = Bir -> Bir.endsWith("et");
		
			names.removeIf(removeET);
			System.out.println(names);
		
		//TASK
			
			List<String> L1 = new ArrayList<>();
			L1.addAll(Arrays.asList("Muhtar", "Marufjon", "Akerke", "Asiya", "Meryem"));
		
			List<String> L2 = new ArrayList<>();
			
			L1.forEach(A -> {if (A.startsWith("M")) {L2.add(A);}});
			System.out.println(L2);
			
			L1.removeIf(M -> M.startsWith("M"));
			System.out.println(L1);
			
			
			
			
			
	}
	
	
	
	
	

}
