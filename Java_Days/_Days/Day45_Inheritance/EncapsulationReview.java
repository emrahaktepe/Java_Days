package Day45_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

class credentials{
	
	private String userName;	//	admin
	private String password;	//	123
	
	public credentials() {
		
		setUserName("admin");
		setPassword("123");
		
	}
	
	private boolean isCorrectPassword (String password) {
		
		// enter if conditions for password requirements
		
		return true;
	}
	
	// getter:
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	
	// setter:
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {		
		if( isCorrectPassword(password) ){
			this.password = password;
		}
		else {
			System.out.println("Enter a correct password using the guidelines");
		}
	}
	
	public void setCredentials(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
}


public class EncapsulationReview {

	public static void main(String[] args) {
		
		//	to be able to call non static from a static you have to create an object
		
		credentials Zulfiye = new credentials();
//			obj.userName = "Zlfy";	//	private is only visible within the class
//			obj.password = "12345";
		
			System.out.println("Username: " + Zulfiye.getUserName());
			System.out.println("Password: " + Zulfiye.getPassword());

		credentials Nurzat = new credentials();
			Nurzat.setUserName("nrzt_1");
			Nurzat.setPassword("pass123");
		
			System.out.println("Username: " + Nurzat.getUserName());
			System.out.println("Password: " + Nurzat.getPassword());
		
		credentials Abuzer = new credentials();
			Abuzer.setCredentials("Abuzer_Kadayif", "soganli_menemen");
			Abuzer.setPassword("468");
			
			System.out.println("Username: " + Abuzer.getUserName());
			System.out.println("Password: " + Abuzer.getPassword());
			
			System.out.println("=================");
			
//		credentials[] users = {zulfiye, Nurzat, Abuzer};
//			users[0].getInfo();
//			users[1].getInfo();
//			users[2].getInfo();
			
		ArrayList<credentials> CredentialsList = new ArrayList<>();
			CredentialsList.addAll(Arrays.asList(Zulfiye, Nurzat, Abuzer));
		
			for (credentials each : CredentialsList ) {
				each.getUserName();
			}
	}
	
}
