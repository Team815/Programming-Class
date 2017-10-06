package wirsing.brian.Clock;

public class Time {
	public static final int HOUR_MAX = 23;
	public static final int MINUTE_MAX = 59;
	public static final int SECOND_MAX = 59;
	
	private int hours;
	private int minutes;
	private int seconds;
	
	public Time(int hoursIn, int minutesIn, int secondsIn) {
		hours = hoursIn;
		minutes = minutesIn;
		seconds = secondsIn;
	}
	
	public boolean isEqualTo(Time timeIn) {
		if(hours == timeIn.getHours()
				&& minutes == timeIn.getMinutes()
				&& seconds == timeIn.getSeconds()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void increaseHours(int hoursIn) {
		hours += hoursIn;
	}
	
	public void increaseMinutes(int minutesIn) {
		minutes += minutesIn;
	}
	
	public void increaseSeconds(int secondsIn) {
		seconds += secondsIn;
	}
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
}
