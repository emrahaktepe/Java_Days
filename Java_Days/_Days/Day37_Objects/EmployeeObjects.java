package Day37_Objects;

public class EmployeeObjects {

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
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee( "Abuzer",  "007",  29,  323_42_5433,  "COO",  125_000);
		
//		employee1.Name = "Abuzer Kadayif";
//		employee1.ID = "424670";
//		employee1.jobTitle = "Manager";
//		employee1.SSN = 422368934;
//		employee1.Salary = 75_000;

		employee1.getInfo();

		Employee employee2 = new Employee( "Mahmut",  "49",  75,  444_55_666,  "Amele",  22_000);

		employee2.getInfo();

	}
	
}
