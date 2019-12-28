package Day08_ShorthandOperators;

public class ShorthandOperators {
	
	/*
	  += : addition assignment
	  -= : subtraction assignment 
	  *= : multiplication assignment x *= y ===> x=x*y
	  /= : division assignment
	  %= : remainder assignment  	x%= y = x = 
	  
	 */
	
	
	public static void main(String[] args) {
		
		int a = 9;
		// instead of this a = a+3;
		a += 3;
		System.out.println(a);
		
		int b = a += 5;
		System.out.println(b);
		
		int c = a+=b;
		System.out.println(c); //a=34 c=34 b=17
		
		int d = a += c;
		System.out.println(d); //a=68 d=68 c=34 b=17
		
		int e = (d+=b) * 2;
		System.out.println(e); // d=85 b=17 e=170 a=68 c=34
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		
		int f = b += d * 2;
				//b +=170 ===> 17+170 = 187
		System.out.println(f);
		
		System.out.println(" ");

		//-=
		
		int g = 101;
		int h = g-=1;
		System.out.println(h);
		
		int i = g +=h+5;
		System.out.println(i); // g=205 i=205 h=100
		
		int j= h -= g % i;		// h=100 j=100
		System.out.println(j); //100 += 205%205
		
		int k = j-= h * 2 %5;
			//  100 -= 200%5 ===> 100-0 ===> 100
		System.out.println(k);
		System.out.println(j);
		System.out.println(i);

		System.out.println(" ");

		// *=
		
		int A = 100;
		A*= 200;
		System.out.println(A);
		
		int B = 100;
		B *= 100 / 10; // B *= (100/10) 10 ===> 1000
		System.out.println(B); // B=1000
			
		System.out.println(B *= B-1000);
		
		// Can you explain why "B * B - 100" is =calculated different from "B *= B - 100"
		
		System.out.println(" ");

		// /=
		
		int C = 1000;
		C /= 5;
		int D = 10;		
		System.out.println(C);
		
		C /= D=+10;
		System.out.println(C);
		
		System.out.println(" ");

		// %=
		
		// int z = 10 % 3; // 10/3 = 3 remainder 1
		
		int E = 10;
		E %= 2;
		System.out.println(E);
		
		int F = 100;
		F%=2; // F = F%2; ===> 0
		System.out.println(F);
		
		System.out.println(10.5%3);
	 	
		
	int J = 300;
	int K = 10;
	J+=  J %+ K;
	
	System.out.println(J);
	System.out.println(K);

	}

}
