package Day50_Abstraction;

public abstract class Animal {

	//	data/attributes: gender, age, color, nickname
	
	public char gender;
	public byte age;
	public String color;
	public String nickname;
	
	public Animal(char gender, byte age, String color, String nickname) {
		this.gender = gender;
		this.age = age;
		this.color = color;
		this.nickname = nickname;
	}
	
	//	actions: speak(), eat(), sleep(), drink()
	//	Access-Modifier		abstract 	return-type		name(parameter)
	//	Access-Modifier:	public		protected		default
	//	return-type:	void		primitives		non-primitives(object)
	//	parameter:		any data type()primitive or non-primitive
	
	public abstract void speak();
	public abstract void eat(String food);
	public abstract void sleep(int hour);
	public abstract void drink(String drink);
	
	public void getInfo() {
		System.out.println("Nickname is " + nickname);
		System.out.println("Gender is " + gender);
		System.out.println("Color is " + color);
		System.out.println("Age is " + age);
		System.out.println("==============================\n");

	}

	
	
}
