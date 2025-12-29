package studentManagementSystem;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentManager manager = new StudentManager();
		
		while(true) {
			System.out.println("\n---Student Management System---");
			System.out.println("1. Add Sudent");
			System.out.println("2. View Student");
			System.out.println("3. Update Student");
			System.out.println("4. Delete Student");
			System.out.println("5. Exit");
			System.out.println("Choose an option: ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter Id: ");
				int id = sc.nextInt();
				sc.nextLine(); //clear buffer
				
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				
				System.out.println("Enter Grade: ");
				double grade = sc.nextDouble();
				
				manager.addStudent(new Student(id, name, grade));
				break;
				
			case 2:
				manager.viewStudents();
				break;
			
			case 3:
				System.out.println("Enter the id to update: ");
				int updateId = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter new name: ");
				String newName = sc.nextLine();
				
				System.out.println("Enter new grade: ");
				double newGrade = sc.nextDouble();
				
				manager.updateStudent(updateId, newName, newGrade);
				break;
			
			case 4:
				System.out.println("Enter Id to delete: ");
				int deleteId = sc.nextInt();
				manager.deleteStudent(deleteId);
				break;
				
			case 5:
				System.out.println("GoodBye");
				sc.close();
				return;
				
			default:
				System.out.println("Invalid Choice");
				break;
		
			}
		}
	}
}
