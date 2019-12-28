package Day39_;

import java.text.DecimalFormat;
import java.text.Format;

public class DecimalFormatting {

	
	public static void main(String[] args) {
		
		DecimalFormat format = new DecimalFormat("0.00");
		
		double b = 23.1234567543;
		
		String num1 = format.format(b);
		System.out.println(num1);
		
		double c = 45.56789;
		System.out.println(   format.format(c));
		
		c = Double.parseDouble(  format.format(c));
		
		System.out.println(c+1);
			
		// check out printf documentation
			System.out.printf("%.2f", b);	
				
	}
}
