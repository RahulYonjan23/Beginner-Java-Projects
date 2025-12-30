package employeeManagementSystem;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		EmployeeManager manager = new EmployeeManager();
		
		while(true) {
			System.out.println("\n---Employee Management System---");
			System.out.println("Select an Option: ");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Exit");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter Id: ");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Name");
				String name = sc.nextLine();
				
				System.out.println("Enter Department: ");
				String department = sc.nextLine();
				
				System.out.println("Enter Salary: ");
				double salary = sc.nextDouble();
				
				manager.addEmployee(new Employee(id,name,department,salary));
				break;
				
				
			case 2:
				manager.viewEmployee();
				break;
				
			case 3:
				System.out.println("Enter Id: ");
				int updateId = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter New Name");
				String newName = sc.nextLine();
				
				System.out.println("Enter Department: ");
				String newDepartment = sc.nextLine();
				
				System.out.println("Enter Salary: ");
				double newSalary = sc.nextDouble();
				
				manager.updateEmployee(updateId,newName,newDepartment,newSalary);
				break;
				
			case 4:
				
				System.out.println("Enter Id to Delete: ");
				int deleteId = sc.nextInt();
				manager.deleteEmployee(deleteId);
				break;
				
			case 5:
				System.out.println("GoodBye");
				sc.close();
				return;
			
			default:
				System.out.println("Invalid Input");
				break;
				
			}
		}
	}

}
