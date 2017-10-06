package wirsing.brian.Clock;

public class Alarm {
	private Time time;
	private boolean enabled;
	private String triggerMessage;
	
	public Alarm() {
		this(0, 0, 0);
	}
	
	public Alarm(int hoursIn, int minutesIn, int secondsIn) {
		time = new Time(hoursIn, minutesIn, secondsIn);
	}
	
	public boolean wasTriggered(Time timeIn) {
		return enabled && time.isEqualTo(timeIn);
	}
	
	public void onTriggered() {
		System.out.println("Alarm went off");
	}
	

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getTriggerMessage() {
		return triggerMessage;
	}

	public void setTriggerMessage(String triggerMessage) {
		this.triggerMessage = triggerMessage;
	}
}
