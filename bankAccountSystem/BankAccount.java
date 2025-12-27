package bankAccountSystem;

public class BankAccount {
	
	private int accountNum;
	private String accountName;
	private double balance;
	
	// Constructor
	public BankAccount(int accountNum, String accountName, double balance) {
		this.accountNum = accountNum;
		this.accountName = accountName;
		this.balance = balance;
	}
	
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	// Display Account Info
	public void displayAccount() {
		System.out.println("Bank Account Number: " + accountNum);
		System.out.println("Bank Account Name: " + accountName);
		System.out.println("Bank Account Balance: " + balance);
	}
	
	// Deposit Money
	public void deposit(double amount) {
		if(amount > 0) {
			balance = balance + amount;
			System.out.println("Deposit Successfull");
		}
		else {
			System.out.println("Invalid Deposit Amount");
		}
	}
	
	// Withdraw Money
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdraw successfull");
		}
		else {
			System.out.println("Insufficent Balance or Invalid Amount");
		}
	}
	
	// Check Account Balance
	public double checkBalance() {
		return balance;
	}
}
