package wirsing.brian.NumbersToWords;

import java.util.Scanner;

public class NumberToWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();
			String numberWord = convertToString(number);
			System.out.println(numberWord + "\n");
		}
	}

	public static String convertToString(int number) {
		final String[] ONES = {null, "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
				"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		
		final String[] TENS = {null, null, "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		
		String numberString = "";
		int hundredValue = number / 100;
		if(hundredValue > 0) {
			numberString += ONES[hundredValue] + " Hundred ";
			number %= 100;
		}
		
		if(number == 0) {
			numberString += "";
		} else if(number < 20) {
			numberString += ONES[number];
		} else {
			int tensIndex = number / 10;
			int onesIndex = number % 10;
			String onesString = onesIndex == 0 ? "" : "-" + ONES[onesIndex];
			numberString += TENS[tensIndex] + onesString;
		}
		
		return numberString;
	}
}
