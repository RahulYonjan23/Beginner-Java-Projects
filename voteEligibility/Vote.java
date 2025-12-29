package voteEligibility;
import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		
		// VET: Voter's Eligibility Test: To checks Voter's IQ
		System.out.println("Enter Your VET Score: ");
		int score = sc.nextInt();
		
		if(age >= 18 && score >= 80) {
			System.out.println("You are eligible to vote.");
		}
		else if(age >= 18 && score < 80) {
			System.out.println("You are old enough but test score is not sufficent.");
		}
		else if(age < 18 && score >= 80) {
			System.out.println("You are not old enough but test score is sufficient.");
		}
		else {
			System.out.println("You are not old enough and test score is not sufficient.");
		}		

		sc.close();
	}

}
