package Day54_Polymorphisim;

class Animal{
	
	public void talk() {
		System.out.println("Animal ic talking");
	}
	
}

class Tiger extends Animal{
	public void hunts() {
		System.out.println("Tiger is hunting");
	}
	
	public void Talk() {
		System.out.println("Tiger is talking tigerish");
	}
}

class Octopus extends Animal{
	public void swim() {
		System.out.println("Octopus is swimming");

	}
	
	public void Talk() {
		System.out.println("Octopus is talking gologolo");
	}
}



public class Zoo_ {
	Tiger tiger1 = new Tiger();
	Tiger[] Tigers = {tiger1, new Tiger()};
	
	Octopus octopus1 = new Octopus();
	Octopus[] Octopuses = {octopus1, new Octopus()};
	
	Animal animal1 = new Tiger();
	Animal animal2 = new Octopus();
	
	
	
}