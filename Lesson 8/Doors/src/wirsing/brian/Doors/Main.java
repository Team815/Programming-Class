package wirsing.brian.Doors;

public class Main {

	public static void main(String[] args) {
		final boolean CLOSED = false;
		final boolean OPEN = true;
		final int DOOR_COUNT = 100;
		
		boolean[] doors = new boolean[DOOR_COUNT];
		
		for(int i = 0; i < DOOR_COUNT; i++) {
			doors[i] = CLOSED;
		}
		
		for(int i = 1; i <= DOOR_COUNT; i++) {
			for(int j = i-1; j < DOOR_COUNT; j += i) {
				doors[j] = !doors[j];
			}
		}
		
		System.out.println("Open Doors");
		for(int i = 0; i < DOOR_COUNT; i++) {
			if(doors[i] == OPEN) {
				System.out.print(i+1 + " ");
			}
		}
		System.out.println("\nClosed Doors");
		for(int i = 0; i < DOOR_COUNT; i++) {
			if(doors[i] == CLOSED) {
				System.out.print(i+1 + " ");
			}
		}
	}
}