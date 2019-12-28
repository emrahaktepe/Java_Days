package Day56_Polymorphism;

public interface IntIntt {

abstract void print();	
}

class Test implements IntIntt{
	
	@Override
	public void print() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		IntIntt obj = new Test();
		obj.print();
	}

	
}