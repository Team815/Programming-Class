package first.team815.lesson6_inheritance;

public class Square extends EquilateralShape {
	
	public Square(int sideLength) {
		this.color = "Blue";
		this.numSides = 4;
		this.sideLength = sideLength;
	}
	
	@Override
	public double getArea() {
		return (int) Math.pow(sideLength, 2);
	}

}
