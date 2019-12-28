package Day65_Map_;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {
	
	public static void main(String[] args) {
		
		Map<String, Double> employees = new HashMap<>();
		
		//put();	adds keys and values
		
		employees.put("Emrah", 115_000.75);
		employees.put("Ismail", 120_000.50);
		employees.put("Yusuf", 90_000.00);

		
		System.out.println(employees);

		double salary1 = employees.get("Emrah");
		System.out.println("Salary 1: " + salary1);
		
		System.out.println("Salary 2: " + employees.get("Yusuf"));
		
		employees.remove("Yusuf");
		System.out.println(employees);
		
		System.out.println("Size is: " + employees.size());

		String employee55 = "Mehriban";
		double employee55S = 100_000;
		
		System.out.println("Map contains key " + employee55 +": "+ employees.containsKey("Mehriban"));
		System.out.println("Map contains value " + employee55S +": "+ employees.containsValue(100_000));

		Set<String> set = employees.keySet();
		System.out.println(set);
		
//		Hashtable<String, Integer> map2 = new Hashtable<>();
//		map2.put("A", null);
//		System.out.println(map2);
		
		TreeMap<String, Integer> map3 = new TreeMap<>();
		map3.put("Z", 1000);
		map3.put("Y", 5500);
		map3.put("V", 4000);
		System.out.println(map3);


		
		
	}
	
	
	
	

}
