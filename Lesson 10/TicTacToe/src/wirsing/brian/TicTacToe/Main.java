package wirsing.brian.TicTacToe;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Board board = new Board();
		Scanner scanner = new Scanner(System.in);
			
		while(true) {
			System.out.println(board.printBoard());
			System.out.print("\nEnter move: ");
			String input = scanner.nextLine();
			board.processInput(input);
		}
	}
}
