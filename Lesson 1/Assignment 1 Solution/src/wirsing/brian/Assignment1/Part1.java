package wirsing.brian.Assignment1;

import java.util.Scanner;

public class Part1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a = scanner.nextInt();
		System.out.print("Enter number 2: ");
		int b = scanner.nextInt();
		System.out.print("Enter number 3: ");
		int c = scanner.nextInt();
		
		int aPlusB = a + b;
		int bMinusC = b - c;
		int aTimesC = a * c;
		int quotient = (int)((double)aPlusB / (double)bMinusC + 0.5);
		int modulus = (a + b + c) % c;
		System.out.println(a + " + " + b + " = " + aPlusB);
		System.out.println(b + " - " + c + " = " + bMinusC);
		System.out.println(a + " * " + c + " = " + aTimesC);
		System.out.println("(" + a + " + " + b + ") / (" + b + " - " + c + ") = " + quotient);
		System.out.println("(" + a + " + " + b + " + " + c + ") % " + c + " = " + modulus);
		scanner.close();
	}
}
