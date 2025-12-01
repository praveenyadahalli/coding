package tree.dfs;
import java.util.*;
import tree.TreeNode;
import tree.bfs.InOrderTraversal;

public class LevelOrderTraversal {
	public static void main(String[] args) {
		TreeNode node =  new TreeNode(989);
		node.right = new TreeNode(10250);
		node.right.left = new TreeNode(98693);
		node.right.right = new TreeNode(-89388);
		node.right.right.right = new TreeNode(-32127);

		System.out.println("Depth First Search Traversal of the Tree is ");
		List<List<Integer>> list = levelOrder(node);
		System.out.println("Depth First Search Traversal of the Tree is ");
	}
	public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> myList = new LinkedList<List<Integer>>();
        if (root == null) {
            return myList;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for (int i = 0; i < level; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }

                subList.add(queue.poll().val);
            }
            myList.add(subList);
        }
        return myList;
    }
}
