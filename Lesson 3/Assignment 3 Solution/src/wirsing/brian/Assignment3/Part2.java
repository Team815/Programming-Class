package wirsing.brian.Assignment3;

public class Part2 {

	public static void main(String[] args) {
		int largestPalindrome = 0;
		for(int i = 100; i < 1000; i++) {
			for(int j = 100; j < 1000; j++) {
				int product = i*j;
				if(isPalindrome(product) && product > largestPalindrome) {
					largestPalindrome = product;
				}
			}
		}
		System.out.println(largestPalindrome);
	}
	
	public static boolean isPalindrome(int input) {
		String inputString = Integer.toString(input);
		for(int i = 0; i < inputString.length() / 2; i++) {
			if(inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
