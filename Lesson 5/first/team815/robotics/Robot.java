package first.team815.robotics;

public class Robot {
	static DriveTrain driveTrain;
	static Claw claw;
	static Elevator elevator;
	
	public void autonamousInit() {
		driveTrain = new DriveTrain(5);
		claw = new Claw();
		elevator = new Elevator();
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
		
		if (elevator.isDown()) {
			elevator.moveUp();
		}
		else if (elevator.isUp()) {
			elevator.moveDown();
		}
		else if (elevator.isMovingDown() || elevator.isMovingUp()) {
			elevator.stop();
		}
		elevator.printState();
	}
	
	public void teleopInit() {
		System.out.println("Teleop Init");
	}
	
	public void teleopPeriodic() {
		System.out.println("Telop Periodic");
	}

}
