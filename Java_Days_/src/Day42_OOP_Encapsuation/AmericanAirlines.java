package Day42_OOP_Encapsuation;

public class AmericanAirlines {

	
	public static void main(String[] args) {
		
		EmployeeInfo Emrah = new EmployeeInfo();

		Emrah.setName("Emrah");
		System.out.println(Emrah.getName());
		
		
		Emrah.setInfo("Emrah", 123_45_6789, (byte)38, 120_000);
		System.out.println(Emrah.getName());
		System.out.println(Emrah.getSSN());
		System.out.println("$"+Emrah.getSalary());
		
	}
	

}
