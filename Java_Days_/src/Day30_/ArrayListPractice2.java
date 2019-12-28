package Day30_;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice2 {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<40; i++) {
		if(i%2!=0) {
			continue;
		}
		list.add(i);
		}
	System.out.println(list);
	
	System.out.println(list.size());
	
	for(int i=0; i<list.size(); i++) {
		System.out.print(list.get(i) + " ");
	}
	
	System.out.println("\n");
	
	for(Integer each : list) {
		System.out.print(each + " ");
	}
	System.out.println("\n");

	int num = list.get(7); // unboxing
	System.out.println(num);
	
	System.out.println("\n");
	
//	list.clear();
//	
//	System.out.println(list.get(2)); 	// wont print cuz it is empty
	
//	Sorting the ArrayList:
//	Collections.sort(variableName);
	
	
	ArrayList<Integer> list2 = new ArrayList<>();
	
	for(int i=20; i>0; i--) {
		list2.add(i);
	}
	System.out.println(list2);
	
	Collections.sort(list2);
	System.out.println(list2);

	
	
	
	}
}
