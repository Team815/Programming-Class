package wirsing.brian.GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		Random rng = new Random();
		
		final int EASY_MAX = 10;
		final int MEDIUM_MAX = 100;
		final int HARD_MAX = 1000;

		System.out.println("Let's play the guessing game!\n");
		
		System.out.println("1: Easy\n"
						 + "2: Medium\n"
						 + "3: Hard\n");
		
		System.out.print("Enter a difficulty: ");
		int choice = myScanner.nextInt();

		int maxNumber;
		switch(choice) {
		case 1:
			maxNumber = EASY_MAX;
			break;
		case 2:
			maxNumber = MEDIUM_MAX;
			break;
		case 3:
			maxNumber = HARD_MAX;
			break;
		default:
			maxNumber = MEDIUM_MAX;
		}
		int secretNumber = rng.nextInt(maxNumber) + 1;
		
		System.out.print("\nGuess the number between 1 and " + maxNumber + ": ");
		int input = myScanner.nextInt();
		
		while(input != secretNumber) {
			String comparison;
			if(input < secretNumber) {
				comparison = "small";
			} else {
				comparison = "big";
			}
			System.out.println("Guess is too " + comparison + ".\n");
			
			System.out.print("Guess the number between 1 and " + maxNumber + ": ");
			input = myScanner.nextInt();
		}
		System.out.println("Correct!");
		myScanner.close();
	}
}