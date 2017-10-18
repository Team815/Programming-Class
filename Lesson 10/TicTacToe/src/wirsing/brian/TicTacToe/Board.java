package wirsing.brian.TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {
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
	
	Player activePlayer = Player.PLAYER_X;
	private List<Square> squares = new ArrayList<Square>();
	
	public Board() {
		for(int i = 0; i < 9; i++) {
			squares.add(new Square());
		}
	}
	
	public void processInput(String input) {
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
		}
		squares.get(index).setValue(activePlayer.getValue());
		activePlayer = activePlayer == Player.PLAYER_X ? Player.PLAYER_O : Player.PLAYER_X;
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
