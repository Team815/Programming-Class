package wirsing.brian.Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Part1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		fillList(list, 10); // Fills the list with 10 integers from 0 to 9
		System.out.println("Initial list: " + printList(list));
		randomizeList(list);
		System.out.println("Randomized list: " + printList(list));
		sortList(list);
		System.out.println("Sorted list: " + printList(list));
	}
	
	public static void fillList(List<Integer> list, int size) {
		for(int i = 0; i < size; i++) {
			list.add(i);
		}
	}
	
	public static void randomizeList(List<Integer> list) {
		Random rng = new Random();
		for(int i = list.size() - 1; i > 0; i--) {
			int swappingIndex = rng.nextInt(i);
			swap(list, i, swappingIndex);
		}
	}
	
	public static void sortList(List<Integer> list) {
		System.out.println("Sorting steps");
		for(int i = 0; i < list.size(); i++) {
			int minIndex = i;
			for(int j = i; j < list.size(); j++) {
				if(list.get(j) < list.get(minIndex)) {
					minIndex = j;
				}
			}
			System.out.println(printList(list));
			swap(list, i, minIndex);
		}
		/*
		for(int i = 1; i < list.size(); i++) {
			for(int j = i; j > 0 && list.get(j) < list.get(j-1); j--) {
				swap(list, j, j-1);
			}
			System.out.println(printList(list));
		}*/
	}
	
	// Prints the contents of the list
	public static String printList(List<Integer> list) {
		String listString = "";
		for(int i = 0; i < list.size(); i++) {
			listString += list.get(i) + " ";
		}
		return listString;
	}
	
	// Swaps the values in index1 and index2 of the list
	public static void swap(List<Integer> list, int index1, int index2) {
		int temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);
	}

}
