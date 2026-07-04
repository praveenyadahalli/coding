package maang20;
import java.util.*;

// leetcode:15
public class Sum3 {

	// Note: For better understand of this solutiong please solve sum2 before sum3
	public static void main(String[] args) {
		int arr[]= {-1,0,1,2,-1,-4};
		List<List<Integer>> lists=threeSum(arr);
		int count=1;
		for(List<Integer> list:lists) {
			System.out.println("Printing the list Number:"+count);
			for(Integer i:list) {
				System.out.print(i+" ");
			}
		}
	}

	// tc=O(n2) sc=O(1) excluding output
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			int l = i + 1, r = nums.length - 1;

			while (l < r) {
				int sum = nums[i] + nums[l] + nums[r];

				if (sum == 0) {
					res.add(Arrays.asList(nums[i], nums[l], nums[r]));
					l++;
					r--;
					while (l < r && nums[l] == nums[l - 1])
						l++;
					while (l < r && nums[r] == nums[r + 1])
						r--;
				} else if (sum < 0) {
					l++;
				} else {
					r--;
				}
			}
		}

		return res;
	}

}
