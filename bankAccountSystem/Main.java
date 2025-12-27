package bankAccountSystem;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Bank Account Number: ");
		int accountNum = sc.nextInt();
		sc.nextLine(); // consume leftover newline
		
		System.out.println("Enter the Bank Account Name: ");
		String accountName = sc.nextLine();
		
		System.out.println("Enter the Bank Account Balance: ");
		double balance = sc.nextDouble();
		
		BankAccount account = new BankAccount(accountNum,accountName,balance);
		
		int choice;
		
		do {
			System.out.println("---Bank Menu---");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			
			choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter the deposit amount: ");
				double amount = sc.nextDouble();
				account.deposit(amount);
			}
			else if(choice == 2) {
				System.out.println("Enter the withdraw amount: ");
				double amount = sc.nextDouble();
				account.withdraw(amount);
			}
			else if(choice == 3) {
				System.out.println("Current Balance: " + account.checkBalance());    
			}
			else if(choice == 4) {
				System.out.println("Thank you for using the bank system.");
			}
			else {
				System.out.println("Invalid Choice");
			}	
		}while(choice != 4);
		
		sc.close();
		
	}

}
