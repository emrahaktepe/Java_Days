package Day33_ArrayListX;

import java.util.ArrayList;

public class ArrayListReview_ {

	
	/*
	 ArrayList:
	 presented in "java.util
	 does nor support primitives, we can only assign objects
	 
	 decleration of ArrayList:
	 	ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<>();
	 
	 decleration of array:
	 	int[] arr = new int[5]
	 	
	 methods of ArrayList:
	 	add(object)
	 	get(index)
	 	size()
	 	clear()
	 	set(index number, object): the given object will replace the object at the given index number
	 
	 ArrayList vs Array:
	 
		ArrayList's size is dynnamic, Array's size is fixed
		ArrayList only supports no-primitives, Array supports all
		Array can be multidimensional but ArrayList cannot be multidimensional
	 
	 */
	
	public static void main(String[] args) {
	
		
	//	decleration of ArrayList:
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<>();

		
	//	add:
		ArrayList<String> shoppingList = new ArrayList<>();
			shoppingList.add("apple"); // index: 0, size 1
			shoppingList.add("orange"); // index: 1, size 2
			shoppingList.add("grape"); // index: 2, size 3
		System.out.println(shoppingList);
		
		//	add(index, object): adds the object at the given index number
			shoppingList.add(1, "strawberry");
		System.out.println(shoppingList);

		// shoppingList.add(5, "Toyota Corolla");
		// you cannot skip indexes on ArrayList
		// size is 4 so the index is 3, the new add should be index4 

		
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(0, 1);
		nums.add(1, 5);
		nums.add(2, 10);
		nums.add(3, 15);
		nums.add(1, 1);

		System.out.println(nums);
		
		//	get()index number: returns the object
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Homayra");
		names.add("Meri");
		names.add("Mihrigul");
		names.add("Tabriz");
		names.add("Asiya");
		
		String str1 = names.get(1);
		System.out.println(str1);

		//	size() returns the length of the ArrayList as an int value

		int length = names.size();
		System.out.println(length);
		
		for(int i = 0; i < names.size(); i++) {
			String each = names.get(i)+" ";
			System.out.print(each);
		}
		System.out.println("\n");

		for( String each : names) {
			System.out.print(each+" ");
		}
		
		System.out.println("\n");

		
		ArrayList<String> students = new ArrayList<>();
			students.add("Holy");
			students.add("Erhan");
			students.add("Nadira");
			students.add("Seyfo");
			students.add("Cihan");
		
		System.out.println(students);
		students.clear();
		System.out.println(students);
		

		//set(index number, object)
		
		ArrayList<String> Javengers = new ArrayList<>();
			Javengers.add("Ferhat");
			Javengers.add("Lexi");
			Javengers.add("Asiya");
			Javengers.add("Ozgen");
			Javengers.add("Alex");
			Javengers.add(1, "Safwan");

		Javengers.set(2, "Maral");
		System.out.println(Javengers);
		
		
		//contains(object): checks if the given object is contained in the ArrayList or not

		ArrayList<String> goodGuys = new ArrayList<>();
		
			goodGuys.add("Munevver");
			goodGuys.add("Dinara");
			goodGuys.add("Aktoty");
			goodGuys.add("Yusuf");
			goodGuys.add("Djaloliddin");
			goodGuys.add("Waris");
			goodGuys.add("Zulfiye");
			goodGuys.add("Hatice");
			goodGuys.add("Mehmet");
		
		boolean result = goodGuys.contains("Muhtar");
		System.out.println(result);
		
		//equals(object): checks if the two ArrayLists are equal or not

		ArrayList<String> badGuys = new ArrayList<>();
		
			badGuys.add("Muhtar");
			badGuys.add("Asiya");
			badGuys.add("Replit");
		
		// it checks if ArrayLists goodGuys & badGuys are equal 
		boolean result1 = badGuys.equals(goodGuys);
		System.out.println(result1);

			badGuys.set(0, "Munevver");
			badGuys.set(1, "Dinara");
			badGuys.set(2, "Aktoty");
			badGuys.add("Yusuf");
			badGuys.add("Djaloliddin");
			badGuys.add("Waris");
			badGuys.add("Zulfiye");
			badGuys.add("Hatice");
			badGuys.add("Mehmet");

		boolean result2 = badGuys.equals(goodGuys);
		System.out.println(result2);
				
		//remove(int): removes the index

		ArrayList<Integer> lists = new ArrayList<>();
			lists.add( 1 );
			lists.add( 2 );
			lists.add( 3 );
			lists.add( 4 );
			lists.add( 5 );
		
		lists.remove( 1 );
		System.out.println(lists);
		System.out.println(lists.size());
		
		lists.remove( 3 );
		System.out.println(lists);
		System.out.println(lists.size());
		
		System.out.println("============================================\n");

		//remove(Integer): removes the first matching object, at the same time returns a boolean 

			
		ArrayList<Integer> lists2 = new ArrayList<>();
			lists2.add( 1 );
			lists2.add( 2 );
			lists2.add( 3 );
			lists2.add( 4 );
			lists2.add( 5 );
		
		Integer a = 1;
		boolean r1 = lists2.remove(a);
		System.out.println(lists2);
		System.out.println(r1);
		
		System.out.println("============================================\n");

		ArrayList<String> cities = new ArrayList<>();
			cities.add( "Miami" );
			cities.add( "Miami" );
			cities.add( "Dallas" );
			cities.add( "Istanbul" );
			cities.add( "Erzincan" );
			cities.add( "Urumqi" );
		
		if(cities.remove("Miami") ) {
			cities.remove(2);
		}
		
		cities.add(3, "New Orleans");
		
		System.out.println(cities);
		
		System.out.println("============================================\n");

		ArrayList<Integer> price = new ArrayList<>();
		price.add( 1 );
		price.add( 2 );
		price.add( 3 );
		price.add( 4 );
		price.add( 5 );
		
		price.remove(Integer.parseInt("2") ); //parse method returns primitive
		System.out.println(price);
		
		boolean r3 = price.remove(Integer.valueOf("3") ); //valueOf class returns wrapper class
		System.out.println(price);
		System.out.println(r3);
		
		
	}
}
