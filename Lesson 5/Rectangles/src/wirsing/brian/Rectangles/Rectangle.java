package wirsing.brian.Rectangles;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double lengthIn, double widthIn) {
		length = lengthIn;
		width = widthIn;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return 2 * length + 2 * width;
	}
	
	public boolean isSquare() {
		return length == width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setLength(double lengthIn) {
		length = lengthIn;
	}
	
	public void setWidth(double widthIn) {
		width = widthIn;
	}
}
