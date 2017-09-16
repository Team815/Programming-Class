package mike.porterpractice;

import java.util.Scanner;
import java.util.Formatter;

public class Part2CarpetCalc {
	public static void main(String[] args) {
		System.out.println("Carpet Calulator for Porter Rugs for Less");
		System.out.print("Enter coverage width in inches: ");
		Scanner myScanner;
		myScanner = new Scanner(System.in);
		double numberW = myScanner.nextDouble();
		System.out.print("Enter coverage Length in inches: ");
		Scanner myScanner1;
		myScanner1 = new Scanner(System.in);
		double numberL = myScanner.nextDouble();
		//W*L
		double multi = (double)numberW * (double)numberL;
		double result = (double)multi;
		System.out.println(numberW + " * " + numberL  + " = " + result);
		double area = (double)result/144;
		double cost  = (double)area*7.65;
			Formatter fmt = new Formatter();
				fmt.format("%.2f",cost);
		System.out.println("Price for area coverage");
		System.out.println("$" + fmt);
		                fmt.close();
		myScanner.close();
		myScanner1.close();
	}
}
