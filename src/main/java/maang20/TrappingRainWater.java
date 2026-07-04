package maang20;

// leetcode: 42
public class TrappingRainWater {
	public static void main(String[] args) {
		int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(ttrap(arr));
	}
	
	
	// SC=1,TC=(N)
	public static int ttrap(int[] height) {

        int n = height.length;
        int totalWater = 0;

        int leftMax = 0;
        int rightMax = 0;

        int start = 0;
        int end = n - 1;

        while (start < end) {

            leftMax = Math.max(leftMax, height[start]);
            rightMax = Math.max(rightMax, height[end]);

            if (leftMax < rightMax) {

                totalWater += leftMax - height[start];
                start++;

            } else {

                totalWater += rightMax - height[end];
                end--;
            }
        }

        return totalWater;
    }

	
	//SC=o(N) TC=o(N)
	public int trap(int[] height) {
		int n = height.length;
		int water = 0;
		int[] l_max = new int[n];
		int[] r_max = new int[n];

		l_max[0] = height[0];
		for (int i = 1; i < n; i++) {
			l_max[i] = Math.max(height[i], l_max[i - 1]);
		}

		r_max[n - 1] = height[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			r_max[i] = Math.max(height[i], r_max[i + 1]);
		}

		for (int i = 0; i < n; i++) {
			water += Math.min(r_max[i], l_max[i]) - height[i];
		}
		return water;
	}
}
