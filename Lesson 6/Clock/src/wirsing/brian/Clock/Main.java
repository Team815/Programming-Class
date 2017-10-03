package wirsing.brian.Clock;

public class Main {

	public static void main(String[] args) {
		Clock clock = new Clock(18, 15, 30);
		System.out.println(clock.getDisplay24());
	}

}
