package wirsing.brian.Assignment1;

import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {
		
		final double PRICE_PER_SQUARE_FOOT = 7.65;
		
		// Input the length and width in inches
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter floor length: ");
		int lengthInches = scanner.nextInt();
		System.out.print("Enter floor width: ");
		int widthInches = scanner.nextInt();
		scanner.close();
		
		// Convert inches to feet and calculate square footage
		double lengthFeet = lengthInches / 12.0;
		double widthFeet = widthInches / 12.0;
		double squareFeet = lengthFeet * widthFeet;
		
		// Calculate price and round it to nearest cent
		double price = squareFeet * PRICE_PER_SQUARE_FOOT;
		int priceCents = (int)(price * 100 + 0.5);
		double priceRounded = priceCents / 100.0;
		
		// Output
		System.out.println("Price: $" + priceRounded);
	}

}
