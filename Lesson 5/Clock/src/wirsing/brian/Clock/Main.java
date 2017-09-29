package wirsing.brian.Clock;

public class Main {

	public static void main(String[] args) {
		Clock clock = new Clock(5, 50, 30, false);
		System.out.println(clock.getDisplay());
		clock.setTime(3, 12, 59, true);
		System.out.println(clock.getDisplay());
	}

}
