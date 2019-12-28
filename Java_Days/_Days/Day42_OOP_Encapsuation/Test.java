package Day42_OOP_Encapsuation;

public class Test {
	
	public static void main(String[] args) {
		
		TestData obj = new TestData();
		//	System.out.println(obj.name);
		
		System.out.println(obj.getName());
		
		System.out.println(obj.getID());
		
		obj.setName("Shakir");
		
		System.out.println(obj.getName());
		
		obj.setID(436);
		System.out.println(obj.getID());
		
	}
	
	
	
	
	

}
