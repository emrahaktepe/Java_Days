package Day42_OOP_Encapsuation;

public class EmployeeInfo {

	
	private String Name;
	private long SSN;
	private byte Age;
	private double Salary;
	
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
			public String getName() {
				return Name;
			}
	
	public void setSSN(long SSN) {
		this.SSN = SSN;
	}
		
			public long getSSN() {
				return SSN;
			}
	
	public void setAge(byte Age) {
		this.Age = Age;
	}
	
			public byte getAge() {
				return Age;
			}
	
	public void setSalary(double Salary) {
		this.Salary = Salary;
	}
	
			public double getSalary() {
				return Salary;
			}
	
	public void setInfo(String name, long SSN, byte Age, double Salary) {
		setName(Name);
		setSSN(SSN);
		setAge(Age);
		setSalary(Salary);
	}
			
			
}
