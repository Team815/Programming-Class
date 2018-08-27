package Lesson2_Materials;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Review
		//	Comments
				
			// Naming conventions
				// Pascal Case for classes
				 * PizzaPizza
				// Camel Case for variables and functions
				 * pizzaPizza
				 
			// Data types
				// Numeric Data types
				 * int, double, float, byte, short, and long
				// Booleans
				 * true and false
				// Char and String
				 * char myChar = 'a'
				 * String myString = "pizza"
				 
			// Assignment Operators
				// Basic assignment with '='
				// Math operators
				 * +, -, *, /, %
				// Math assignment operators
				 * +=, -=, *=, /=, %=
				 * myInt = myInt +1
				 * myInt += 1
				 * myInt++
				 
			// Explicit Casting
			 	(int), (float), etc.
			// I/O
				// Input with Scanner
				 * Scanner scanner = new Scanner(System.in);
				// Output with System.out
				 * System.out.println()
		*/
		
		/* Conditional Statements */
		
			// A simple use case
			Scanner scanner = new Scanner(System.in);
					
			double dividend = scanner.nextDouble();
			double divisor = scanner.nextDouble();
			double quotient;
			
			quotient = dividend/divisor;
			System.out.println(quotient);
			
			if (divisor != 0) {
				quotient = dividend/divisor;
				System.out.println(quotient);
			}
			else System.out.println("Cannot divide by zero");
			  
			 // Conditional keywords
			 	// if
			 	// else
			 	// else if
			  
			 // Conditional syntax
			 	/* if ([VALUE] [CONDITIONAL OPERATOR] [VALUE]) {
			 			[ACTION]
			 		}
			 	*/
		
				/* else {
						[ACTION]
					}
				*/
		
				/* else if ([VALUE] [CONDITIONAL OPERATOR] [VALUE]) {
			 			[ACTION]
			 		}
			 	*/
			  
			 // Conditional operators
				// if equal to: ==
				// if not equal to: !=
				// if greater than: >
				// if greater than or equal to: >=
				// if less than: <
				// if less than or equal to: <=
				// Logical OR: ||
				// Logical AND: &&
				
				// For strings comparisons, use .equals()
				// Do this: string1.equals(string2)
				// NOT this: string1 == string2
			   
			 // Switch statements
				/* switch (VALUE) {
					case VALUE: 
					 ACTION;
					 break;	
					 }
				 */
			
			// Examples
			int int1 = 0;
			int int2 = 1;
			
			if (int1 == int2) { // false condition
				System.out.println("i equals j");
			}
			
			if (int1 != int2) { // true condition
				System.out.println("i does not equal j");
			}
			
			if (int1 < int2) { // true condition
				System.out.println("i is less than j");
			}
			
			if (int1 >= int2) { // false condition
				System.out.println("i is greater than or equal to j");
			}
			
			if (int1 == 0 && int1 > int2) { // two conditions: one is false, so the whole thing is false
				System.out.println("i equals 0 and is greater than j");
			}
			
			if (int1 == 0 || int1 > int2) { // two conditions: one is true, so the whole thing is true
				System.out.println("i equals 0 or is greater than j");
			}
			
			int1++; // i now equals 1
			int2++; // j now equals 2
			if (int1 % int2 == 0) { // false condition
				System.out.println("i is evenyl divisible by j");
			}
			// if the above condition is false, execute this code instead
			else {
				System.out.println("i is not evenly divisible by j");
			}
			
			if (int1 == int2) { // false condition
				System.out.println("i equals j");
			}
			else if (int1+1 == int2) { // true condition
				System.out.println("i+1 equals j");
			}
			
			// Switch statement example
			int month = 8;
	        String monthString;
	        switch (month) {
	            case 1:  monthString = "January";
	                     break;
	            case 2:  monthString = "February";
	                     break;
	            case 3:  monthString = "March";
	                     break;
	            case 4:  monthString = "April";
	                     break;
	            case 5:  monthString = "May";
	                     break;
	            case 6:  monthString = "June";
	                     break;
	            case 7:  monthString = "July";
	                     break;
	            case 8:  monthString = "August";
	                     break;
	            case 9:  monthString = "September";
	                     break;
	            case 10: monthString = "October";
	                     break;
	            case 11: monthString = "November";
	                     break;
	            case 12: monthString = "December";
	                     break;
	            default: monthString = "Invalid month";
	                     break;
	        }
	        //System.out.println(monthString);
	        // See https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html for more info on switch statements
			
		/* Loops */
		
			 // A simple use case
			 	Scanner scanner2 = new Scanner(System.in);
					
				double dividend2 = scanner2.nextDouble();
				double divisor2 = scanner2.nextDouble();
				double quotient2;
				
				while (divisor2 == 0) {
					System.out.println("Cannot use 0 as the divisor, please enter another divisor");
					divisor2 = scanner2.nextDouble();
				}
				quotient2 = dividend2/divisor2;
				System.out.println(quotient2);
			  
			 // Types of loops
				
			 	// For
			 	// While
			 	// Do While
			 	// Foreach
			  
			 // Loop keywords
			 	// 'While'
			 	// 'Do While'
			 	// 'For'
			  
			 // Loop syntax
			 	// for(int i=0;i<VALUE;i++) {}
			 	// for(NEW_VARIABLE : COLLECTION) {}
			 	// while(CONDITION) {}
			 	// do {} while (CONDITION)
			 
			 // Infinite loops
			  // while (true) {}
				
			// Examples
				int1 = 0;
				int2 = 5;
				
				// This loop will add one to int1 until greater than int2
				// Checks condition at the top of the loop
				while (int1 <= int2) { // loop while this condition is false
					int1++;
				}
				
				// Checks condition at the bottom of the loop
				do {
					int1++;
				} while(int1 <= int2);
				// int1 still gets incremented and now equals 7
		
				// Adds 1 to each variable 5 times
				for(int i=0;i<5;i++) {
					int1++;
					int2++;
				}
				
	}

}
