package Day23_Arrays;

public class ArrayClass {
	
	public static void main(String[] args) {
		
        /*
        Arrays:
        
        */
   // int a = "a";
       
       int[] arr = { 1,  2 };
       
       String[] names = { "Nigar" ,"Sumeyya", "Madina", "Juline" } ;
       //                  0          1        2          3
       
       System.out.println(  names[0]  );
       System.out.println(  names[1]  );
       
       String str1 = names[2] ;
       String str2 = names[3] ;
       
       System.out.println( str1 );
       System.out.println( str2 );
       
       //  System.out.println(names[4]);
       
       double[] myArray = { 1, 2, 3, 4, 5, 8, 0,  2};
       // index:            0  1  2   3  4  5  6  7
       
       for(int i=0; i < 8; i++ ) {
           System.out.print(  myArray[i] +"  ");
       }
       System.out.println();
       
//     length of Array:        
       String str="ABC";
           int A = str.length();
           System.out.println(A);  // 3
		
		int[] Numbers = {12, 24, 48, 96, 2, 3, 45, 6, 7, 8, 9, 10, 11};
		
		for(int i = 0; i < Numbers.length; i++) {
			int sNew = Numbers[i];
			System.out.print(sNew+" ");
		}
		System.out.println();
		// TRY TO PRINT THE ELEMENTS IN THE NUMBERS ARRAY FROM BIGGEST TO SMALLEST
		
		char [] myChars = {'a', 'b', 'c', 'd'};
		int highestIndexNum2 = myChars.length -1;
		System.out.println(highestIndexNum2);
	}

}
