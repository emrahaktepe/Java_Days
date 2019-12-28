package Day22_NestedLoop;

public class WarmUpTask_1 {

	public static void main(String[] args) {
		
		String nums = ""; // "" +1 + 2 + 3 + 4 + 5 + 6 + ....
		int i = 1;
		
		while(i <= 30) {
			
			nums += ( i % 3 == 0 && i % 5 == 0 ) ? "FINRA"
					: ( i % 3 == 0) ? "FIN"
						: ( i % 5 == 0) ? "RA"
							: i+" ";
			
//		 if( i % 3 == 0 && i % 5 == 0 ) {
//			nums +=	"FINRA ";
//		 }
//			else if (i % 3 == 0) {
//			nums += "FIN ";
//			}
//				else if (i % 5 == 0) {
//					nums += "RA ";
//				}
//					else {
//						nums += i + " ";
//					}
			i++;

		}
		System.out.print(nums);		
		
		
		
		
		
		
		
		
	}
	
}
