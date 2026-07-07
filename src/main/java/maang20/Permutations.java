package maang20;
import java.util.*;

//leetcode: 46
public class Permutations {
	public static void main(String[] args) {
		int[] nums= {1,2,3};
		for(List<Integer> list:permute(nums)) {
			for(Integer i:list) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	// tc=o(n*n!) sc=o(n*n!)
	public static List<List<Integer>> permute(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		boolean[] used = new boolean[nums.length];
		backtrack(nums,used,new ArrayList<>(),result);
		return result;
	}
	
	private static void backtrack(int[] nums,boolean[] used, List<Integer> current, List<List<Integer>> result) {
		if(current.size()==nums.length) {
			result.add(new ArrayList<>(current));
			return;
		}
		
		for(int i=0;i<nums.length;i++) {
			if(used[i]) {
				continue;
			}
			
			// Choose
			used[i] = true;
			current.add(nums[i]);
			
			// explore
			backtrack(nums,used,current,result);
			
			//undo
			current.remove(current.size()-1);
			used[i]=false;
		}
		
	}
}
