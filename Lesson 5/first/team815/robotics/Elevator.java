package first.team815.robotics;

public class Elevator {
	// Class variables
	private boolean isUp;
	private boolean isDown;
	private boolean isMovingUp;
	private boolean isMovingDown;
	
	// Constructor
	public Elevator() {
		this.isDown = true;
		this.isUp = false;
		this.isMovingUp = false;
		this.isMovingDown = false;
	}
	
	public void moveUp() {
		setAllFalse();
		isMovingUp = true;
	}
	
	public void moveDown() {
		setAllFalse();
		isMovingDown = true;
	}
	
	public void stop() {
		if (isMovingUp == true) {
			setAllFalse();
			isUp = true;
		}
		else if (isMovingDown == true) {
			setAllFalse();
			isDown = true;
		}
	}
	
	// Print the state of the robot
	public void printState() {
		if (isDown) {
			System.out.println("Elevator is down");
		}
		else if (isUp) {
			System.out.println("Elevator is up");
		}
		else if (isMovingDown) {
			System.out.println("Elevator is moving down");
		}
		else if (isMovingUp) {
			System.out.println("Elevator is moving up");
		}
	}
	
	// Getters and Setters
	public boolean isUp() {
		return isUp;
	}

	public boolean isDown() {
		return isDown;
	}

	public boolean isMovingUp() {
		return isMovingUp;
	}

	public boolean isMovingDown() {
		return isMovingDown;
	}

	// Private helper function
	private void setAllFalse() {
		isDown = false;
		isUp = false;
		isMovingDown = false;
		isMovingUp = false;
	}
}
