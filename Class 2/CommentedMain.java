package wirsing.brian.GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class CommentedMain {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		// A Random object will allow us to generate random numbers.
		Random rng = new Random();
		
		/* Use final variables for constants in your code. Just using numbers can make code unclear.
		 * Constants are usually in all caps with underscores separating words.
		 */
		final int EASY_MAX = 10;
		final int MEDIUM_MAX = 100;
		final int HARD_MAX = 1000;
		
		// The \n represents a newline character. This is a nice way to space out console output.
		System.out.println("Let's play the guessing game!\n");
		
		// This multi-line println statement isn't necessary, but makes it more clear what is being printed.
		System.out.println("1: Easy\n"
						 + "2: Medium\n"
						 + "3: Hard\n");
		
		System.out.print("Enter a difficulty: ");
		int choice = myScanner.nextInt();
		
		// maxNumber has to be declared outside the switch-case statement so that it stays in scope later.
		int maxNumber;
		
		/* Use switch-case statements when you are making a decision based purely on the value of one variable.
		 * They are often used when determining what the user entered when making a choice in a menu.
		 */
		switch(choice) {
		case 1:
			maxNumber = EASY_MAX;
			/* It's important to break at the end of a case's statements.
			 * Otherwise subsequent case statements will also be called.
			 */
			break;
		case 2:
			maxNumber = MEDIUM_MAX;
			break;
		case 3:
			maxNumber = HARD_MAX;
			break;
		// default is reached if choice is not 1 or 2 or 3. Think of it like the "else" in an if-statement.
		default:
			maxNumber = MEDIUM_MAX;
		}
		
		// The +1 at the end will change the random number range from (0 to maxNumber-1) to (1 to maxNumber).
		int secretNumber = rng.nextInt(maxNumber) + 1;
		
		System.out.print("\nGuess the number between 1 and " + maxNumber + ": ");
		int input = myScanner.nextInt();
		
		// The user will stay in this while loop for for as long as they don't guess the secret number.
		while(input != secretNumber) {
			
			/* Using a String to set the differing text is a nice way to have only one println statement.
			 * This reduces duplicate code, which we should always strive for.
			 */
			String comparison;
			if(input < secretNumber) {
				comparison = "small";
			} else {
				comparison = "big";
			}
			System.out.println("Guess is too " + comparison + ".\n");
			
			// Don't forget to allow the user to enter another input! Otherwise you will have an infinite loop.
			System.out.print("Guess the number between 1 and " + maxNumber + ": ");
			input = myScanner.nextInt();
		}
		
		// If the user makes it out of the while loop above, we know that they definitely guessed the correct number.
		System.out.println("Correct!");
		myScanner.close();
	}
}