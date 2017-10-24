package wirsing.brian.TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class WinningSet {
	private List<Square> squares = new ArrayList<Square>();
	
	public WinningSet(Square square1, Square square2, Square square3) {
		squares.add(square1);
		squares.add(square2);
		squares.add(square3);
		square1.addWinningSet(this);
		square2.addWinningSet(this);
		square3.addWinningSet(this);
	}
	
	public boolean checkForWin() {
		Square.Value square0Value = squares.get(0).getValue();
		if(square0Value == Square.Value.BLANK) {
			return false;
		}
		for(Square square : squares) {
			if(square.getValue() != square0Value) {
				return false;
			}
		}
		return true;
	}
}
