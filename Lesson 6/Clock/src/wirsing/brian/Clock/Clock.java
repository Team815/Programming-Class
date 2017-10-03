package wirsing.brian.Clock;

public class Clock {
	private Time time;
	private static int count = 0;
	
	public Clock() {
		count++;
	}
	
	public Clock(int hoursIn, int minutesIn, int secondsIn) {
		count++;
		time = new Time(hoursIn, minutesIn, secondsIn);
	}
	
	public String getDisplay24() {
		return time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds();
	}
	
	public static int getCount() {
		return count;
	}
}
