package wirsing.brian.Clock;

public class Time {
	private static final int HOUR_MAX = 23;
	private static final int MINUTE_MAX = 59;
	private static final int SECOND_MAX = 59;
	
	private int hours;
	private int minutes;
	private int seconds;
	
	public Time(int hoursIn, int minutesIn, int secondsIn) {
		hours = hoursIn;
		minutes = minutesIn;
		seconds = secondsIn;
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
