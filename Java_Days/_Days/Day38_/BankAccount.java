package Day38_;

public class BankAccount {
	
	/*
	 	WarmUp:
    	create a custom class for BankAccount
    	attributes/data that can have are: 
                    1. AccountHolder, 2. AccountNumber, 3. Balance
       
        Actions: deposit, withdraw, showBalance
        	
        Requirements: 
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                    2.1 if the withdrawing account is greater than available balance, 35$ charge will be added
                    2.2 if the balance is less than 0, user should not be able to withdraw money
            3. user should be able to see their balance
	 */

	String AccountHolder;
	long AccountNumber;
	double Balance;
	
	public BankAccount() {
		
	}

	public BankAccount(String name, long acctNum) {
		AccountHolder = name;
		AccountNumber = acctNum;
	}

	public void deposit(double amount) {
		System.out.println("-------------------------------");

		String accountNum = ""+ AccountNumber;
		String AccountNumber = "************" + accountNum.substring(12);
		
		
		System.out.println("Depositig " + amount + " to the account ending with " + accountNum.substring(12));
		Balance += amount;
		System.out.println("Current Balance : $" + Balance);

		System.out.println("_______________________________");

	}

	public void withdraw(double amount) {
		System.out.println("-------------------------------");
		
		if(Balance <= 0 ) {
		System.out.println("Insufficient Funds");
		return;
		}
		
		String accountNum = ""+ AccountNumber;
		String AccountNumber = "************" + accountNum.substring(12);
		
		
		System.out.println("Withdrawing " + amount + " from the account ending with " + accountNum.substring(12));
		Balance -= amount;
		
		if( Balance < 0) {
			Balance -= 35; 	// Overdraft fee
		}
		
		
		
		System.out.println("Current Balance : $" + Balance);

		System.out.println("_______________________________");
	}

	public void showBalance() {
		System.out.println("-------------------------------");
		String accountNum = ""+ AccountNumber;
		String AccountNumber = "************" + accountNum.substring(12);
		
		System.out.println("Account Holder: " + AccountHolder);
		System.out.println("Account Number: " + AccountNumber);
		System.out.println("Available Balance: $" + Balance);
		System.out.println("_______________________________");

	}

	public void AccountSetup(String name, long acctNum) {
		AccountHolder = name;
		AccountNumber = acctNum;
	}
	
	
	
}
