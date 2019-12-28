package Day30_;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	/*
	 * ArrayList class: 1. presented in "java.util" package import java.util.
	 * ArrayList; 2. ArrayList does not support primitives 3. In Arraylist we store
	 * Objects only, all the values in ArrayList are objects(non-primitives) 4.
	 * ArrayList's size is automatically adjusted 5. ArrayList is ordered. Has index
	 * numbers
	 * 
	 * Decleration of ArrayList: ArrayList<ObjectType> variableName = new
	 * ArrayList<ObjectType>();
	 * 
	 */
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		ArrayList<Integer> list2 = new ArrayList<Integer>();

//	Methods of ArrayList;
//		 add(value): adds values to ArrayList. if the value is primitive 

		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);

//		.get(i) method:
		System.out.println(list.get(1));

//		.size() method:
		System.out.println(list.size());

//		.clear() method:
		list.clear();
		System.out.println(list.size());

//	Array vs ArrayList
//		1. 	Array size fixed, ArrayList size dynamic
//		2.	Array supports primitives and non-primitives, 
//			ArrayList does not support primitives 
//		

		Scanner scan = new Scanner(System.in);
		ArrayList<String> studentNames = new ArrayList<>();

		while (true) {
			System.out.println("Enter a name:");
			String name = scan.nextLine();
			studentNames.add(name);

			System.out.println("Would you like to add another name?");
			String answer = scan.nextLine().toLowerCase();

			if (!(answer.equals("yes") || answer.equals("no"))) {
				System.out.println("Invalid");
				break;
			}

			if (answer.equals("no")) {
				break;
			}
		}
		System.out.println(studentNames);

	}
}
