package wirsing.brian.Clock;

public class Clock {
	private Time time;
	private Alarm alarm;
	private static int count = 0;
	
	public Clock() {
		this(0, 0, 0);
	}
	
	public Clock(int hoursIn, int minutesIn, int secondsIn) {
		count++;
		time = new Time(hoursIn, minutesIn, secondsIn);
		alarm = new Alarm();
	}
	
	public void incrementHours(int hoursIn) {
		incrementSeconds(hoursIn * 60 * 60);
	}
	
	public void incrementMinutes(int minutesIn) {
		incrementSeconds(minutesIn * 60);
	}
	
	public void incrementSeconds(int secondsIn) {
		for(int i = 0; i < secondsIn; i++) {
			time.increaseSeconds(1);
			if(time.getSeconds() > Time.SECOND_MAX) {
				time.setSeconds(0);
				time.increaseMinutes(1);
				if(time.getMinutes() > Time.MINUTE_MAX) {
					time.setMinutes(0);
					time.increaseHours(1);
					if(time.getHours() > Time.HOUR_MAX) {
						time.setHours(0);
					}
				}
			}
			if(alarm.wasTriggered(time)) {
				alarm.onTriggered();
			}
		}
	}
	
	public void enableAlarm() {
		alarm.setEnabled(true);
	}
	
	public void disableAlarm() {
		alarm.setEnabled(false);
	}
	
	public void setAlarm(int hoursIn, int minutesIn, int secondsIn) {
		alarm.setTime(new Time(hoursIn, minutesIn, secondsIn));
	}
	
	public String getTime24() {
		return printTime(time);
	}
	
	public String getAlarmTime24() {
		return printTime(alarm.getTime());
	}
	
	public String printTime(Time timeIn) {
		return timeIn.getHours() + ":" + timeIn.getMinutes() + ":" + timeIn.getSeconds();
	}
	
	public static int getCount() {
		return count;
	}
}
