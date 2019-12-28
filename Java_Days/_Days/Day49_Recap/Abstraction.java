package Day49_Recap;

public abstract class Abstraction {

	public abstract void startTheCar();

}

class Toyota extends Abstraction {
	
	//	public abstract void startTheCar();
	
	@Override
	public void startTheCar() {
		System.out.println("brake");
		System.out.println("puch the start button");
		System.out.println("release the brake");

	}
	
	public static void main(String[] args) {
		// Abstraction obj = new Abstraction();
	}
}

class Tesla extends Abstraction{
	//	regular class MUST implement the abstract method from the abstract class
	
	public void startTheCar() {
		System.out.println("voice control");
		System.out.println("driver");
	}
	
	
}