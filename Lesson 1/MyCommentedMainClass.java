// This is a comment. Any text after 2 forward slashes // is considered a comment.
// Comments are ignored my Java, so you can write whatever you want.

/* Another way to make comments is to use a forward slash and an asterisk.
   This allows you to write multi-line comments.
   All text after the slash-asterisk will be commented until you add an asterisk-slash like this -> */

/* A package is used to make your code unique, like a unique identifier.
 * Don't worry too much about what it means, but use them.
 * A common convention is to name your package lastname.firstname.ProjectName
 */
package wirsing.brian.MyFirstProgram;

import java.util.Scanner;

// You can name your class anything you like.
public class MyCommentedMainClass {

	/* This is a function, called main. All Java programs must have this function.
	 * Your program will start in this function. When you create a class,
	 * you can choose to have Eclipse create this function for you automatically.
	 */
	public static void main(String[] args) {
		
		// One common way to print something is to use println. This prints a line.
		System.out.println("Hello World");
		
		/* Another way to print something is to use print. This prints the
		 * text, but does not move on the the next line. Useful when taking input.
		 */
		System.out.print("Enter a number: ");
		
		// A scanner will be used to take input from the user. I will explain some terms here.
		
		/* This is called a declaration. I am "declaring" that a Scanner called "myScanner"
		 * will exist. However, it does not actually exist yet. It has to be "instantiated" first.
		 */
		Scanner myScanner;
		
		/* This is called an instantiation. I am creating a new Scanner object and putting
		 * it into the variable myScanner. Don't worry if this sounds confusing,
		 * I will cover it in more detail later.
		 */
		myScanner = new Scanner(System.in);
		
		/* The above 2 lines could be done on one line like this:
		 *     Scanner myScanner = new Scanner(System.in);
		 */
		
		/* myScanner reads an integer input from the user and stores that value in the variable number.
		 * This could be done on 2 lines like above instead of 1.
		 */
		int number = myScanner.nextInt();
		
		/* Integers can store positive and negative whole numbers (no decimals).
		 * Note that if a number has a decimal when put into an int, the decimal portion will be truncated.
		 */
		int number2 = 3;
		
		/* Doubles can store positive and negative numbers, which can include decimals
		 * To do correct division, the ints have to be casted to doubles before dividing
		 */
		double quotient = (double)number / (double)number2;
		
		/* A common way to round a value is to add 0.5 to it before truncating the decimal portion.
		 * a += b is a shorthand way of performing a = a + b
		 */
		quotient += 0.5;
		
		// Java requires us to manually cast a double to an int to store the value in an int variable.
		int result = (int)quotient;
		
		System.out.println(number + " / " + number2 + " = " + result);
		
		// It is proper to close a Scanner object after we are done with it.
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
