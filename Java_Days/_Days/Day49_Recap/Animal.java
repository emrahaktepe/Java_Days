package Day49_Recap;

public abstract class Animal {
	
	public abstract void eat();
	public abstract void sleep();

	public static void main(String[] args) {
		
	}
	
}

class Cat extends Animal{
	
	@Override
	public void eat() {
		System.out.println("cat eats fish");
	}
	
	@Override
	public void sleep() {
		System.out.println("cat sleeps 14 hours");
	}
	
}

class Crocodile extends Animal{
	@Override
	public void eat() {
		System.out.println("crocodile eats humans");
	}
	
	@Override
	public void sleep() {
		System.out.println("crocodile sleeps 9 hours");
	}
}

class Test{
	public static void main(String[] args) {
		
		
		Crocodile obj = new Crocodile();
		obj.eat();
		
		Cat obj2 = new Cat();
		obj2.eat();
	}
}