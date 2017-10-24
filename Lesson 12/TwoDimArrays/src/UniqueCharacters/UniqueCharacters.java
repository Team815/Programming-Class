package UniqueCharacters;

import java.util.Scanner;

//	Hints
//	- Strings are basically a special array of chars
//	- .charAt(index) returns the char at the given position in the string

// Test Case
//	- pizza
//	- word
//	- solo

public class UniqueCharacters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please give me a word: ");
		String word = scanner.nextLine();
		System.out.println(isUnique(word));
	}
	
	public static boolean isUnique(String word) {
		for(int i=0;i<word.length();i++) {
			char letter = word.charAt(i);
			for(int j=i+1;j<word.length();j++) {
				if(word.charAt(j) == letter) {
					return false;
				}
			}
		}
		return true;
	}

}
