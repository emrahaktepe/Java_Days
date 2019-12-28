package Day09_;

import java.text.NumberFormat;

public class Deneme1 {

	public static void main(String[] args) {
		
		int result4 = (int) Math.round(Math.random() * 100);
        System.out.println(result4);	
        
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	String result1 = currency.format(1234567.891);
	System.out.println();
	
	
	
	}
	
}
