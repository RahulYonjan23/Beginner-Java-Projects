package studentManagementSystem;
import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<>();
	
	// Add Student
	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Student Added Successfully");
	}
	
	// public void addStudent(int id, String name, double grade)
	
	// View All Students
	public void viewStudents() {
		if(students.isEmpty()) {
			System.out.println("No Students Found");
			return;
		}
		
		for(Student s: students) {
			System.out.println(s);
		}
	}
	
	// Update Student
	public void updateStudent(int id, String newName, double newGrade) {
		for(Student s:students) {
			if(s.getId() == id) {
				s.setName(newName);
				s.setGrade(newGrade);
				System.out.println("Student Updated Successfully");
				return;
			}
		}
		System.out.println("Student Not Found");
	}
	
	// Delete Student
	public void deleteStudent(int id) {
		for(Student s: students) {
			if(s.getId() == id) {
				students.remove(s);
				System.out.println("Student Deleted Successfully");
				return;
			}
		}
		System.out.println("Student Not Found");
	}	
}
