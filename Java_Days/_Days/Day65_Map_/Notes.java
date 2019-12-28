package Day65_Map_;

/*

 		Data Structures:
 			-Arrays
 			-Collections framework
 			-Map
 			
 		Map Interface: accepts key and value, both key and value does not support primitives. 
 		Key cannot be duplicated, Value can be duplicated
 		
 			MAP DOES NOT ACCEPT DUPLICATED KEYS, BUT ACCEPTS DUPLICATED VALUES
 			
 			Set<Values>
 			Map<Key, Value>
 			
 			implemented by HashMap(C), LinkedHashMap(C), HashTable(C)
 			
 			extended by SortedMap(I)
 			
 			SortedMap(I) is implemented by TreeMap(C)
 			
 			Map<Key, Value>  map1 = new HashMap<>();
 			Map<Key, Value>  map2 = new LinkedHashMap<>();
 			Map<Key, Value>  map3 = new HashTable<>();
 			Map<Key, Value>  map1 = new TreeMap<>();
 			
 			SortedMap<Key, Value> = new TreeMap<>();
 		
 		
 		
 		
 		
 		Map Interface:
 		
 		put(key, value); inserts key and value objects to the map
 		
 		get(key);		retrives the value of the given key
 		
 		remove(key);	removes the given key object and its value
 		
 		size();			returns the size of the map
 		
 		containsKey(key);	verifies if the given Key is exist in the map. returns boolean
 		
 		HashMap(C):			does not maintain the insertion order as is
 		
 		LinkedHashMap(C):	maintains the insertion order as is.
 							doubly linked:	put() & remove() methods work faster
 							get() method works slower
 							
 		HashTable(C): 	Key and Value cannot be null. no null allowed
 						Is synchronized ==> Thread-Safe
 						very slow
 		
		TreeMap(C) : 	implementing SortedMap
						sorts the keys in ascending order
						
		
		
 */



public class Notes {

}
