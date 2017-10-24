package TwoDimensionalArray;

public class TwoDimensionalArray {
	static final int HEIGHT = 20;
	static final int WIDTH = 10;
	
	public static void main(String[] args) {
		int[][] twoDimArray = new int[HEIGHT][WIDTH];
		
		for(int i=0;i<twoDimArray.length;i++) {
			for(int j=0;j<twoDimArray.length;j++) {	// j=i, we get a diagonal pattern
				twoDimArray[i][j] = j+i+1;
			}
		}
		
		printTwoDimArray(twoDimArray);
	}
	
	public static void printTwoDimArray(int[][] tdm) {
		for(int i=0;i<HEIGHT;i++) {
			for(int j=0;j<WIDTH;j++) {
				System.out.print(tdm[i][j] + " ");
			}
			System.out.println();
		}
	}
}
