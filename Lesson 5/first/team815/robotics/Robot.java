package first.team815.robotics;

public class Robot {
	static DriveTrain driveTrain;
	static Claw claw;
	
	public void autonamousInit() {
		driveTrain = new DriveTrain(5);
		claw = new Claw();
	}
	
	public void autonamousPeriodic() {
		DriveDistance.driveDistance(5);
		if(!claw.isOpen()) {
			claw.open();
		}
		else if (claw.isOpen()) {
			claw.close();
		}
		System.out.println("Claw open? " + claw.isOpen());
	}
	
	public void teleopInit() {
		System.out.println("Teleop Init");
	}
	
	public void teleopPeriodic() {
		System.out.println("Telop Periodic");
	}

}
