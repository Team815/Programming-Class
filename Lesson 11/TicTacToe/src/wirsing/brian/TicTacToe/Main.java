package wirsing.brian.TicTacToe;

import java.util.Scanner;

import wirsing.brian.TicTacToe.Game.GameState;

public class Main {
	
	public static void main(String[] args) {
		Game ticTacToe = new Game();
		Scanner scanner = new Scanner(System.in);
		GameState gameState = GameState.IN_PLAY;
		while(gameState == GameState.IN_PLAY) {
			System.out.println(ticTacToe.printBoard());
			System.out.print("Enter move: ");
			String input = scanner.nextLine();
			gameState = ticTacToe.processInput(input);
		}
		System.out.println(ticTacToe.printBoard());
		if(gameState == GameState.PLAYER_X_WON) {
			System.out.println("Player X Won!");
		} else if(gameState == GameState.PLAYER_O_WON) {
			System.out.println("Player O Won!");
		} else {
			System.out.println("Cat's Game!");
		}
	}
}
