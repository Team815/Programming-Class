package first.team815.lesson6_inheritance;

public class EquilateralTriangle extends EquilateralShape {
	
	public EquilateralTriangle(int sideLength) {
		this.color = "Green";
		this.numSides = 3;
		this.sideLength = sideLength;
	}
	
	@Override
	public double getArea() {
		return (Math.sqrt(3)/4)*Math.pow(sideLength, 2);
	}
}
