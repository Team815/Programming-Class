package watson.chris.Program_2;

import java.util.Random;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args)
	{
		
		
		System.out.println("let's play a guessing game!\n");
		
		System.out.print("1: Easy(3 guesses)\n"
				        +"2: Medium(7 guesses)\n"
				        +"3: Hard(10 guesses)\n"
				        +"4: Custom(X guesses)\n");
		
		Scanner insert = new Scanner(System.in);
		Random rng = new Random();
		System.out.print("Enter a difficulty: ");
		int choice = insert.nextInt();
		
		int secretnumb;
		int maxnumb;
		int minnumb = 0;
		int guess;
		int i = 1;
		final int EASY_MAX = 10;
		final int MEDIUM_MAX = 100;
		final int HARD_MAX = 1000;
		
		switch(choice) {
		case 1: maxnumb = EASY_MAX;
				guess = 3;
			 break;
		case 2: maxnumb = MEDIUM_MAX;
				guess = 7;
			break;
		case 3: maxnumb = HARD_MAX;
				guess = 10;
			 break;	 
		case 4: System.out.print("Eneter the minimun number of your range: ");
				int CUSTOM_MIN = insert.nextInt();
				minnumb = CUSTOM_MIN;
				System.out.print("Eneter the maximum number of your range: ");
				int CUSTOM_MAX = insert.nextInt();
				maxnumb = CUSTOM_MAX;
				System.out.print("Enter the number of guesses you would like: ");
				int good = insert.nextInt();
				guess = good;
			break;
		default: maxnumb = MEDIUM_MAX;
				 guess = 7;
		}
		secretnumb = rng.nextInt(maxnumb  + 1 - minnumb) + minnumb;
		int original = guess;
		
		if(choice == 4 && guess == 0)
		{
			int range = maxnumb - minnumb;
			
			if(range <= 10)
			{
				guess = 3;
			}
			else if(range <= 100 && range > 10)
			{
				guess = 6;
			}
			else if(range <= 1000 && range > 100)
			{
				guess = 9;
			}
			else if(range <= 10000 && range > 1000)
			{
				guess = 12;
			}
		}
		
		System.out.print("Enter a number: ");
		int numb = insert.nextInt();
		
		while(i != original && numb != secretnumb)
			{
				guess = guess - 1;
				String juan;
				if(numb < secretnumb)
				{
					juan = "small";
				}
				else 
				{
					juan = "big";
				}
				System.out.println("You have "+ guess + " guesse(s) left.");
				System.out.println("Guess is too "+juan+".\n");
				System.out.print("Enter a number: ");
				numb = insert.nextInt();
				i = i +1;
				
			
			}
			if(i > original + 1)
			{
				System.out.println("You lose, the correct answer was " + secretnumb + ", try again.");
			}
			else
			{
				System.out.println("Correct!");
			}
		
	}
}
