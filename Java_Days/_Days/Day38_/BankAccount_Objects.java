package Day38_;

public class BankAccount_Objects {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		
		account1.AccountHolder = "Abuzer Kadayif";
		account1.AccountNumber = 1234_1234_1234_1234L;
		
		account1.showBalance();
		
		
		account1.deposit(2000);
		account1.deposit(4000);

		account1.withdraw(3750);
		account1.withdraw(2800);

		BankAccount account2 = new BankAccount();
		account2.AccountSetup("John Wick", 2345345645675678L);
	
		account2.showBalance();
		
		account2.deposit(1000000);
		
		BankAccount account3 = new BankAccount("Grup Vitamin", 6666777788889999L);
		account3.showBalance();
		account3.deposit(10.50);
		account3.withdraw(20);
		account3.withdraw(200);
		account3.deposit(400);

	}
	
	
}
