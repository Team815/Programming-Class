package watson.chris.assignment1;

import java.util.Scanner;

public class Part1 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a number: ");
		double numbA = input.nextDouble();
		System.out.println("Input another number: ");
		double numbB = input.nextDouble();
		System.out.println("Input one final number: ");
		double numbC = input.nextDouble();
		
		int result;
		double sum = numbA + numbB;
		double diff = numbB - numbC;
		double prod = numbA * numbC;
		double quo = sum / diff;
		quo = quo + .5;
		result = (int)quo;
		double mod = (numbA + numbB + numbC) % numbC;
		
		System.out.println(numbA + "+" + numbB + "=" + sum);
		System.out.println(numbB + "-" + numbC + "=" + diff);
		System.out.println(numbA + "*" + numbC + "=" + prod);
		System.out.println("(" + numbA + "+" + numbB + ")" + "/" + "(" + numbB + "-" + numbC + ")" + "=" + result);
		System.out.println("(" + numbA + "+" + numbB + "+" + numbC + ")" + "%" + numbC + "=" + mod);
		
	}

}
