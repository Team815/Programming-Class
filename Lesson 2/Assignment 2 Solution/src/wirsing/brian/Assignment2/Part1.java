package wirsing.brian.Assignment2;

import java.util.Random;
import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		Random rng = new Random();
		
		final int EASY_MIN = 1;
		final int MEDIUM_MIN = 1;
		final int HARD_MIN = 1;
		final int EASY_MAX = 10;
		final int MEDIUM_MAX = 100;
		final int HARD_MAX = 1000;

		System.out.println("Let's play the guessing game!\n");
		
		System.out.println("1: Easy\n"
						 + "2: Medium\n"
						 + "3: Hard\n"
						 + "4: Custom\n");
		
		System.out.print("Enter a difficulty: ");
		int choice = myScanner.nextInt();

		int minNumber;
		int maxNumber;
		int guesses = 0;
		switch(choice) {
		case 1:
			minNumber = EASY_MIN;
			maxNumber = EASY_MAX;
			break;
		case 2:
			minNumber = MEDIUM_MIN;
			maxNumber = MEDIUM_MAX;
			break;
		case 3:
			minNumber = HARD_MIN;
			maxNumber = HARD_MAX;
			break;
		case 4:
			System.out.print("Enter min value for the secret number: ");
			minNumber = myScanner.nextInt();
			System.out.print("Enter max value for the secret number: ");
			maxNumber = myScanner.nextInt();
			System.out.print("Enter number of guesses: ");
			guesses = myScanner.nextInt();
			break;
		default:
			minNumber = MEDIUM_MIN;
			maxNumber = MEDIUM_MAX;
		}
		if(guesses == 0) {
			guesses = (int)(3 * Math.log10(maxNumber - minNumber) + 0.5);
		}
		int secretNumber = rng.nextInt(maxNumber - minNumber + 1) + minNumber;
		
		System.out.print("\nGuess the number between " + minNumber + " and " + maxNumber + " (" + guesses + " guesses left): ");
		int input = myScanner.nextInt();
		guesses--;
		
		while(input != secretNumber && guesses > 0) {
			String comparison;
			if(input < secretNumber) {
				comparison = "higher";
			} else {
				comparison = "lower";
			}
			System.out.println("Wrong, guess " + comparison + ".\n");
			
			String guessWord = guesses == 1 ? "guess" : "guesses";
			
			System.out.print("Guess the number between " + minNumber + " and " + maxNumber + " (" + guesses + " " + guessWord +  " left): ");
			input = myScanner.nextInt();
			guesses--;
		}
		
		if(input == secretNumber) {
			System.out.println("You won!");
		} else {
			System.out.println("Game over, you lost. the number was " + secretNumber);
		}
		myScanner.close();
	}

}
