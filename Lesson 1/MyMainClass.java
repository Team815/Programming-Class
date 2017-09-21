package wirsing.brian.MyFirstProgram;

import java.util.Scanner;

public class MyMainClass {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.print("Enter a number: ");
		Scanner myScanner;
		myScanner = new Scanner(System.in);
		int number = myScanner.nextInt();
		int number2 = 3;
		double quotient = (double)number / (double)number2;
		quotient += 0.5;
		int result = (int)quotient;
		System.out.println(number + " / " + number2 + " = " + result);
		myScanner.close();
		
		// Other datatypes
		byte myByte; // Like a tiny int
		short myShort; // Like a small int
		long myLong; // Like a big int
		float myFloat; // Like a small double
		char myChar; // Usually used to hold ascii characters
		boolean myBoolean; // Holds the values true and false

	}

}
