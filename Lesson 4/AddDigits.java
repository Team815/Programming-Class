package wirsing.brian.Recursion;

public class AddDigits {

	public static void main(String[] args) {
		System.out.println(addDigits(12345));
	}

	public static int addDigits(int number) {
		if(number < 10) {
			return number;
		} else {
			int digit = number % 10;
			int restOfNumber = number / 10;
			return digit + addDigits(restOfNumber);
		}
	}
}
