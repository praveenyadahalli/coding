package maang20;

import java.util.Arrays;
//leetcode : 14
public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] s= {"ab","a"};
		System.out.println(longestCommonPrefix(s));
	}
	
	// TC = O(n log n * m) SC=O(1)
	public static String llongestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
		StringBuilder sb=new StringBuilder();
		String first = strs[0];
		String last = strs[strs.length-1];
		for(int i=0;i<Math.min(first.length(), last.length());i++) {
			if(first.charAt(i)!=strs[i].charAt(i)) {
				return sb.toString();
			}
			sb.append(first.charAt(i));
		}
		return sb.toString();
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}

		if (strs.length == 1) {
			return strs[0];
		}

		// Queue<Character> letters=new LinkedList<>();
		// for(Character c:first.toCharArray()){
		// letters.add(c);
		// }
		boolean isPresent = true;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strs[0].length(); i++) {

			char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				String testString = strs[j];
				int len = testString.length();
				if (len > i) {
					if (testString.charAt(i) != c) {
						isPresent = false;
						break;
					}
				}else {
					isPresent=false;
				}

			}
			if (isPresent) {
				sb.append(c);
			} else {
				break;
			}
		}

		return sb.toString();
	}
}
