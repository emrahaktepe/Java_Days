package Day62_Collection_;

/*
 	Agenda: 
    Morning: Java
    Afternoon: Selenium
	
	Data Structures: In order to manage data efficiently and in an orginized manner, we need data structures
            -- Array
            -- Collections FrameWork
            -- Maps
	
	Array: Collection of Data (same data type)
        size is fixed
        index numbers
        can be multi-dimensional
        supports primitives & objects
        can have duplicates
	
	Collections framework: consists of multiple interfaces, each interfaces has multiple implementations
        
        Interfaces in Collections frame work:
                1. Iterable
                2. Collection
                3. List
                4. Set
                5. SortedSet
                6. Queue
                7. Deque
            all those interfaces are presented in java.util package
            ONLY supports Objects
            		
	Iterable (I): 	root interface, super type of all the interfaces in collections framework
	Collection (I): extended by three interfacses: List(I), Set(I), Queue(I)
    List(I):  		implemented By ArrayList(C), LinkedList(C), Vector(C)
                has index numbers, dynamic sized, accepts duplicates
                    List<Integer> list1 = new ArrayList<>();
                    List<String> list2 = new LinkedList<>();
                    List<Double> list3 = new Vector<>();
                    List<Integer> list4 = new Stack<>();
    ArrayList: array based class, internally uses the array
                
                	
 	LinkedList:	each objects are doublly linked in the LinkedList
 		doublly linked:	adding and removing data is faster add(), remove()
 						retrieving data is slower
 						is not an Array based class
 		
 	Vector:		is synchronized, only preferred in multi-threads
 		
 		advantage:	thread safe in multi-thread 
 		dis-adv:	slower
 		has a child class called Stack
 		
 		Stack:	synchronized 
 				pop(); LIFO (last in first out) removes the last object from the stack
 		
 		synchronized keyword: used to achive ==> tThread safe in multi-thread environment
 		multi-thread:	multiple threads trying to get access to the same resource	
 		
 		
 	Set(I):		does not take duplicates, does not have index numbers
 				implemented by HashSet(C), LinkedHashSet(C)
 				extended by SortedSet(I)
 				SortedSet is implemented by TreeSet(C)
 				
 				Set<Integer> st1 = new HashSet<>();
 				Set<Integer> st1 = new LinkedHashSet<>();
				Set<Integer> st1 = new TreeSet<>();

				ONLY accepts unique numbers
				
				
		HashSet:		
		
		LinkedHashSet:
 		
 */





public class Notes {

}
