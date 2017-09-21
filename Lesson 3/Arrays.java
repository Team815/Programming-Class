/*
 * This program demonstrates arrays and functions that return a value.
 */

package wirsing.brian.ArrayProgram;

public class Arrays {

	public static void main(String[] args) {
		
		final int ARRAY_SIZE = 10;
		
		int[] array = new int[ARRAY_SIZE];
		
		// Initialize all the elements of the array, from 0 to 9
		for(int i = 0; i < ARRAY_SIZE; i++) {
			array[i] = i;
		}
		
		String arrayString = arrayToString(array, ARRAY_SIZE);
		System.out.println("Array: " + arrayString);
	}
	
	// Return a string containing all the elements of the array
	public static String arrayToString(int[] array, int size) {
		String arrayString = "";
		for(int i = 0; i < size; i++) {
			arrayString += array[i] + " ";
		}
		return arrayString;
	}

}
