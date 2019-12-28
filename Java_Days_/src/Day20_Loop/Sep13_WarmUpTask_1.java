package Day20_Loop;

public class Sep13_WarmUpTask_1 {

	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=0; i<=1000; i++) sum += i; {
		System.out.println("The total sum of numbers from 0 to 100 is :" + sum);
		}
		
		int sum1 = 0;
		for(int ii=0; ii<=1000; ii+=2) sum1+=ii; {
		
				System.out.println("The total sum of even numbers from 0 to 100 is :" + sum1);
		}
		
		
		int sum2 = 0;
		for(int iii=1; iii<=1000; iii+=2) sum2+=iii; {
			
			System.out.println("The total sum of even numbers from 0 to 100 is :" + sum2);
	}
		
		
		int sumX = 0;
		for(int x = 1; x <= 1000; x++) {
		if( x % 2 == 0) {
			sumX +=x;
		}
		}
		System.out.println(sumX);
	}
}
