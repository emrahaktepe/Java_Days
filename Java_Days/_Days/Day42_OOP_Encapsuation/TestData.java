package Day42_OOP_Encapsuation;

public class TestData {

	//	Name
	//	ID
	
	private String name = "Abuzer";	//	the data is not visible to other classes cuz of "private"
	private int ID = 897;
	
	public String getName() {	//	read the private data only
		return name;
	}
	
	public int getID() {	//	read the private data only
		return ID;
	}
	
	public void setName(String str) {
		name = str;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
}
