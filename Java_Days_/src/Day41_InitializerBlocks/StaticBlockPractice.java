package Day41_InitializerBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlockPractice {

	public static String name;	
	public static int[] arr1;
	public static ArrayList<String> list = new ArrayList<>();
	
	static {
		name = "Suna";
		arr1 = new int[5];
		arr1[0] = 1;
		arr1[2] = 3;
		
		list.add("Coffee");
		list.add("Tea");
	}
	
	static {
		name = "Abuzer";
		arr1 = new int[3];
		arr1[1] = 2;
		
		list.add("Break");
	}
	
	public static void main(String[] args) {
		
		StaticBlockPractice obj = new StaticBlockPractice();
		
		System.out.println(name);
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(list);
		
	}
	public StaticBlockPractice(){
		name="Mehmet";
	}
	
	
}
