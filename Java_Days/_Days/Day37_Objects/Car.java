package Day37_Objects;

public class Car {

	//	car
	//		data/attribute
	//			model, year, brand, color, price, mileage, VIN
	//		actions
	//			start, drive, accelerate, stop, drift, brake, get ticket
	
	String Model;
	int Year;
	String Brand;
	String Color;
	double Price;
	long Mileage;
	
	public void drive() {
		System.out.println("Driving "+ Brand);
	}
	
	public void start() {
        System.out.println(Brand+" is started ");
    }
    
    // 2020 Toyota corolla, white, 10000 miles,1000$
    public void getInfo() {
    System.out.println(Year+" "+Brand+" "+Model+", " + Color + ", " + Mileage+ " miles"+", $"+Price);
    }
}
