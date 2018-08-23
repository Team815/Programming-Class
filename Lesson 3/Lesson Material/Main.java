package wirsing.bring.Functions;

import java.util.Scanner;

public class Main {

	// main is a function that all Java projects must have.
	// Java projects all begin with the function main
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// println is a function that takes a string parameter (i.e. input)
		// and does not return any value (i.e. output).
		// It's return type is "void" (similar to main)
		System.out.println("Enter a number: ");
		
		// nextInt is a function that takes no parameters at all, but still requires parentheses
		// and returns an int.
		int number = scanner.nextInt();
		
		// getNumberProperties is our own function, defined below.
		System.out.println(getNumberProperties(number));
		scanner.close();
	}
	
	// All functions should be named using camel case (camelCase)
	// Parameters: int number - the number to get the properties of
	// Returns: String - the String representing the number properties
	public static String getNumberProperties(int number) {
		// Functions can be called inside other functions.
		// It is good programming practice to break up large programs into smaller, contained chunks.
		// Write these small chunks as functions
		if (isEven(number) && isGreaterThan100(number)) {
			return "Both";
		} else if (isEven(number)) {
			return "Even";
		} else if (isGreaterThan100(number)) {
			return "Greater than 100";
		} else {
			return "Neither";
		}
	}
	
	// Determines if a number is even or odd
	// Parameters: int number - the number to test
	// Returns: boolean - true if number is even, false if number is odd
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	// Determines if a number is greater than 100
	// Parameters: int number - the number to test
	// Returns: boolean - true if number is greater than 100, false otherwise
	public static boolean isGreaterThan100(int number) {
		return number > 100;
	}
}
