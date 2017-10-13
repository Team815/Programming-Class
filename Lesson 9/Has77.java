package wirsing.brian.CodingBat;

public class Has77 {

	public static void main(String[] args) {
		int[] input = {1, 3, 1, 4, 4, 3, 1};
		boolean result = has77(input);
	}
	
	public static boolean has77(int[] nums) {
		// First check that the array is big enough to have at least 2 7s in it
		if(nums.length < 2) {
			return false;
		}
		// This for loop looks at all values in the array, except for the last 2
		for(int i = 0; i < nums.length - 2; i++) {
			// Check the the next value or the value after is a 7 as well
			if(nums[i] == 7 && (nums[i+1] == 7 || nums[i+2] == 7)) {
				return true;
			}
		}
		// This final check is for the case that the last 2 elements in the array are 7
		// This is needed because the previous for loop does not iterate to the last 2 elements
		if(nums[nums.length-2] == 7 && nums[nums.length - 1] == 7) {
			return true;
		} else {
			return false;
		}
	}
}
