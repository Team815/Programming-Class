package first.team815.robotics;

public class Claw {
	private boolean isOpen;
	
	public Claw() {
		isOpen = false;
	}
	
	public void open() {
		isOpen = true;
	}
	
	public void close() {
		isOpen = false;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
}
