package Day37_Objects;

public class Employee {

	/*
    Assignment:
       create a custom class for Employees
           
               attributes: EmployeeName
                           EmployeeID
                           JobTitle
                           SSN
                           Gender
                           Salary
                           
               actions:
                       getInfo
   
    */
	
	String Name;
	String ID;
	int Age;
	int SSN;
	String JobTitle;
	double Salary;
	
	public Employee(String Name, String ID, int Age, int SSN, String JobTitle, double Salary) {
		this.Name = Name;
		this.ID = ID;
		this.Age = Age;
		this.SSN = SSN;
		this.JobTitle = JobTitle;
		this.Salary = Salary;
		
	}
	
	public void getInfo() {
		
		System.out.println("Employee' name is: "+Name);
		System.out.println("Social Security number is: "+SSN);
		System.out.println("Age is: "+Age);
		System.out.println("Job title is: "+JobTitle);
		System.out.println("Employee ID is: "+ID);
		System.out.println("Salary is: $"+Salary);
		
		System.out.println("-------------------------------------------");		
	}
	
	
	
}
