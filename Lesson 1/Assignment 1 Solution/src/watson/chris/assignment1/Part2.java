package watson.chris.assignment1;

import java.util.Scanner;

public class Part2 
{

	public static void main(String[] args)
	{
		Scanner insert = new Scanner(System.in);
		System.out.println("Welcome to Team 815 Advanced Power's carpet store.");
		System.out.println("We sell carpet at $7.65 per square foot.");
		System.out.println("If you would like to check the price for the amount");
		System.out.println("you are looking for please input your lengths below.");
		System.out.println("Enter the width of the area in iches here: ");
		double width = insert.nextDouble();
		System.out.println("Enter the length of the area in inches here: ");
		double length = insert.nextDouble();
		
		length = length / 12;
		width = width / 12;
		double square = width * length;
		int price = (int)(square * 7.65);
		int dec = (int)(((square * 7.65)-price)*100);
		double result = price + dec * .01;
		int square2 = (int)square;
		
		System.out.println("The total for " + square2 + " square feet is $" + result);
		
		
	}

}
