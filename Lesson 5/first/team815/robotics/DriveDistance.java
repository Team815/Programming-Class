package first.team815.robotics;

public class DriveDistance {
	
	
	public static void driveDistance(double distance) {
		double speed = Robot.driveTrain.getSpeed();
		
		System.out.println("Distance: " + distance);
		System.out.println("Speed: " + speed);
		System.out.println("Time: " + distance/speed);
	}
}
