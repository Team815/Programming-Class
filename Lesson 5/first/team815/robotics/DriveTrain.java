package first.team815.robotics;

public class DriveTrain {
	private double speed;
	
	public DriveTrain() {
		speed = 1;
	}
	
	public DriveTrain(double speed) {
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
}
