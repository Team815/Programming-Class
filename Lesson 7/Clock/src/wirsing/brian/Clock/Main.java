package wirsing.brian.Clock;

public class Main {

	public static void main(String[] args) {
		Clock clock = new Clock(6, 45, 15);
		clock.setAlarm(7, 30, 0);
		clock.enableAlarm();

		clock.incrementHours(1);
		System.out.println(clock.getTime24());
		System.out.println(clock.getAlarmTime24());
	}

}
