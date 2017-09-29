package hinojosa.juan.Assignment;

import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the carpet shop. Carpet is $7.65 per square foot.");
		System.out.print("Please enter your floor length in inches: ");
		Scanner myScanner = new Scanner(System.in);
		double L = myScanner.nextDouble();
		System.out.print("Please enter your floor width in inches: ");
		double W = myScanner.nextDouble();
		
		double price = (7.65/144);
		int total = (int)(L * W * price);
		int step = (int)(((double)((L * W * price) - total) + .005) * 100);
		double result = total + (step * .01);
		
		
		System.out.println("Length entered: " + L + " in");
		System.out.println("Width entered: " + W + " in");
		System.out.println("It will cost $" + result + " to carpet your floor.");
		

	}

}
