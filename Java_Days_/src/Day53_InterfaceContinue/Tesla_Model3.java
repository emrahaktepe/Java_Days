package Day53_InterfaceContinue;

public class Tesla_Model3 implements Cars, ElectricVehicles	{

	public void start() {
		System.out.println("Tesla Voice Control \"Tesla Start \" ");
	}
	
	public void Charge() {
		System.out.println("Charging");
	}
	
	public void SelfDrive() {
		System.out.println("Self Driving Mode");
	}
	
	@Override
	public void fly() {
		System.out.println("Tesla is flying");
	}
}
