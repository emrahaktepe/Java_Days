package Day45_Inheritance;

class Data{
	
	public String name;
	private String age;
	String ID;
	protected String DOB;


	public void Hello() {
		System.out.println("Hello");
	}
	
	private void Hola() {
		System.out.println("Hola");
	}
	
	void Aloha() {
		System.out.println("Aloha");
	}

}
public class MultiClassPractice {
	
	public static void main(String[] args) {
		
		Data obj = new Data();
		System.out.println(obj.name);	//	public is visible everywhere
		// System.out.println(obj.age);	//	private is not visible outside the class
		System.out.println(obj.ID);		//	default instance variable is visible in the same package

		// if default instance variable was in another package it wouldn't be visible in this package
		
		
	}
	
}
