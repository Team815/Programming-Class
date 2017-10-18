package wirsing.brian.TicTacToe;

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
	
	public Value getValue() {
		return value;
	}
	
	public void setValue(Value value) {
		this.value = value;
	}
}
