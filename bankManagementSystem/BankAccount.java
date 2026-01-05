package bankManagementSystem;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	private List<Transaction> transactions;
	
	public BankAccount(int accountNumber, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = 0.0;
		this.transactions = new ArrayList<>();
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid Deposit Amount");
			return;
		}
		balance += amount;
		transactions.add(new Transaction("Deposit", amount));
		System.out.println("Deposit Successfull");
	}
	
	public boolean withdraw(double amount) {
		if(amount <= 0 || amount > balance) {
			System.out.println("Insufficient Balance or Invalid Amount");
			return false;
		}
		balance -= amount;
		transactions.add(new Transaction("Withdrawal", amount));
		System.out.println("Withdrawal Successfull");
		return true;
	}
	
	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}
	
	public void printTransactionHistory() {
		if(transactions.isEmpty()) {
			System.out.println("No Transactions Available");
			return;
		}
		for(Transaction t:transactions) {
			System.out.println(t);
		}
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + "]";
	}

	
	

	
}
