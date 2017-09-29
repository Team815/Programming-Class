package hinojosa.juan.GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		System.out.println("Let's play a number guessing game!");
		
		System.out.println("1 = Easy(1-10) with 4 guesses\n" + "2 = Medium (1-100) with 6 guesses\n" + "3 = Hard(1-1000) with 8 guesses\n" + "4 = Custom\n");
		
		Scanner myscanner = new Scanner(System.in);
		Random rng = new Random();
		
		
		System.out.print("Enter a difficulty: ");
		int diff = myscanner.nextInt();
		
		int secretNumb;
		int maxNumb;
		final int EASY_MAX = 10;
		final int MEDIUM_MAX = 100;
		final int HARD_MAX = 1000;
		int min = 0;
		int guesses;
		int i;
		int j = 0;
		
		
		switch(diff)
		{
		case 1 :
			maxNumb = EASY_MAX;
			guesses = 4;
			break;
		case 2 :
			maxNumb = MEDIUM_MAX;
			guesses = 6;
			break;
		case 3 :
			maxNumb = HARD_MAX;
			guesses = 8;
			break;
		case 4 :
			System.out.print("Please enter the minimum range for guessing: ");
			min = myscanner.nextInt();
			System.out.print("Please enter the maximum range for guessing: ");
			maxNumb = myscanner.nextInt();
			System.out.print("Please enter the amount of guesses you would like: ");
			guesses = myscanner.nextInt();
			break;
		default :
			maxNumb = MEDIUM_MAX;
			guesses = 6;
			break;
		}
		
		if(diff == 4 && guesses == 0)
		{
			int range = maxNumb - min;
			guesses = (int)(Math.pow(2, (Math.log10(range) + .5)));
		}
		
		i = guesses;
		secretNumb = rng.nextInt(maxNumb + 1 - min) + min;
		
		System.out.print("Enter a Number: ");
		int numb = myscanner.nextInt();
		
		while(numb != secretNumb && (guesses - 1) > 0)
		{
			String comp;
			
			if(numb < secretNumb)
			{
				comp = "small";
			}
			else
			{
				comp = "big"; 
			}
			System.out.println("Guess is too " + comp + "\n");
			System.out.println("You have " + (guesses - 1) + " guesses left");
			System.out.print("Enter a Number: ");
			numb = myscanner.nextInt();
			
			guesses = guesses - 1;
			j = j + 1;
		}
		if (j == i - 1 )
		{
			System.out.println("You have lost the game!");
		}
		else
		{
			System.out.println("Correct");
		}
	}

}
