package first.team815.robotics;

public class Main {
	static long start = System.currentTimeMillis();
	
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.autonamousInit();

		while (getDuration() < 1000) {
			robot.autonamousPeriodic();
		}

		// Uncomment this code to run our two teleop funtions
//		robot.teleopInit();
//		
//		while(getDuration() < 5000) {
//			robot.teleopPeriodic();
//		}
	}

	public static long getDuration() {
		return System.currentTimeMillis()-start;
	}
}
