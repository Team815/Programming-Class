// Lesson 1

// Comments

// Single-line comments start with two slashes: //

/* Multi-line comments are also possble.
   They start with a slash-asterisk: /*
   and end with an asterisk-slash: */


package wirsing.brian.MyFirstProject;

import java.util.Scanner;

// Naming Conventions

/*
 * Camel Case (camelCase) - Capitalize first letter of every word except first word
 * Pascal Case (PascalCase) - Same as camel case, except capitalize first word too
 * Snake Case (snake_case) - all letters lower case, separate words with underscore
 * Upper Snake Case (UPPER_SNAKE_CASE) - Same as snake case, except all letters are capitalized
 */

// Naming Convention: Name classes using Pascal case
public class Main {

	// All Java programs need this function somewhere
	// It defines the starting point of the program
	public static void main(String[] args) {
		
		// Data Types
		
		// Naming Convention: Name variables using camel case
		
		// Integer data types
		
		byte  myByte;  // 1 byte  (-128 to 127)
		short myShort; // 2 bytes (-32,768 to  32,767)
		int   myInt;   // 4 bytes (-2,147,483,648 to 2,147,483,647)
		long  myLong;  // 8 bytes (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
		
		float  myFloat;   // 4 bytes (+-3.40282347E+38)
		double myDouble;  // 8 bytes (+-1.79769313486231570E+308)
		
		// TIP: When in doubt, use int for integers and double for decimals
		
		boolean myBoolean; // true or false
		char myChar;       // 1 character (e.g. 'A', '6', '$')
		String myString;   // Text (e.g. "Hello, World!")
		
		// Operators
		
		// Assignment Operator
		
		myShort = 5;     // Assigns a value of 5 to the variable myShort
		myInt = myShort; // Assigns the value in myShort (5) to the variable myInt
		
		// Plus and Minus Operators
		
		myShort = 7 + 9;     // Calculates 7 + 9, assigns the result (16) to myShort
		myInt = myShort - 4; // Subtracts 4 from the value in myShort (16), assigns the result (12) to myInt
		
		// Multiply and Divide Operators
		
		myInt = myInt * 3;                // Multiplies the value in myInt (12) by 3, assigns the result (36) to myInt
		
		/*
		 * A lot of things are happening here. The goal is to do 36 / 10 = 4 (36 / 10 = 3.6, round up to 4)
		 * First, "myInt / 10." is and int (36) divided by a double (10.), resulting in a double result (3.6)
		 * Then, adding 0.5 to this results in 4.1
		 * Next, all this is explicitly cast to an int, truncating the decimal (.1) and leaving an int (4)
		 * Finally, the casted int (4) is assigned to myInt
		 */
		myInt = (int)(myInt / 10. + 0.5);
		
		// Java Casting Behavior
		
		/* Rules
		 * Any operation with a double results in a double
		 * Otherwise, any operation with a float results in a float
		 * Otherwise, any operation with a long result in a long
		 * Otherwise, any operation results in an int
		 */
		
		/* Examples
		 * byte + byte = int
		 * byte + short = int
		 * short + int = int
		 * int + int = int
		 * int + long = long
		 * byte + long = long
		 * int + float = float
		 * long + float = float
		 * int + double = double
		 * long + double = double
		 * float + double = double
		 * double + double = double
		 */
		
		// Modulo Operator (remainder operator)
		
		myShort = 8 % 3; // Divides 8 by 3, assigns the remainder (2) to myShort
		
		// Math assignment operators
		
		myInt += 5;       // Same as myInt = myInt + 5
		myInt -= myShort; // Same as myInt = myInt - myShort
		myInt *= myInt;   // Same as myInt = myInt * myInt
		myInt /= (3 + 6); // Same as myInt = myInt / (3 + 6)
		myInt %= 2;       // Same as myInt = myInt % 2
		
		// Output
		
		// Prints "Hello, World!" to the console, followed by a newline
		System.out.println("Hello, World!");
		
		// Prints "How are you doing?" to the console without a newline
		System.out.print("How are you doing?");
		
		// Prints just a newline
		System.out.println();
		
		// Prints "Java is fun!" with a newline ("\n" is a newline)
		System.out.print("Java is fun!\n");
		
		// Concatenates variable values to strings and prints the results
		System.out.println("myInt = " + myInt);
		System.out.println("myShort = " + myShort);
		
		// Input
		
		// Scanners are needed to perform input.
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		myInt = myScanner.nextInt(); // Get user input from console, assign result to myInt
		System.out.println("You entered " + myInt);
		
		myDouble = myScanner.nextDouble(); // Get double value entered by user, assign result to myDouble
	}
}