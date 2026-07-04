package maang20;
import java.util.*;

//leetcode:1
public class TwoSum {

	public static void main(String[] args) {
		int target=9;
		int[] arr= {2,7,11,15};
		for(int k:getSumIndices(arr, target)) {
			System.out.println(k);
		}
	}
	
	// sc=O(n), tc=O(n)
	public static int[] getSumIndices(int[] arr, int target) {
		//  arr value, index value
		Map<Integer,Integer> map =new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int k=target-arr[i];
			if(map.containsKey(k)) {
				return new int[] {map.get(k),i};
			}else {
				map.put(arr[i], i);
			}
				
		}
		return new int[] {};
	}

}
