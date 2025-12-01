import java.util.*;
public class Test {
	public static void main(String args[]) {
		int[] arr= {3,1,2};
//		for(int i:countElements(arr,2)) {
			System.out.println("Value: "+countElements(arr,1));
//		}
	}
	 public static int countElements(int[] nums, int k) {
	        if(k == 0) return nums.length;
	        Arrays.sort(nums);
	        int i = nums.length - k, n = nums[i];
	        if(nums[0] == n) return 0;
	        while(n == nums[i]) i--;
	        return i + 1;
	    }
}
