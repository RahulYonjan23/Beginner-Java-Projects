package bankManagementSystem;
import java.util.HashMap;
import java.util.Map;

public class Bank {
	
	private Map<Integer, BankAccount> accounts = new HashMap<>();
	
	public void createAccount(int accountNumber, String name) {
		if(accounts.containsKey(accountNumber)) {
			System.out.println("Account already exists");
			return;
		}
		accounts.put(accountNumber, new BankAccount(accountNumber, name));
		System.out.println("Account Created Successfully");
	}
	
	public BankAccount getAccount(int accountNumber) {
		return accounts.get(accountNumber);
	}
	
	public void transferMoney(int fromAcc, int toAcc, double amount) {
		BankAccount sender = accounts.get(fromAcc);
		BankAccount receiver = accounts.get(toAcc);
		
		if(sender == null || receiver == null) {
			System.out.println("Invalid Account Number");
			return;
		}
		
		if(sender.withdraw(amount)) {
			receiver.deposit(amount);
			sender.addTransaction(new Transaction("Transfer to " + toAcc, amount));
			receiver.addTransaction(new Transaction("Transfer from " + fromAcc, amount));
			System.out.println("Transfer Successfull");
		}
	}
	
	
	
}
