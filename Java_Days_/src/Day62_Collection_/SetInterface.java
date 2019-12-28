package Day62_Collection_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterface {
	
	public static void main(String[] args) {
		
		
	List<Integer> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList(100, 100, 100));
		System.out.println(list1);
		System.out.println(list1.get(0));
	
	Set<Integer> st1 = new HashSet<>();
		st1.add(100);
		st1.add(100);
		st1.add(100);
		
		System.out.println(st1);
	//	System.out.println(st1.get(0));	set does not have index number

		Set<Integer> hashSet = new HashSet<>();
			hashSet.add(100);
			hashSet.add(10);
			hashSet.add(5);
			hashSet.add(4);
			hashSet.add(100);

			
			System.out.println(hashSet);
		
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
			linkedHashSet.add(100);
			linkedHashSet.add(10);
			linkedHashSet.add(5);
			linkedHashSet.add(4);
			linkedHashSet.add(100);

			
			System.out.println(linkedHashSet);
			//doubly-linked: add() & remove() are faster in HashSet
			
		SortedSet<String> treeset = new TreeSet<>();
			treeset.add("Z");
			treeset.add("Y");
			treeset.add("X");
			treeset.add("W");
			treeset.add("V");
			treeset.add("U");
			
			System.out.println(treeset);
			
		//Task: remove duplicates from an ArrayList, and sort it
			
			List<Integer> list = new ArrayList<>();
			list.addAll(Arrays.asList(10, 10, 10, 10, 9, 8, 7, 6));
			Collections.sort(list);
			System.out.println(list);

			List<Integer> lisp = new ArrayList<>();
				lisp.addAll(Arrays.asList(10, 10, 10, 10,9,8,7,6));
			
			TreeSet<Integer> ts = new TreeSet<>(lisp);
				System.out.println(ts);
				
				
		//	Task: Write a program that can remove duplicates
		//	String str = "AAABBBCCDDDD"

			String str = "XXXYYZZAAABBBCCDDDD";
			String[] arr = str.split("");
			System.out.println(Arrays.toString(arr));
			
			TreeSet<String> ts1 = new TreeSet<>(Arrays.asList(arr));
			System.out.println(ts1);
			
			String result = ts1.toString().replace("[", "").replace("]", "").replace(", ", "");
			System.out.println(result);
			
			
			LinkedHashSet<String> linked1 = new LinkedHashSet<>(Arrays.asList(arr));
			System.out.println(linked1);
			
			String resultx = linked1.toString().replace("[", "").replace("]", "").replace(", ", "");
			System.out.println(resultx);
			
			Math.abs(10);
			
	}
	

}
