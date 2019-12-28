package Day36_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask {

	/*
	 WarmUp:
    1. write a return method that can remove the duplicated objects from an Integer arraylist
    2. write a return method that can remove the duplicated objects from a String arraylist
    3. write a return method that can remove the duplicated objects from a Character arraylist
    4. write a return method that can remove the duplicated objects from a Double arraylist
	 */
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,4,4,5,5,6,6,6));	
		
				ArrayList<Integer> list1 = rmvDups2(list);
				
				System.out.println(list);

				System.out.println(list1);
		
	}
	
	public static ArrayList<Integer> rmvDups(ArrayList<Integer> list){
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for( Integer each : list) {
			if(!result.contains(each)) {
				result.add( each );
			}
		}
		return result;
	}
	
public static ArrayList<Integer> rmvDups2(ArrayList<Integer> list){
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for( int i = 0; i < list.size(); i++) {
			if( ! result.contains(list.get(i))) {
				result.add(  list.get(i) );
			}
		}
		return result;
	}
}
