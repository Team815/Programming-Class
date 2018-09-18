package first.team815.lesson6_inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		EquilateralShape triangle = new EquilateralTriangle(3);
		
		System.out.println(triangle.getColor());
		System.out.println(triangle.getPerimeter());
		System.out.println(triangle.getArea());
		
		EquilateralShape square = new Square(10);
		
		System.out.println(square.getColor());
		System.out.println(square.getPerimeter());
		System.out.println(square.getArea());
	}

}
