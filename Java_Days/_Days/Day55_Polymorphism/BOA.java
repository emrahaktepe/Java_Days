package Day55_Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

/*
	WarmUp:         
1. create an abstract class called ScrumTeam
    Data: Name
          JobTitile
          Salary
    Actions: DailyStandUp();
             Demo();
2. Create the following sub classes of ScrumTeam:
        1. Testers:
                Actions: FindBug
        2. Developers:
                Actions: FixBug
3. Create a class called BOF
    create Array of Testers named sdets, at leats store two objects
    create array of Developers named dev, at least store three objects
    create ArrayList of ScrumTeam:
            store all the developer' and testers' objects

*/

//	Polymorphism:	behaviors of object in multiple ways
//	occurs when parent /Interface is reference type, and object is created from sub class (non abstract)
//	if abstract class is refrence type object needs to be created from non abstract sub class
//	if interface is reference type object needs to be created from the classes that's implementing the interface
//	EX:	WebDriver driver = new ChromeDriver();
//				driver.get
//				driver.navigate

//	Reference type decides what can be accessible 

//	is a :	inherited relationship between classes
//	has a :	

//	We cannot create objects from Interface and abstract class because abstraction is not concrete

abstract class ScrumTeam{

	public String Name;
	public String JobTitle;
	public double Salary;
	
	public abstract void DailyStandUp();
	public abstract void Demo();
	
	public void getEmployeeInfo() {
		System.out.println("===================================");
		System.out.println("Employee name: " + Name);
		System.out.println("Job Title: " + JobTitle);
		System.out.println("Salary is: $" + Salary);
	}
}
	
	class Developers extends ScrumTeam{
		
		public Developers(String Name, String JobTitle, double Salary) {
			this.Name = Name;
			this.JobTitle = JobTitle;
			this.Salary = Salary;
		}
		
		public void DailyStandUp() {
			System.out.println("Developer " + Name +  " is talking.");
		}
		
		public void Demo() {
			System.out.println("Developer " + Name +  " is doing demo.");
		}
		
	}

	
	class Testers extends ScrumTeam{
		
		//	Name, JobTitle, Salary
		
		public Testers(String Name, String JobTitle, double Salary) {
			this.Name = Name;
			this.JobTitle = JobTitle;
			this.Salary = Salary;
		}
		
		//	Object:
		//	ClassName	objectName = 	new		Constructor
		
		@Override	//this part is optional
		public void DailyStandUp() {
			System.out.println("Tester " + Name +  " is talking.");
		}
		
		@Override	//this part is optional
		public void Demo() {
			System.out.println("Tester " + Name +  " is doing demo.");
		}
		
	}
	
	public class BOA {
		
		public static void main(String[] args) {
			
			Testers Madina = new Testers ("Madina", "SDET", 90_000);
			Testers Akerke = new Testers("Akerke", "QA Automation", 77_000);
			Testers Erhan = new Testers("Erhan", "Manual Tester", 65_000);
				
			Testers[] testers = {Madina, Akerke, Erhan};
//			 for(Testers each : testers) {
//				 each.getEmployeeInfo();
//			 }
			
			Developers Nadira = new Developers("Nadira", "Senior Developer", 125_000);
			Developers Mahir = new Developers("Mahir", "Interim Developer", 78_000);
			Developers Parsa = new Developers("Parsa", "Junior Developer", 69_000);
			Developers Dilara = new Developers("Dilara", "Developer", 85_000);
			
			Developers[] dev = {Nadira, Mahir, Parsa, Dilara };
//			for(Developers each : dev) {
//				 each.getEmployeeInfo();
//			}
			
			ArrayList<ScrumTeam> scrum = new ArrayList<>();
			scrum.addAll(Arrays.asList(testers));
			scrum.addAll(Arrays.asList(dev));
			
			for(ScrumTeam each : scrum) {
				each.getEmployeeInfo();
			}

			
			
			
		}	
	
	
}

