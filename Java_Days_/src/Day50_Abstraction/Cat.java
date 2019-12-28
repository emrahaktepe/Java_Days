package Day50_Abstraction;

public class Cat extends Animal {

	public Cat(char gender, byte age, String color, String nickname) {
		super(gender, age, color, nickname);
	}

	@Override
	public void speak() {
		System.out.println(nickname + " speaks the MEOW language");		
	}

	@Override
	public void eat(String food) {
		System.out.println(nickname + " eats " + food);		
	}

	@Override
	public void sleep(int hour) {
		System.out.println(nickname + " sleeps " + hour + " hours a day");
		
	}

	@Override
	public void drink(String drink) {
		System.out.println(nickname + " drinks " + drink);		

		
	}
	
	//	Overriding: same method name, same parameter, same return-type
	//	access modifier: same or more visible
	//	must override in the sub class
	//	@Override must be applicable 
	
}
