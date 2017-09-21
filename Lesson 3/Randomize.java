/*
 * This program demonstrates the use of List and void functions to randomize an array.
 * Use this program as a starting point for your sorting program.
 */

package wirsing.brian.ArrayProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Randomize {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random rng = new Random();
		
		// Fill the list with 10 elements, from 0 to 9
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		// Randomize the list
		for(int i = list.size() - 1; i > 0; i--) {
			int swappingIndex = rng.nextInt(i);
			swap(list, i, swappingIndex);
		}
		
		printList(list);
	}
	
	// Prints the contents of the list
	public static void printList(List<Integer> listToPrint) {
		for(int i = 0; i < listToPrint.size(); i++) {
			System.out.print(listToPrint.get(i) + " ");
		}
		System.out.println();
	}
	
	// Swaps the values in index1 and index2 of the list
	public static void swap(List<Integer> list, int index1, int index2) {
		int temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);
	}

}
