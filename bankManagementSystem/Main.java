package bankManagementSystem;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n---Bank Account Management System---");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Transfer Money");
			System.out.println("5. View Account Details");
			System.out.println("6. View Transaction History");
			System.out.println("7. Exit");
			System.out.println("Choose an option");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter Account Number:");
				int accNo = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name:");
				String name = sc.nextLine();
				bank.createAccount(accNo, name);
				break;
				
			case 2:
				System.out.println("Enter Account Number:");
				accNo = sc.nextInt();
				System.out.println("Enter Amount:");
				double deposit = sc.nextDouble();
				BankAccount acc = bank.getAccount(accNo);
				if(acc != null) acc.deposit(deposit);
				else System.out.println("Account Not Found");
				break;
				
			case 3:
				System.out.println("Enter Account Number");
				accNo = sc.nextInt();
				System.out.print("Enter Amount: ");
                double withdraw = sc.nextDouble();
                acc = bank.getAccount(accNo);
                if (acc != null) acc.withdraw(withdraw);
                else System.out.println("Account not found.");
                break;

            case 4:
                System.out.print("From Account: ");
                int from = sc.nextInt();
                System.out.print("To Account: ");
                int to = sc.nextInt();
                System.out.print("Amount: ");
                double amount = sc.nextDouble();
                bank.transferMoney(from, to, amount);
                break;

            case 5:
                System.out.print("Enter Account Number: ");
                accNo = sc.nextInt();
                acc = bank.getAccount(accNo);
                if (acc != null) System.out.println(acc);
                else System.out.println("Account not found.");
                break;

            case 6:
                System.out.print("Enter Account Number: ");
                accNo = sc.nextInt();
                acc = bank.getAccount(accNo);
                if (acc != null) acc.printTransactionHistory();
                else System.out.println("Account not found.");
                break;

            case 7:
                System.out.println("Thank you for using the system!");
                sc.close();
                return;

            default:
                System.out.println("Invalid option.");
				
			}	
		}
	}
}
