package maang20;

// leetcode :121
public class MaxProfit {
	public static void main(String[] args) {
		int arr[] = { 7, 1, 5, 6 };
		System.out.println(maxProfit(arr));
	}

	//TC=O(N) SC=1
	public int maxxProfit(int[] prices) {
		int mini = prices[0];
		int maxProfit = 0;

		for (int i = 1; i < prices.length; i++) {
			int cost = prices[i] - mini;
			maxProfit = Math.max(maxProfit, cost);
			mini = Math.min(prices[i], mini);
		}

		return maxProfit;
	}

	// TC=o(N2) TLE
	public static int maxProfit(int[] prices) {
		int maxProfit = -1;

		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] >= prices[i]) {
					int currProfit = prices[j] - prices[i];
					maxProfit = Math.max(maxProfit, currProfit);
				}
			}
		}
		return maxProfit;
	}
}
