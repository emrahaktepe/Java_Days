package Day37_Objects;

public class Dog {

	//	Dog
	//		Attributes/data:
	//			breed, size, color, age, name, gender
	//		Actions:
	//			eat, sleep, bark, play
	
	String Breed;
	String Size;
	byte Age; 
	String Color;
	String Name;
	char Gender;
	String Food;
	
	public void getInfo() {
		
		System.out.println(Breed + " " + Size + ", " + Age + " years old " + Color + " color "+ " name " + Name + " " + Gender + " Gender");
		
	}
	
	public void eat() {
		
		System.out.println(Name + " is eating " + Food);
		
	}
	
	public void play() {
		
		System.out.println(Breed + " is playing.");
		
	}
	
	
}
