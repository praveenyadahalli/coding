package tree.dfs;

import tree.TreeNode;
import java.util.*;

public class MaxLevelSum {
	public static void main(String[] args) {

		TreeNode node =  new TreeNode(-100);
		node.left = new TreeNode(-200);
		node.right = new TreeNode(-300);
		node.left.right = new TreeNode(-20);
		node.left.left = new TreeNode(-5);
		node.right.left = new TreeNode(-10);
		System.out.println("Max Level Sum: "+maxLevelSum(node));
	}
	
	public static int maxLevelSum(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		if (root == null) {
			return 0;
		}

		int maxSum = Integer.MIN_VALUE, maxLevel = 0;
		int count=1;
		queue.offer(root);
		while (!queue.isEmpty()) {
			int level = queue.size();
			List<Integer> subList = new ArrayList<>();
			for (int i = 0; i < level; i++) {
				if (queue.peek().left != null) {
					queue.offer(queue.peek().left);
				}
				if (queue.peek().right != null) {
					queue.offer(queue.peek().right);
				}
				subList.add(queue.poll().val);
			}
			int sum = 0;
			for (int i : subList) {
				sum += i;
			}
			if (sum > maxSum) {
				maxSum = sum;
				maxLevel = count;
			}
			count++;
		}
		return maxLevel;
	}
}
