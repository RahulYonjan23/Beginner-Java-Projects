// Number Guessing Game

package guessGame;
import java.util.Scanner;
import java.util.Random;

public class GuessGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int num = random.nextInt(10) + 1;
		int guessNum = 0;
		boolean guessedCorrectly = false;
		
		//User get 3 tries
		for(int i=1; i <= 3;i++) {
			
			System.out.println("Enter the number between 1 to 10: ");
			guessNum = sc.nextInt();
			
			if(num == guessNum) {
				System.out.println("You guessed it correctly\n");
				System.out.println("You guessed it in " + i + " attempt.\n");
				guessedCorrectly = true;
				break;
			}
		}
		
		if(!guessedCorrectly) {
			System.out.println("Attempts Finished.\n");
		}
	
		System.out.println("Your Guess Number: " + guessNum + "\n");
		System.out.println("The Actual Number: " + num + "\n");
		
		sc.close();
	}

}
