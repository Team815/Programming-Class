package wirsing.brian.TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Square {
	public enum Value {
		BLANK(' '),
		X('X'),
		O('O');
		
		private char character;
		private Value(char characterIn) {
			character = characterIn;
		}
		public char getChar() {
			return character;
		}
	}
	private Value value = Value.BLANK;
	private List<WinningSet> winningSets = new ArrayList<WinningSet>();
	
	public void addWinningSet(WinningSet winningSetIn) {
		winningSets.add(winningSetIn);
	}
	
	public boolean checkForWin() {
		for(WinningSet winningSet : winningSets) {
			if(winningSet.checkForWin()) {
				return true;
			}
		}
		return false;
	}
	
	public Value getValue() {
		return value;
	}
	
	public void setValue(Value valueIn) {
		this.value = valueIn;
	}
}
