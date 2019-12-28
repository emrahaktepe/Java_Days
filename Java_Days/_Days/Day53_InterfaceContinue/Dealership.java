package Day53_InterfaceContinue;

public class Dealership {

	public static void main(String[] args) {

		Tesla_Model3 obj1 = new Tesla_Model3();

		obj1.start();
		obj1.fly();

		Jeep_Wrangler obj2 = new Jeep_Wrangler();

		obj2.start();
		obj2.PumpGas();
		
		Toyota_Prius obj3 = new Toyota_Prius();
			obj3.PumpGas();
			obj3.Charge();

	}

}
