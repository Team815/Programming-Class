package wirsing.brian.Parkside;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a triangle size: ");
		int size = scanner.nextInt();
		
		int startingLineNumber = 1;
		int startingLineNumberIncrement = 2;
		int startingLineIncrement = 1;
		
		for(int i = 0; i < size; i++) {
			int lineSize = size - i;
			String line = getLine(startingLineNumber, startingLineIncrement, lineSize);
			System.out.println(line);
			
			startingLineNumber = add(startingLineNumber, startingLineNumberIncrement);
			startingLineIncrement = startingLineNumberIncrement;
			startingLineNumberIncrement++;
		}
	}
	
	public static String getLine(int startingNumber, int startingIncrement, int length) {
		String line = startingNumber + " ";
		int increment = startingIncrement;
		int number = startingNumber;
		for(int i = 1; i < length; i++) {
			number = add(number, increment);
			increment++;
			line += number + " ";
		}
		return line;
	}
	
	public static int add(int number1, int number2) {
		for(int i = 0; i < number2; i++) {
			number1++;
			if(number1 == 10) {
				number1 = 1;
			}
		}
		return number1;
	}
	
	public static int add2(int number1, int number2) {
		number1--;
		number1 += number2;
		number1 %= 9;
		number1++;
		return number1;
	}
}
