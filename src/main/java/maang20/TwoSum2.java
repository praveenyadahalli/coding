package maang20;


// leetcode :167
public class TwoSum2 {
	public static void main(String[] args) {
		int arr[]= {2,7,11,15};
		int target=9;
		
		for(int k:twoSum(arr, target)) {
			System.out.println(k);
		}
	}

	// tc=)(n), sc=(1)
	public static int[] twoSum(int[] numbers, int target) {
		int start = 0;
		int end = numbers.length - 1;

		while (start < end) {
			int sum = numbers[start] + numbers[end];

			if (sum == target) {
				return new int[] { start + 1, end + 1 };
			} else if (sum > target) {
				end--;
			} else {
				start++;
			}
		}
		return new int[] { -1, -1 };
	}
}
