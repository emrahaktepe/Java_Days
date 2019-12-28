package Day21_WhileLoop;

public class _WarmUpTask1 {

	
	public static void main(String[] args) {
		
		String sentence = "I like books, I have books, I need more books";
		// 						  i, i+4 ==> book
		int count = 0;
		
		for(int i =0; i<sentence.length()-3; i++) {
		// 		16            17 is length	
			if(sentence.substring(i, i+4).equals("book")) {
				// substring 	  0, 4
				// substring 	  1, 5
				// substring 	  2, 6
				// substring 	  3, 7
				// substring 	 16, 20 
				count++;
			}
		}
		System.out.println(count);
	
//	SPLIT FUNCTION - NEEDS EXTRA CONTROL for books instead of book
//	String[] sentenceSplited = sentence.split("books");
//	System.out.println(sentenceSplited.length);
		
	
	
	String words = "Cybertek is the school I go to, Cybertek is an ok school and Ceybertek students hope to find good jobs.";
	
	int nTimes = 0;
	for (int i = 0; i < words.length()-7; i++) {
		if(words.substring(i, i+8).equals("Cybertek")){
			nTimes++;
		}
	}
	System.out.println(nTimes);
	
	String sent = "I like book, I read a lot of books, book, book";
	int count1 = 0;
	
	while ( sent.contains("book") ){
			count1++;
			sent = sent.replaceFirst("book", "");
	}
	System.out.println(count1);
	

}
}