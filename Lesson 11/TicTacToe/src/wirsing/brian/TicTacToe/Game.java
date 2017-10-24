package wirsing.brian.TicTacToe;

import java.util.ArrayList;
import java.util.List;

import wirsing.brian.TicTacToe.Square.Value;

public class Game {
	enum Player {
		PLAYER_X(Square.Value.X),
		PLAYER_O(Square.Value.O);
		
		private Square.Value value;
		private Player(Square.Value valueIn) {
			value = valueIn;
		}
		public Square.Value getValue() {
			return value;
		}
	}
	
	enum GameState {
		IN_PLAY,
		PLAYER_X_WON,
		PLAYER_O_WON,
		CATS_GAME
	}
	
	Player activePlayer = Player.PLAYER_X;
	private List<Square> squares = new ArrayList<Square>();
	private List<WinningSet> winningSets = new ArrayList<WinningSet>();
	
	public Game() {
		for(int i = 0; i < 9; i++) {
			squares.add(new Square());
		}
		
		// Rows
		winningSets.add(new WinningSet(squares.get(0), squares.get(1), squares.get(2)));
		winningSets.add(new WinningSet(squares.get(3), squares.get(4), squares.get(5)));
		winningSets.add(new WinningSet(squares.get(6), squares.get(7), squares.get(8)));
		
		// Columns
		winningSets.add(new WinningSet(squares.get(0), squares.get(3), squares.get(6)));
		winningSets.add(new WinningSet(squares.get(1), squares.get(4), squares.get(7)));
		winningSets.add(new WinningSet(squares.get(2), squares.get(5), squares.get(8)));
		
		// Diagonals
		winningSets.add(new WinningSet(squares.get(0), squares.get(4), squares.get(8)));
		winningSets.add(new WinningSet(squares.get(2), squares.get(4), squares.get(6)));
	}
	
	public GameState processInput(String input) {
		int index = 0;
		switch(input.toUpperCase()) {
		case "Q":
			index = 0;
			break;
		case "W":
			index = 1;
			break;
		case "E":
			index = 2;
			break;
		case "A":
			index = 3;
			break;
		case "S":
			index = 4;
			break;
		case "D":
			index = 5;
			break;
		case "Z":
			index = 6;
			break;
		case "X":
			index = 7;
			break;
		case "C":
			index = 8;
			break;
		default:
			return GameState.IN_PLAY;
		}
		Square chosenSquare = squares.get(index);
		if(chosenSquare.getValue() != Value.BLANK) {
			return GameState.IN_PLAY;
		}
		chosenSquare.setValue(activePlayer.getValue());
		if(chosenSquare.checkForWin()) {
			return activePlayer == Player.PLAYER_X ? GameState.PLAYER_X_WON : GameState.PLAYER_O_WON;
		}
		for(Square square : squares) {
			if(square.getValue() == Square.Value.BLANK) {
				activePlayer = activePlayer == Player.PLAYER_X ? Player.PLAYER_O : Player.PLAYER_X;
				return GameState.IN_PLAY;
			}
		}
		return GameState.CATS_GAME;
	}
	
	public String printBoard() {
		String boardString = "";
		boardString += printLine(0) + "\n";
		boardString += "-+-+-\n";
		boardString += printLine(1) + "\n";
		boardString += "-+-+-\n";
		boardString += printLine(2) + "\n";
		return boardString;
	}
	
	private String printLine(int lineNumber) {
		int index = lineNumber * 3;
		String line = "";
		line += squares.get(index++).getValue().getChar() + "|";
		line += squares.get(index++).getValue().getChar() + "|";
		line += squares.get(index++).getValue().getChar();
		return line;
	}
}
