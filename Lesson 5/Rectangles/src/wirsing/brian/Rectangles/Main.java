package wirsing.brian.Rectangles;

public class Main {

	public static void main(String[] args) {
		Rectangle myRect = new Rectangle(3.5, 2.7);
		double rectLength = myRect.getLength();
		double rectWidth = myRect.getWidth();
		
		System.out.println("Length: " + rectLength);
		System.out.println("Width: " + rectWidth);
		System.out.println("Square: " + myRect.isSquare());
		
		myRect.setLength(2.8);
		myRect.setWidth(2.8);
		
		System.out.println("Length: " + myRect.getLength());
		System.out.println("Width: " + myRect.getWidth());
		System.out.println("Area: " + myRect.getArea());
		System.out.println("Perimeter: " + myRect.getPerimeter());
		System.out.println("Square: " + myRect.isSquare());
	}

}
