package maang20;

// leetcode : 53
public class MaximumSubarray {
	public static void main(String[] args) {
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}

	// TC=O(n)
	public static int maxSubArray(int[] nums) {
		int currSum = nums[0];
		int maxSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			currSum = Math.max(nums[i] + currSum, nums[i]);
			maxSum = Math.max(currSum, maxSum);
		}
		return maxSum;
	}
}
