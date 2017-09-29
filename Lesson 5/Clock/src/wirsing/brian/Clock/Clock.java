package wirsing.brian.Clock;

public class Clock {
	private final int HOUR_MAX = 12;
	private final int MINUTE_MAX = 60;
	private final int SECOND_MAX = 60;
	
	private int hours;
	private int minutes;
	private int seconds;
	private boolean isAm;
	
	public Clock(int hoursIn, int minutesIn, int secondsIn, boolean isAmIn) {
		setTime(hoursIn, minutesIn, secondsIn, isAmIn);
	}
	
	public String getDisplay() {
		String timePeriod = isAm? " AM" : " PM";
		String secondsString = seconds < 10 ? "0" + seconds : Integer.toString(seconds);
		return hours + ":" + minutes + ":" + secondsString + timePeriod;
	}
	
	public void setTime(int hoursIn, int minutesIn, int secondsIn, boolean isAmIn) {
		hours = hoursIn;
		minutes = minutesIn;
		seconds = secondsIn;
		isAm = isAmIn;
	}
}
