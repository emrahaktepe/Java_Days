package Day44_AccessModifiers;

public class BankAccount {

	/*
	 	WarmUp: creata a custom class for bankaccount
    The attributes/data that the class can have are: 
            AccountHolder, AccountName, AvailableBalance
    Actions the class can do are:
            deposit, withdraw, checking balance
    requiremnets:
            1. apply encapsulations
            2. user should be able to deposit, withdraw and check the balance
                2.1 if the withdrawing account is greater than available balance,
                	35$ penalty fee will be charger from the account
                2.2 if the available balance is less or equal to 0, 
                	account holder won't be able to withdraw money
	 */
	
	
	private String AccountHolder;
	private long AccountNumber;
	private double AvailableBalance;
	
	
	//	getter (read only): instance return method
	//	return type MUST match with the instance method 
	
	public String getAccountHolder() {
		return AccountHolder;
	}
	
	public long getAccountNumber() {
		return AccountNumber;
	}
	
	public double getAvailableBalance() {
		return AvailableBalance;
	}
	
	//	setter (modify): instance void method, passes a parameter
	
	public void setAccountHolder(String AccountHolder) {
		this.AccountHolder = AccountHolder;
	}
	
	public void setAccountNumber(long AccountNumber) {
		this.AccountNumber = AccountNumber;
	}
	
	//	Actions:
		// deposit:
	
	public void deposit(double amount) {
		AvailableBalance += amount;
	}
	
		// withdraw:
	public void withdraw(double amount) {
		if(AvailableBalance <= 0) {
			System.out.println("your account balance is less than or equals to zero");
			return;
		}
		
		if ( amount > AvailableBalance) {
			AvailableBalance -= 35;
		}
		AvailableBalance -= amount;

	}
		
		// checking balance:

	public void showBalance () {
		
		System.out.println("Available balance is: " + AvailableBalance);
		
	}
	
	}
	
	

