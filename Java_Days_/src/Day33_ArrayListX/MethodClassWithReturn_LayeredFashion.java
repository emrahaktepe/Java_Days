package Day33_ArrayListX;

public class MethodClassWithReturn_LayeredFashion {

	public static void main(String[] args) {
		
	int max1 = max1(5, 8, 11); // method cannot call itself
	
	System.out.println(max1);
	
	maximum(3, 5, 7);
	
	print1(345, 453, 534);
	
	int max2 = max1(5,66, 43, 27, 54);
	System.out.println(max2);
	
	}
	
	
	
	
	
	public static int max1(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static int max1(int a, int b, int c) {
		int largestNum = max1(a, b);
		return (largestNum > c) ? largestNum : c;
	// 	return (max1(a, b) > c) ? max1(a, b) : c;

	}
	
	public static void maximum(int a, int b, int c) {
		System.out.println(  max1(a, b, c)  );		
	}
	
	public static String print1(int a, int b, int c) {
		maximum(a, b, c);
		return "";
	}

	public static int max1(int a, int b, int c, int d) {
		int result = max1(a, b, c);
		if (result > d) {
			return result;
		}
		return d;
	}
	
	public static int max1(int a, int b, int c, int d, int e) {
		return max1 (  max1(a, b, c, d), e );
		
	}
	
}
	
	
