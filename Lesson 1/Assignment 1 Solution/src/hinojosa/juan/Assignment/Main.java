package hinojosa.juan.Assignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		System.out.print("Please enter your first number: ");
		Scanner myScanner = new Scanner(System.in);
		double A = myScanner.nextDouble();
		System.out.print("Please enter your second number: ");
		double B = myScanner.nextDouble();
		System.out.print("Please enter your third number: ");
		double C = myScanner.nextDouble();
		
		double sum = A + B;
		double diff = B - C;
		double prod = A * C;
		double weird1 = ((A+B)/(B-C));
        int result = (int)(weird1 + .5);
		double weird2 = (A+B+C)%C;
		
		System.out.println(A + " + " + B + " = " + sum);
        System.out.println(B + " - "  + C + " = " + diff);
        System.out.println(A + " * " + C + " = " + prod);
        System.out.println("(" + A + " + " + B + ") / (" + B + " - " + C + ") = " + result);
        System.out.println("(" + A + " + " + B + " + " + C + ") % " + C + " = " + weird2);

	}

}
