package Day41_InitializerBlocks;

public class StaticBlock {
	
	// Static block is executed as soon as the class is loaded
	
	//static block execution DOES NOT depend on the object
	
	public StaticBlock() {
		System.out.println("This is constructor.");
	}

	
	
	public static void main(String[] args) {
		
		StaticBlock obj1 = new StaticBlock();
		StaticBlock obj2 = new StaticBlock();
		StaticBlock obj3 = new StaticBlock();
		StaticBlock obj4 = new StaticBlock();
		StaticBlock obj5 = new StaticBlock();

		System.out.println("Main method is here.");
		
	}
	
	static {
		System.out.println("Static Block is printed.");
	}
	
	
	static {
		System.out.println("Second Static Block is printed.");
	}
}
