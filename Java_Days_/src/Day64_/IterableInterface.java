package Day64_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IterableInterface {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 1, 1, 1, 1));

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 1) {
				list.remove(i);
			}

		}
		System.out.println(list);

		List<Integer> list2 = new ArrayList<>();
		list2.addAll(Arrays.asList(1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 1, 1, 1, 1));

		Iterator<Integer> it = list2.iterator();
		boolean a = it.hasNext();
		System.out.println(a);
		
//		==============
		
		String[] name = {"Kadir", "Nadira", "Yusuf", "Abuzer", "Nurullah"};
		
		Set<String> names = new LinkedHashSet<String>();
		names.addAll(Arrays.asList(name));
		
		Iterator<String> removeE = names.iterator();
		
		while(removeE.hasNext()) {
			String str = removeE.next();
//			if(str.contains("e") || str.contains("E"));
			if(str.toLowerCase().contains("e")) {
				removeE.remove();
			}
		}
		System.out.println(names);
		
		List<Integer> myList = new ArrayList<>();
		myList.addAll(Arrays.asList(100, 900, 500, 99, 200, 89, 300, 79));
		
		for(Iterator<Integer> itr = myList.iterator(); itr.hasNext(); ) {
			int numbers = itr.next();
			if(numbers>100) {
				itr.remove();
			}
		}
		System.out.println(myList);
		
		String[] students = {"Ali", "Veli", "Ali", "Abuzer", "Ali", "Abuzittin", "Ali", "Mehmet"};
		
		List<String> nameList = new ArrayList<>();
		nameList.addAll(Arrays.asList(students));
		
		for(Iterator<String> itr = nameList.iterator(); itr.hasNext(); ) {
			String str = itr.next();
			if(str.equals("Ali")) {
				itr.remove();
			}
		}
		
		System.out.println(nameList);
		
	}

}
