package wirsing.brian.CodingBat;

public class Fix34 {
	
	public static void main(String[] args) {
		int[] input = {1, 3, 1, 4, 4, 3, 1};
		int[] result = fix34(input);
	}
	
	public static int[] fix34(int[] nums) {
		// This for loop is used to find all 3s
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] == 3) {
				// This for loop is used to find an eligible for
				for(int j = 0; j < nums.length; j++) {
					// This if statement makes sure it's a four that is out of place
					if(nums[j] == 4 && (j == 0 || nums[j-1] != 3)) {
						int temp = nums[i+1];
						nums[i+1] = nums[j];
						nums[j] = temp;
					}
				}
			}
		}
		return nums;
	}
}
