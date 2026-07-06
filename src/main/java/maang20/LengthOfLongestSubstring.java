package maang20;

import java.util.*;

// leetcode : 3
public class LengthOfLongestSubstring {
	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(llengthOfLongestSubstring(s));
	}

	//TC=O(N), SC=O(N)
	public static int llengthOfLongestSubstring(String s) {
		int n = s.length();
		int res = 0;
		int left = 0;

		Set<Character> charSet = new HashSet<>();

		for (int right = 0; right < n; right++) {
			while (charSet.contains(s.charAt(right))) {
				charSet.remove(s.charAt(left));
				left++;
			}
			charSet.add(s.charAt(right));
			res = Math.max(res, right - left + 1);
		}
		return res;
	}

	// TC=O(N2), contains method TC in queue = O(N)
	public static int lengthOfLongestSubstring(String s) {
		Queue<Character> symbols = new LinkedList<>();
		if (s.length() == 0) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		for (Character c : s.toCharArray()) {
			while (symbols.contains(c)) {
				symbols.poll();
			}
			symbols.offer(c);
			max = Math.max(max, symbols.size());
		}
		return max;
	}
}
