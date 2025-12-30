package employeeManagementSystem;
import java.util.ArrayList;

public class EmployeeManager {
	
	ArrayList<Employee> employees = new ArrayList<>();
	
	public void addEmployee(Employee employee) {
		
		employees.add(employee);
		System.out.println("Employees added successfully");
		
	}
	
	public void viewEmployee() {
		if(employees.isEmpty()) {
			System.out.println("No Employees Found");
			return;
		}
		else {
			for(Employee e: employees) {
				System.out.println(e);
			}
		}
	}
	
	public void updateEmployee(int id, String newName, String newDepartment, double newSalary) {
		for(Employee e: employees) {
			if(e.getId() == id) {
				e.setName(newName);
				e.setDepartment(newDepartment);
				e.setSalary(newSalary);
				System.out.println("Employee Successfully Updated");
				return;
			}
		}
		System.out.println("Employee Not Found");
		
	}
	
	public void deleteEmployee(int id) {
		for(Employee e: employees) {
			if(e.getId() == id) {
				employees.remove(e);
				System.out.println("Employee Successfully Deleted");
				return;
			}
		}
		System.out.println("Employee Not Found");
	}

	
	
}
