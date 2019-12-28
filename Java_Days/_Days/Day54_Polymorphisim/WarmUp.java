package Day54_Polymorphisim;

public class WarmUp {

	//	Encapsulation:	Hiding data, reaching to data by getters and setters
	//	Inheritance:	Super and sub relationship, sub class gets reached
	//	Abstraction:	Hiding the implementation, focusing on what is important (abstract class & Interface)
	//	Polymorphism:	Object to behave 
	//					Occurs when the super class is reference type, and object is created
	//					from the classes that have is a relation with the super class/inheritance
	//					WebDriver driver = new ChromeDriver();
	//					WebDriver driver = new FireFoxDriver();

	/*
	 	WarmUp:
    	Create a class called Animal (Donot use abstraction for now):
                Actions: Talk()
    	create sub classes of Animal class:
                1. Tiger:
                        Actions: Hunts()
                2. Octopus:
                        Actions: Swim()
        override super class' instance method Talk()
    	create a class called Zoo:
            Create Arrays of Tiger
            Create Arrays of Octopu
	 */
	
		/*
		 	is a relation:	is inherited relationship between classes
		 		Ex:	class Dog extends Animal
		 			class Husky extends Dog
		 			
		 			Dog is an Animal.
		 			Husky is a dog.
		 			Husky is an Animal.
			
			has a relationship:	instance of the class(object) is used in other classes
			
			class Car{
			Engine obj = new Engine();
			}
			
			clas Zoo{
			Tiger obj1 = new Tiger();
			Octopus obj2 = new Octopus();
			Animal obj3 = new Tiger();
			}
			
			Zoo has a Tiger
			Zoo has an Octopus
			
			
		 */
	
	
	
	
	
	
}
