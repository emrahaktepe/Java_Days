package Day50_Abstraction;

public class Zoo {
	public static void main(String[] args) {

		Cat Cleo = new Cat('F', (byte)5, "Gray", "Cleo");
		
//		System.out.println("Name is " + Cleo.nickname);
//		System.out.println("Gender is " + Cleo.gender);
//		System.out.println("Color is " + Cleo.color);
//		System.out.println("Age is " + Cleo.age);

		Cleo.getInfo();
		
		Cat Tekir = new Cat('M', (byte)6, "Black", "Tekir");
		Tekir.getInfo();
		
		Tekir.sleep(6);
		Tekir.eat("tuna fish");
		Tekir.drink("milk");
		Tekir.speak();
		
		System.out.println("==============================\n");

		
		Dog Karabas = new Dog('M', (byte)10, "Black", "Karabas");
		Karabas.getInfo();
		
		Karabas.sleep(12);
		Karabas.eat("meat");
		Karabas.drink("coca cola");
		Karabas.speak();
		
		
		
	}
	

}
