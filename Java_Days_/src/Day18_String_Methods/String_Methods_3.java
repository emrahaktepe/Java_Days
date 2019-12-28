package Day18_String_Methods;

public class String_Methods_3 {

	/*
	 indexOf(): returns the index number of the first character in the given string
	 
	 */
	
	public static void main(String[] args) {
	
	String Address = "305 Rolling Oak Dr. Murphy, TX 75094";
	
	int begin = Address.indexOf(".")+2;
	int end = Address.indexOf(", V");
	
	String cityName = Address.substring(begin, end);
	
	System.out.println(cityName);
	
	
	}
}
