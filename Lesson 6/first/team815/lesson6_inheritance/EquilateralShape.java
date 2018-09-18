package first.team815.lesson6_inheritance;

public abstract class EquilateralShape {
	protected String color;
	protected int numSides;
	protected int sideLength;
	
	// Default constructor
	public EquilateralShape() {
		this.color = "white";
		this.numSides = 2;
		this.sideLength = 1;
	}

	// This is the same for all equilateral shapes
	public int getPerimeter() {
		return numSides*sideLength;
	}
	
	// Abstract function
	// Must be defined be each individual shape
	// Area formula is different for each shape
	public abstract double getArea();
	
	// Getter
	public String getColor() {
		return color;
	}

	// Setter
	public int getNumSides() {
		return numSides;
	}
}
