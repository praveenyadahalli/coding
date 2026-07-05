package maang20;

import java.util.*;
// leetcode : 347
public class TopKFrequentElement {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		for (Integer i : topKFrequent(arr, k)) {
			System.out.println(i);
		}
	}

	// Note: problem should be solved in less that O(nlogn) as TC
	public static int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		PriorityQueue<int[]> minheap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
		int[] ans = new int[k];
		int j = 0;

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			minheap.add(new int[] { entry.getValue(), entry.getKey() });

			if (minheap.size() > k) {
				minheap.poll();
			}
		}

		while (!minheap.isEmpty()) {
			int[] arr = minheap.poll();
			ans[j++] = arr[1];
		}

		return ans;
	}
}
