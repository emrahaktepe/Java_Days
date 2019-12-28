package Day37_Objects;

public class DogObjects {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
		System.out.println(dog1.Name);
		
		dog1.Breed = "Husky";
		dog1.Size = "Small";
		dog1.Color = "Black and White";
		dog1.Name = "Holly";
		dog1.Gender = 'F';
		dog1.Age = 2;
		dog1.Food = "Salmon";
		

		dog1.getInfo();
		
		Dog dog2 = new Dog();

		dog2.Breed = "Kangal";
		dog2.Size = "Large";
		dog2.Color = "Gray";
		dog2.Name = "Lyka";
		dog2.Gender = 'M';
		dog2.Age = 3;
		dog2.Food = "Chicken";
		
		dog2.getInfo();

		
		dog1.eat();
		dog2.eat();
		
		dog1.play();
		dog2.play();
		
		String str = new String("Hello");
			str.toLowerCase();
		
	}
	
	
}
