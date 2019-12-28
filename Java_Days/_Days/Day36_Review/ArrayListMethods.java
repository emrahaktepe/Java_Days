package Day36_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

	//	ArrayList Methods:
	//	add()
	//	get()
	//	clear()
	//	set()
	//	size()
	//	indexOf()
	//	lastIndexOf()
	//	remove()
	//	equals()
	//	isEmpty()
	//	contains()
	//	addAll()
	//	removeAll()
	//	sort()
	//	Arrays.asList()

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>();
	//	add(object): takes and object
		list.add( 10 );	//	Auto-boxing
		list.add( 20 );

	//	add(index, object):	it will insert the given object to the given index
		list.add(1, 30);
		
	//	list.add(4, 40);	//	ArrayList' size is dynamic, we cannot skip indexes
		list.add( 3, 50);
		
	//	get(index):	returns the object at the given index
		System.out.println(list.get(3));	//	50
		System.out.println(list.get(1));	//	30

	//	size():	returns the total number of elements in the list. like length
		System.out.println(list.size()); 	// 4
			// last index number: list.size()-1
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.print("\n");
		
		for(int i = list.size()-1; i >= 0 ; i--) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.print("\n");

	//	clear():	removes all objects from the array list
		list.clear();
		System.out.println(list);
		
		ArrayList<String> students = new ArrayList<>();
			students.add("Erhan");
			students.add("Homayra");
			students.add("Rahwa");
			students.add("Arzu");
			students.add("Mehmet");

			System.out.print(students+ " ");

			students.set(0, "Holly");
			System.out.print("\n");

		
			System.out.print(students + " ");
			System.out.print("\n");

	//	indexOf(Object):	returns the first matching object's index
			
		System.out.println(students.indexOf("Rahwa"));
			
	//	lastIndexOf(Object):	returns the last matching object's index
	
		System.out.println(students.lastIndexOf("Rahwa"));
	
		ArrayList<String> students2 = new ArrayList<>(Arrays.asList("A", "B", "C"));

		System.out.println(students.equals(students2));	//	false
			
		students = students2;
		
		System.out.println(students.equals(students2)); //	true
			
	//	contains(object): checks if the given object is contained in the ArrayList	
		
		System.out.println(students.contains("Rahwa")); //	false
		
		
		
		
	}
	
}
