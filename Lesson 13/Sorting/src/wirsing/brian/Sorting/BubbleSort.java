package wirsing.brian.Sorting;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = new int[6];
		fillArray(array);
		printArray(array);
		//bubbleSort(array);
		selectionSort(array);
		//printArray(array);
	}
	
	public static void fillArray(int[] array) {
		Random random = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
	}
	
	public static void bubbleSort(int[] array) {
		boolean sorted;
		for(int i = 0; i < array.length; i++) {
			sorted = true;
			for(int j = 0; j < array.length - 1 - i; j++) {
				if(array[j] > array[j+1]) {
					sorted = false;
					swap(array, j, j+1);
				}
			}
			printArray(array);
			if(sorted) {
				return;
			}
		}
	}
	
	public static void selectionSort(int[] array) {
		int minIndex;
		for(int i = 0; i < array.length; i++) {
			minIndex = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				swap(array, i, minIndex);
				printArray(array);
			}
		}
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void swap(int[] array, int i1, int i2) {
		int temp = array[i1];
		array[i1] = array[i2];
		array[i2] = temp;
	}
}
